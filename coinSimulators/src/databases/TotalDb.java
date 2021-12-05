package databases;

import java.sql.*;

public class TotalDb {

    private static Connection con;
    private static Statement stmt;

    public static void yeniVtOlustur() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:totaldb.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists VERILER "
                    + "(TOTAL INT  NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int total = 0;

    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from veriler");
            while (rs.next()) {
                total = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Ekle() {
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into veriler values('%d')", 10000);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Guncelle(int totalCount) {


        try {
            Listele();

            String sorgu = String.format("update veriler set TOTAL='%d'", totalCount);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıtlar Güncellendi");
            total = totalCount;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("databases.TotalDb.Guncelle()");
        }
    }


    public static void main(String[] args) {
        try {
            yeniVtOlustur();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
