package coinsimulators;

import databases.AssetsDatabase;
import databases.CoinsDatabase;
import databases.DatabaseProcess;
import databases.TotalDb;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ahmet
 */
public class HomePage extends javax.swing.JFrame {

    CoinsDatabase coins = new CoinsDatabase();
    DatabaseProcess db = new DatabaseProcess();
    AssetsDatabase assets = new AssetsDatabase();
    TotalDb totalDb = new TotalDb();
    public HomePage() {
        initComponents();
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        super.setLocation(dx, dy);
        DatabaseProcess.Listele();
        AssetsDatabase assets = new AssetsDatabase();
        userPrice.setText("Toplam Para: " + DatabaseProcess.priceValue + " $" +"  |  Ana Para: "+totalDb.total+" $");
        //WindowTitle();
        super.setTitle("Coin Simulator");
        DefaultTableModel tblModel = (DefaultTableModel) coinTable.getModel();
        coins.Listele();
        for (int i = 0; i < 6; i++) {
            String tbData[] = {"  " + coins.coinsName[i], "  " + coins.coinsValue[i]};
            tblModel.addRow(tbData);
        }
        JTableHeader tableHeader = coinTable.getTableHeader();
        tableHeader.setBackground(Color.GRAY.brighter());
        tableHeader.setForeground(Color.white);
        Font headerFont = new Font("Verdana", Font.CENTER_BASELINE, 16);
        tableHeader.setFont(headerFont);
        
        ////// VARLIKLARIM TABLOSU
        DefaultTableModel tblModel2 = (DefaultTableModel) varliklarim.getModel();
        assets.Listele();
        for (int i = 0; i < 6; i++) {
            String tbData2[] = {"  " + assets.coinsName[i], "  " + assets.coinsValue[i]};
            tblModel2.addRow(tbData2);
        }
        JTableHeader tableHeader2 = varliklarim.getTableHeader();
        tableHeader2.setBackground(Color.GRAY.brighter());
        tableHeader2.setForeground(Color.white);
        Font headerFont2 = new Font("Verdana", Font.CENTER_BASELINE, 16);
        tableHeader2.setFont(headerFont2);
        //////////////////////////
        artir();

    }

    public void artir() {
        Timer timer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                int sayi1 = rand.nextInt(50);
                int sayi2 = rand.nextInt(50);
                int sayi3 = rand.nextInt(50);
                int sayi4 = rand.nextInt(50);
                int sayi5 = rand.nextInt(50);
                int sayi6 = rand.nextInt(50);

                Boolean durum1 = rand.nextBoolean();
                Boolean durum2 = rand.nextBoolean();
                Boolean durum3 = rand.nextBoolean();
                Boolean durum4 = rand.nextBoolean();
                Boolean durum5 = rand.nextBoolean();
                Boolean durum6 = rand.nextBoolean();
                Boolean[] sayiDizi = {durum1, durum2, durum3, durum4, durum5, durum6};

                coins.Guncelle(((durum1) ? sayi1 : -sayi1), ((durum2) ? sayi2 : -sayi2), ((durum3) ? sayi3 : -sayi3), ((durum4) ? sayi4 : -sayi4), ((durum5) ? sayi5 : -sayi5), ((durum6) ? sayi6 : -sayi6));

                DefaultTableModel tblModel = (DefaultTableModel) coinTable.getModel();
                tblModel.setRowCount(0);
                coins.Listele();
                for (int i = 0; i < 6; i++) {
                    //  "  ⬇  ⬆"
                    String tbData[] = {"  " + coins.coinsName[i], "  " + coins.coinsValue[i] + (sayiDizi[i] ? "  ⬆" : "  ⬇")};

                    tblModel.addRow(tbData);
                    
                }
                int lastValue = 0;
                for(int i = 0;i<6;i++){
                    lastValue += coins.coinsValue[i]*assets.coinsValue[i];
                }
                
                db.Guncelle(lastValue+totalDb.total);
                
                userPrice.setText("Toplam Para: " + DatabaseProcess.priceValue + " $" +"  |  Ana Para: "+totalDb.total+" $");
            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userPrice = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coinTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        islemsec = new javax.swing.JComboBox<>();
        ilkhesap = new javax.swing.JTextField();
        ikincihesap = new javax.swing.JTextField();
        islemdurumu = new javax.swing.JLabel();
        sonucugor = new javax.swing.JButton();
        hesapsonucu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        varliklarim = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setLocationByPlatform(true);
        setResizable(false);

        userPrice.setFont(new java.awt.Font("Montserrat", 1, 13)); // NOI18N
        userPrice.setForeground(new java.awt.Color(153, 102, 0));
        userPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userPrice.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/para.png")); // NOI18N
        userPrice.setText("Para");

        buyButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        buyButton.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/al.png")); // NOI18N
        buyButton.setText("   Coin Al");
        buyButton.setToolTipText("Coin alışverişinizi yapın");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/profile.png")); // NOI18N
        jButton2.setText("Profilim");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sellButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        sellButton.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/sat.png")); // NOI18N
        sellButton.setText("   Coin Sat");
        sellButton.setToolTipText("Coin alışverişinizi yapın");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        coinTable.setBackground(new java.awt.Color(204, 255, 204));
        coinTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        coinTable.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        coinTable.setForeground(new java.awt.Color(102, 102, 102));
        coinTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coin İsmi", "Coin Fiyatı ( $ )"
            }
        ));
        coinTable.setToolTipText("Güncel Coin Kuru Tablosu");
        coinTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coinTable.setEditingRow(-5);
        coinTable.setEnabled(false);
        coinTable.setGridColor(new java.awt.Color(153, 153, 0));
        coinTable.setRowHeight(25);
        coinTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        coinTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        coinTable.setShowGrid(true);
        jScrollPane1.setViewportView(coinTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/coinkuru.png")); // NOI18N
        jLabel1.setText("  Coin Kuru");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/calc.png")); // NOI18N
        jLabel2.setText(" Hesapla");

        islemsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Topla", "Çıkar", "Çarp", "Böl" }));
        islemsec.setToolTipText("Lütfen bir işlem seçin");
        islemsec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                islemsecİtemStateChanged(evt);
            }
        });

        ilkhesap.setBackground(new java.awt.Color(238, 238, 238));
        ilkhesap.setToolTipText("İlk sayıyı girin");
        ilkhesap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İlk Değer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(204, 51, 0))); // NOI18N
        ilkhesap.setOpaque(true);

        ikincihesap.setBackground(new java.awt.Color(238, 238, 238));
        ikincihesap.setToolTipText("İkinci sayıyı girin");
        ikincihesap.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İkinci Değer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(204, 51, 0))); // NOI18N

        islemdurumu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        islemdurumu.setText("+");

        sonucugor.setText("Sonucu Gör");
        sonucugor.setToolTipText("Belirttiğiniz işlemin sonucunu hesaplayın");
        sonucugor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonucugorActionPerformed(evt);
            }
        });

        hesapsonucu.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/wallet.png")); // NOI18N
        jLabel3.setText("Varlıklarım");

        varliklarim.setBackground(new java.awt.Color(204, 255, 204));
        varliklarim.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 0))); // NOI18N
        varliklarim.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        varliklarim.setForeground(new java.awt.Color(102, 102, 102));
        varliklarim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coin İsmi", "Adet"
            }
        ));
        varliklarim.setToolTipText("Varlıklarım");
        varliklarim.setEnabled(false);
        varliklarim.setGridColor(new java.awt.Color(153, 153, 0));
        varliklarim.setRowHeight(25);
        jScrollPane2.setViewportView(varliklarim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(userPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(islemsec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ilkhesap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(islemdurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ikincihesap, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sonucugor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hesapsonucu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(userPrice))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(islemsec, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ilkhesap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ikincihesap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(islemdurumu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sonucugor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hesapsonucu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void islemsecİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_islemsecİtemStateChanged
        switch (islemsec.getSelectedIndex()) {
            case 0:
                islemdurumu.setText("+");
                break;
            case 1:
                islemdurumu.setText("-");
                break;
            case 2:
                islemdurumu.setText("x");
                break;
            case 3:
                islemdurumu.setText("/");
                break;
        }   // TODO add your handling code here:
    }//GEN-LAST:event_islemsecİtemStateChanged

    private void sonucugorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonucugorActionPerformed
        if (ilkhesap.getText().isEmpty() && ikincihesap.getText().isEmpty()) {
            hesapsonucu.setText("Hatalı giriş!!");
            islemsec.addItem("deneme");
        } else {
            try {
                int i = Integer.parseInt(ilkhesap.getText());
                int k = Integer.parseInt(ikincihesap.getText());
                switch (islemsec.getSelectedIndex()) {
                    case 0:
                        hesapsonucu.setText("Sonuç: " + (i + k));
                        break;
                    case 1:
                        hesapsonucu.setText("Sonuç: " + (i - k));
                        break;
                    case 2:
                        hesapsonucu.setText("Sonuç: " + (i * k));
                        break;
                    case 3:
                        hesapsonucu.setText("Sonuç: " + (i / k));
                        break;
                }
            } catch (Exception e) {
                hesapsonucu.setText("Hatalı giriş!!\n");
            }
        }
    }//GEN-LAST:event_sonucugorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        super.setVisible(false);
        super.dispose();
        ProfilePage profile = new ProfilePage();
        profile.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        super.setVisible(false);
        super.dispose();
        BuyCoin buyCoin = new BuyCoin();
        buyCoin.setVisible(true);
    }//GEN-LAST:event_buyButtonActionPerformed

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        super.setVisible(false);
        super.dispose();
        SellCoin sellCoin = new SellCoin();
        sellCoin.setVisible(true);
    }//GEN-LAST:event_sellButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JTable coinTable;
    private javax.swing.JLabel hesapsonucu;
    private javax.swing.JTextField ikincihesap;
    private javax.swing.JTextField ilkhesap;
    private javax.swing.JLabel islemdurumu;
    private javax.swing.JComboBox<String> islemsec;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton sonucugor;
    private javax.swing.JLabel userPrice;
    private javax.swing.JTable varliklarim;
    // End of variables declaration//GEN-END:variables
}
