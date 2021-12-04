package databases;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class ItemsDatabase {
    private static Connection con;
    private static Statement stmt;
    public static void yeniVtOlustur(String dosyaadi) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:items.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists VERILER "
                    + "(MULK INT  NOT NULL,"
                    + " ARABA  INT NOT NULL, "
                    + " GEMI  INT NOT NULL, "
                    + " BILGISAYAR  INT NOT NULL, "
                    + " MARKET  INT NOT NULL, "
                    + " OTEL   INT NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int mulk;
    public static int araba;
    public static int gemi;
    public static int bilgisayar;
    public static int market;
    public static int otel;
    
    public static int[] itemsValue = new int[6];
    public static String[] itemsName = {"Mülk","Araba","Gemi","Bilgisayar","Market","Otel"};
    
    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from veriler");
            while (rs.next()) {
                itemsValue[0] = rs.getInt(1);
                itemsValue[1] = rs.getInt(2);
                itemsValue[2] = rs.getInt(3);
                itemsValue[3] = rs.getInt(4);
                itemsValue[4] = rs.getInt(5);
                itemsValue[5] = rs.getInt(6);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Ekle() {
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into veriler values('%d', '%d', '%d','%d', '%d', '%d')",350000, 85000, 950000,2000,250000,1200000);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String vtAd;

    public static void main(String[] args) {
        vtAd = "items.db";
        try {
            yeniVtOlustur(vtAd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
