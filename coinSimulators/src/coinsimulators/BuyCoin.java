/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coinsimulators;

import databases.AssetsDatabase;
import databases.CoinsDatabase;
import databases.DatabaseProcess;
import databases.TotalDb;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmet
 */
public class BuyCoin extends javax.swing.JFrame {

    /**
     * Creates new form BuyCoin
     */
    DatabaseProcess db = new DatabaseProcess();
    CoinsDatabase coins = new CoinsDatabase();
    AssetsDatabase assets = new AssetsDatabase();
    TotalDb totalDb = new TotalDb();

    public BuyCoin() {
        initComponents();
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        super.setLocation(dx, dy);
        param.setText("Ana Para: "+totalDb.total + " $");
        adet.setEnabled(false);

    }

    private void adetChg() {
        adet.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        param = new javax.swing.JLabel();
        bitcoin = new javax.swing.JRadioButton();
        ethereum = new javax.swing.JRadioButton();
        tether = new javax.swing.JRadioButton();
        solana = new javax.swing.JRadioButton();
        cardano = new javax.swing.JRadioButton();
        binance = new javax.swing.JRadioButton();
        totalPrice = new javax.swing.JLabel();
        adet = new javax.swing.JSpinner();
        satinAl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coin Al");

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/back.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        param.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        group.add(bitcoin);
        bitcoin.setText("Bitcoin");
        bitcoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinActionPerformed(evt);
            }
        });

        group.add(ethereum);
        ethereum.setText("Ethereum");
        ethereum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ethereumActionPerformed(evt);
            }
        });

        group.add(tether);
        tether.setText("Tether");
        tether.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tetherActionPerformed(evt);
            }
        });

        group.add(solana);
        solana.setText("Solana");
        solana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solanaActionPerformed(evt);
            }
        });

        group.add(cardano);
        cardano.setText("Cardano");
        cardano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cardano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardanoActionPerformed(evt);
            }
        });

        group.add(binance);
        binance.setText("Binance");
        binance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binanceActionPerformed(evt);
            }
        });

        totalPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(204, 51, 0));
        totalPrice.setText("Toplam Tutar:");

        adet.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        adet.setToolTipText("Seçilen Coin Adeti");
        adet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adet", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(102, 204, 0))); // NOI18N
        adet.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                adetStateChanged(evt);
            }
        });

        satinAl.setText("Satın Al");
        satinAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satinAlActionPerformed(evt);
            }
        });

        jLabel1.setText("Not: Almak istediğiniz coinin ana paranızdan fazla olmadığına");

        jLabel2.setText("emin olun.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(satinAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(param, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(totalPrice))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(solana)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cardano)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(binance))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(bitcoin)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ethereum)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(tether)))
                                            .addGap(18, 18, 18)
                                            .addComponent(adet, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(param, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bitcoin)
                            .addComponent(ethereum)
                            .addComponent(tether))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solana)
                            .addComponent(cardano)
                            .addComponent(binance)))
                    .addComponent(adet, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(satinAl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.setVisible(false);
        super.dispose();
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bitcoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitcoinActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[0] * Integer.parseInt(adet.getValue().toString()) + " $");

    }//GEN-LAST:event_bitcoinActionPerformed

    private void ethereumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ethereumActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[1] * Integer.parseInt(adet.getValue().toString()) + " $");
    }//GEN-LAST:event_ethereumActionPerformed

    private void tetherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tetherActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[2] * Integer.parseInt(adet.getValue().toString()) + " $");
    }//GEN-LAST:event_tetherActionPerformed

    private void solanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solanaActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[3] * Integer.parseInt(adet.getValue().toString()) + " $");
    }//GEN-LAST:event_solanaActionPerformed

    private void cardanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardanoActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[4] * Integer.parseInt(adet.getValue().toString()) + " $");
    }//GEN-LAST:event_cardanoActionPerformed

    private void binanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binanceActionPerformed
        adetChg();
        totalPrice.setText("Toplam Tutar: " + coins.coinsValue[5] * Integer.parseInt(adet.getValue().toString()) + " $");
    }//GEN-LAST:event_binanceActionPerformed

    private void adetStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_adetStateChanged
        if (bitcoin.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[0] * Integer.parseInt(adet.getValue().toString()) + " $");
        } else if (ethereum.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[1] * Integer.parseInt(adet.getValue().toString()) + " $");
        } else if (tether.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[2] * Integer.parseInt(adet.getValue().toString()) + " $");
        } else if (solana.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[3] * Integer.parseInt(adet.getValue().toString()) + " $");
        } else if (cardano.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[4] * Integer.parseInt(adet.getValue().toString()) + " $");
        } else if (binance.isSelected()) {
            totalPrice.setText("Toplam Tutar: " + coins.coinsValue[5] * Integer.parseInt(adet.getValue().toString()) + " $");
        }
    }//GEN-LAST:event_adetStateChanged

    private void satinAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satinAlActionPerformed
        if (bitcoin.isSelected()) {
            uyari(coins.coinsValue[0] * Integer.parseInt(adet.getValue().toString()), 0);
        } else if (ethereum.isSelected()) {
            uyari(coins.coinsValue[1] * Integer.parseInt(adet.getValue().toString()), 1);
        } else if (tether.isSelected()) {
            uyari(coins.coinsValue[2] * Integer.parseInt(adet.getValue().toString()), 2);
        } else if (solana.isSelected()) {
            uyari(coins.coinsValue[3] * Integer.parseInt(adet.getValue().toString()), 3);
        } else if (cardano.isSelected()) {
            uyari(coins.coinsValue[4] * Integer.parseInt(adet.getValue().toString()), 4);
        } else if (binance.isSelected()) {
            uyari(coins.coinsValue[5] * Integer.parseInt(adet.getValue().toString()), 5);
        }
    }//GEN-LAST:event_satinAlActionPerformed
    public void degistir(int yeniPara) {
        db.Guncelle(yeniPara);
        DatabaseProcess.priceValue = yeniPara;
    }
    int toplamPara = db.priceValue;
    int anaPara = toplamPara - 0;
    int birCoinParası = 2000;
    int coinAdeti = 2;
    int toplamCoinParasi = birCoinParası * coinAdeti;

    public void uyari(int value, int index) {

        if (value > totalDb.total) {
            JOptionPane.showMessageDialog(null, "Ana paranız bu coini alabilmek yeterli değil! Coin bozdurarak ana paranızı arttırabilirsiniz.",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        } else {
            //totalDb.total += value;
            //int yeniPara = db.priceValue - value;
            // System.out.println("Yeni: " + yeniPara + " value: " + value);

            if (index == 0) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[0];
                assets.Guncelle(val, assets.coinsValue[1], assets.coinsValue[2], assets.coinsValue[3], assets.coinsValue[4], assets.coinsValue[5]);
                toplamCoinParasi = val * coins.coinsValue[0];
                anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            } else if (index == 1) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[1];
                assets.Guncelle(assets.coinsValue[0], val, assets.coinsValue[2], assets.coinsValue[3], assets.coinsValue[4], assets.coinsValue[5]);
                
                toplamCoinParasi = val * coins.coinsValue[1];
                anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            } else if (index == 2) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[2];
                assets.Guncelle(assets.coinsValue[0], assets.coinsValue[1], val, assets.coinsValue[3], assets.coinsValue[4], assets.coinsValue[5]);
                
                toplamCoinParasi = val * coins.coinsValue[2];
                               anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            } else if (index == 3) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[3];
                assets.Guncelle(assets.coinsValue[0], assets.coinsValue[1], assets.coinsValue[2], val, assets.coinsValue[4], assets.coinsValue[5]);
                
                toplamCoinParasi = val * coins.coinsValue[3];
                        anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            } else if (index == 4) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[4];
                assets.Guncelle(assets.coinsValue[0], assets.coinsValue[1], assets.coinsValue[2], assets.coinsValue[3], val, assets.coinsValue[5]);
                
                toplamCoinParasi = val * coins.coinsValue[4];
                            anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            } else if (index == 5) {
                int val = Integer.parseInt(adet.getValue().toString()) + assets.coinsValue[5];
                assets.Guncelle(assets.coinsValue[0], assets.coinsValue[1], assets.coinsValue[2], assets.coinsValue[3], assets.coinsValue[4], val);
                
                toplamCoinParasi = val * coins.coinsValue[5];
                             anaPara = db.priceValue - toplamCoinParasi;
                totalDb.Guncelle(anaPara);
                toplamPara = totalDb.total + toplamCoinParasi;
                degistir(toplamPara);
            }
            System.out.println("Güncel para: " + db.priceValue);
            JFrame frame = new JFrame();
            int selectedOption = JOptionPane.showOptionDialog(null, "Satın alma başarılı!", "Hey!", JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (selectedOption == 0) {
                super.setVisible(false);
                super.dispose();
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(BuyCoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyCoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyCoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyCoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyCoin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner adet;
    private javax.swing.JRadioButton binance;
    private javax.swing.JRadioButton bitcoin;
    private javax.swing.JRadioButton cardano;
    private javax.swing.JRadioButton ethereum;
    private javax.swing.ButtonGroup group;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel param;
    private javax.swing.JButton satinAl;
    private javax.swing.JRadioButton solana;
    private javax.swing.JRadioButton tether;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
