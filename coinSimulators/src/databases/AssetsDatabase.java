package databases;

import java.sql.*;

public class AssetsDatabase {

    private static Connection con;
    private static Statement stmt;

    public static void yeniVtOlustur(String dosyaadi) throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:assets.db");
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

    public static int[] coinsValue = new int[6];
    public static String[] coinsName = {"Bitcoin", "Ethereum", "Tether", "Solana", "Cardano", "Binance"};

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
                //System.out.println(coinsValue[0]+"::"+coinsValue[1]+"::"+coinsValue[2]+"::"+coinsValue[3]+"::"+coinsValue[4]+"::"+coinsValue[5]);
            }

        } catch (Exception e) {
            System.out.println(e);
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
        }
    }

    public static void Guncelle(int bitcoin, int ethereum, int tether, int solana, int cardano, int binance) {

        int bitcoinn =  bitcoin;
        int ethereumm = ethereum;
        int tetherr =  tether;
        int solanaa = solana;
        int cardanoo =  cardano;
        int binancee =  binance;

        try {
            Listele();

            String sorgu = String.format("update veriler set BITCOIN='%d',ETHEREUM='%d',TETHER='%d',SOLANA='%d',CARDANO='%d',BINANCE='%d'", bitcoinn, ethereumm, tetherr, solanaa, cardanoo, binancee);

            Statement stmt = con.createStatement();
            int guncelleme = stmt.executeUpdate(sorgu);
            System.out.println("Kayıtlar Güncellendi");
            coinsValue[0] = bitcoinn;
            coinsValue[1] = ethereumm;
            coinsValue[2] = tetherr;
            coinsValue[3] = solanaa;
            coinsValue[4] = cardanoo;
            coinsValue[5] = binancee;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("databases.CoinsDatabase.Guncelle()");
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
