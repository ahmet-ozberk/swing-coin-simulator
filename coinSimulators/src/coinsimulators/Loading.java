package coinsimulators;

import databases.AssetsDatabase;
import databases.CoinsDatabase;
import databases.DatabaseProcess;
import databases.ItemsDatabase;
import databases.TotalDb;
import databases.UserItems;
import java.awt.Dimension;
import javax.swing.*;

public class Loading extends JFrame {

    // create a frame
    static JFrame f;

    static JProgressBar b;

    static JLabel l;

    public static void main(String[] args) {

        // create a frame
        f = new JFrame("Simülasyon Yükleniyor..");

        f.setLocation(500, 300);

        l = new JLabel();

        // create a panel
        JPanel p = new JPanel();
        Dimension size = l.getPreferredSize();
        l.setBounds(0, 0, size.width, size.height);

        // create a progressbar
        b = new JProgressBar();

        // set initial value
        b.setValue(0);
        l.setText("Yükleniyor....");

        b.setStringPainted(true);

        // add progressbar
        p.add(b);
        p.add(l);

        // add panel
        f.add(p);

        // set the size of the frame
        f.setSize(500, 60);
        f.setVisible(true);

        fill();
    }

    // function to increase progress
    public static void fill() {
        int i = 0;
        try {
            while (i <= 100) {
                // fill the menu bar
                b.setString("");
                b.setValue(i + 1);
                l.setText("  % " + (i) + " yükleniyor..");

                // delay the thread
                Thread.sleep(10);
                i += 1;
            }
            String[] list = new String[0];
            DatabaseProcess.main(list);
            DatabaseProcess.Listele();
            UserItems.main(list);
            UserItems.Listele();
            TotalDb.main(list);
            TotalDb.Listele();
            CoinsDatabase.main(list);
            AssetsDatabase.main(list);
            AssetsDatabase.Listele();
            if(DatabaseProcess.userName == null){
                CoinsDatabase.Ekle();
                AssetsDatabase.Ekle();
                TotalDb.Ekle();
            }
            CoinsDatabase.Listele();
            ItemsDatabase.main(list);
            ItemsDatabase.Ekle();
            ItemsDatabase.Listele();
            f.setVisible(false);
            f.dispose();
            if (DatabaseProcess.userName != null) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
            } else {
                System.out.println("Null");
                MainClass mainClass = new MainClass();
                mainClass.setVisible(true);
            }
        } catch (Exception e) {
        }
    }
}
