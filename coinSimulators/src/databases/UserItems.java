package databases;

import java.sql.*;

public class UserItems {

    private static Connection con;
    private static Statement stmt;

    public static void yeniVtOlustur() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:useritems.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists VERILER "
                    + "(mulk    NOT NULL,"
                    + "araba    NOT NULL,"
                    + "gemi    NOT NULL,"
                    + "pc   NOT NULL,"
                    + "market     NOT NULL,"
                    + " otel   INT     NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("user items"+e.getMessage());
        }
    }
    public static int mulk;
    public static int araba;
    public static int gemi;
    public static int pc;
    public static int market;
    public static int otel;

    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from veriler");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4) + "  " + rs.getInt(5) + "  " + rs.getInt(6));
                mulk = rs.getInt(1);
                araba = rs.getInt(2);
                gemi = rs.getInt(3);
                pc = rs.getInt(4);
                market = rs.getInt(5);
                otel = rs.getInt(6);
            }

        } catch (Exception e) {
            System.out.println(e);
                        System.out.println("user items listele "+e.getMessage());

        }

    }

    public static void Ekle() {
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into veriler values('%d', '%d', '%d','%d', '%d', '%d')", 0, 0, 0, 0, 0, 0);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
                        System.out.println("user items ekle"+e.getMessage());

        }
    }

    public static void Guncelle(int mulkt, int arabat, int gemit, int pct, int markett, int otelt) {
        try {
            Listele();
            String sorgu = String.format("update veriler set mulk='%d',araba='%d',gemi='%d',pc='%d',market='%d',otel='%d'", mulkt, arabat, gemit, pct, markett, otelt);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            mulk = mulkt;
            araba = arabat;
            gemi = gemit;
            pc = pct;
            market = markett;
            otel = otelt;
            
            System.out.println("Kayıtlar Güncellendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String vtAd;

    public static void main(String[] args) {
        try {
            yeniVtOlustur();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
