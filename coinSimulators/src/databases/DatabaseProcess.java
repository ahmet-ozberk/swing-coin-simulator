package databases;
import java.sql.*;
import java.util.Scanner;

public class DatabaseProcess {

    private static Connection con;
    private static Statement stmt;

    public static void yeniVtOlustur(String dosyaadi) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:deneme.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists OGRENCI "
                    + "(OGRNO INT PRIMARY KEY NOT NULL,"
                    + " OGRAD  CHAR(50) NOT NULL, "
                    + " OGRSOYAD CHAR(50) NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ogrenci");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Ekle() {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        System.out.print("Yeni Öğrenci No     :");
        int yenino = scan.nextInt();
        System.out.print("Yeni Öğrenci Adı    :");
        String ad = scan.next();
        System.out.print("Yeni Öğrenci Soyadı :");
        String soyad = scan.next();
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into ogrenci values( %d, '%s','%s')", yenino, ad, soyad);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Guncelle() {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            Listele();
            System.out.print("Öğrenci Numarasını Girin:");
            int eskino = scan.nextInt();
            System.out.print("Yeni Öğrenci No     :");
            int yenino = scan.nextInt();
            System.out.print("Yeni Öğrenci Adı    :");
            String ad = scan.next();
            System.out.print("Yeni Öğrenci Soyadı :");
            String soyad = scan.next();

            String sorgu = String.format("update ogrenci set ogrno=%d, ograd='%s',ogrsoyad='%s' where ogrno=%d ", yenino, ad, soyad, eskino);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıtlar Güncellendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Sil() {
        Scanner scan = new Scanner(System.in, "iso-8859-9");
        try {
            Listele();
            System.out.print("Öğrenci Numarasını Girin:");
            int eskino = scan.nextInt();

            String sorgu = String.format("delete from ogrenci where ogrno=%d", eskino);
            Statement stmt = con.createStatement();
            int silindi = stmt.executeUpdate(sorgu);
            System.out.println("Kayıtlar Silindi");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static String vtAd;

    public static void main(String[] args) {
        vtAd = "deneme.db";
        /*veritabanı yoksa oluşturur varsa bağlanır*/
        try {
            yeniVtOlustur(vtAd);
        } catch (Exception e) {
            System.out.println(e);
        }

        Scanner scan = new Scanner(System.in, "iso-8859-9");
        int secim;

        while (true) {
            System.out.println("*************");
            System.out.println("1.Listele");
            System.out.println("2.Ekle");
            System.out.println("3.Güncelle");
            System.out.println("4.Sil");
            System.out.println("5.Çıkış");
            System.out.print("Seçiminiz:");
            secim = scan.nextInt();

            System.out.println("*************");

            if (secim == 1) {
                Listele();
            }
            if (secim == 2) {
                Ekle();
            }
            if (secim == 3) {
                Guncelle();
            }
            if (secim == 4) {
                Sil();
            }
            if (secim == 5) {
                try {
                    stmt.close();
                    con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

                break;
            }
        }
    }
}
