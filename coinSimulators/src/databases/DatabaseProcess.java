package databases;
import java.sql.*;

public class DatabaseProcess {
    private static Connection con;
    private static Statement stmt;
    public static void yeniVtOlustur(String dosyaadi) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists VERILER "
                    + "(NO INT PRIMARY KEY     NOT NULL,"
                    + " USERNAME  CHAR(50)    NOT NULL, "
                    + " PRICE   INT     NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int priceValue;
    public static String userName;
    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from veriler");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
                priceValue = rs.getInt(3);
                userName = rs.getString(2);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Ekle(int no,String kullaniciAdi, int para) {
        int number = no;
        String username = kullaniciAdi;
        int price = para;
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into veriler values('%d', '%s', '%d')",number, username, price);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Guncelle(int para) {
  
        try {
            Listele();
       

            String sorgu = String.format("update veriler set PRICE='%d'", para);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            priceValue = para;
            System.out.println("Kayıtlar Güncellendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
        public static void GuncelleUsername(String isim) {
        String yeniIsim = isim;
        try {
            Listele();

            String sorgu = String.format("update veriler set USERNAME='%s'", yeniIsim);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            userName = isim;
            System.out.println("Kayıtlar Güncellendi");
            Listele();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String vtAd;

    public static void main(String[] args) {
        vtAd = "database.db";
        /*veritabanı yoksa oluşturur varsa bağlanır*/
        try {
            yeniVtOlustur(vtAd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}