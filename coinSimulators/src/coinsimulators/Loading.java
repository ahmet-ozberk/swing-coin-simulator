package coinsimulators;

import databases.CoinsDatabase;
import databases.DatabaseProcess;
import java.awt.Dimension;
import javax.swing.*;

public class Loading extends JFrame {

    // create a frame
    static JFrame f;

    static JProgressBar b;

    static JLabel l;

    public static void main(String[] args) {

        // create a frame
        f = new JFrame("Uygulama Yükleniyor..");

        f.setLocation(500, 200);

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
            CoinsDatabase.main(list);
            CoinsDatabase.Ekle();
            CoinsDatabase.Listele();
            f.setVisible(false);
            f.dispose();
            if (DatabaseProcess.userName != null) {
                System.out.println("Null Değil");
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
