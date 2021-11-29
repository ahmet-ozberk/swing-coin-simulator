package databases;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class CoinsDatabase {
    private static Connection con;
    private static Statement stmt;
    public static void yeniVtOlustur(String dosyaadi) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:coins.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists VERILER "
                    + "(BITCOIN INT  NOT NULL,"
                    + " ETHEREUM  INT NOT NULL, "
                    + " TETHER  INT NOT NULL, "
                    + " SOLANA  INT NOT NULL, "
                    + " CARDANO  INT NOT NULL, "
                    + " BINANCE   INT NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int bitcoin;
    public static int ethereum;
    public static int tether;
    public static int solana;
    public static int cardano;
    public static int binance;
    
    public static int[] coinsValue = new int[6];
    public static String[] coinsName = {"Bitcoin","Ethereum","Tether","Solana","Cardano","Binance"};
    
    public static void Listele() {
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from veriler");
            while (rs.next()) {
                coinsValue[0] = rs.getInt(1);
                coinsValue[1] = rs.getInt(2);
                coinsValue[2] = rs.getInt(3);
                coinsValue[3] = rs.getInt(4);
                coinsValue[4] = rs.getInt(5);
                coinsValue[5] = rs.getInt(6);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void Ekle() {
        try {
            Statement stmt = con.createStatement();
            String sorgu = String.format("insert into veriler values('%d', '%d', '%d','%d', '%d', '%d')",64000, 23000, 5467,3466,2435,7645);
            int ekleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıt Eklendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Guncelle(int coin) {
        int price = coin;
        try {
            Listele();
            int yenino = price;

            String sorgu = String.format("update veriler set PRICE='%d'", price);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıtlar Güncellendi");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    static String vtAd;

    public static void main(String[] args) {
        vtAd = "coins.db";
        try {
            yeniVtOlustur(vtAd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
