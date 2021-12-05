/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coinsimulators;

import databases.DatabaseProcess;
import databases.ItemsDatabase;
import databases.UserItems;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmet
 */
public class ItemBuy extends javax.swing.JFrame {

    /**
     * Creates new form ItemBuy
     */
    ItemsDatabase items = new ItemsDatabase();
    DatabaseProcess data = new DatabaseProcess();
    HomePage mainClass = new HomePage();
    ProfilePage profilePage = new ProfilePage();
    UserItems userItems = new UserItems();
    public ItemBuy() {
        initComponents();
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        super.setLocation(dx, dy);
        DatabaseProcess.Listele();
        para.setText("Mevcut Para: " + DatabaseProcess.priceValue + " $");
        buyButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        mulk = new javax.swing.JRadioButton();
        araba = new javax.swing.JRadioButton();
        gemi = new javax.swing.JRadioButton();
        bilgisayar = new javax.swing.JRadioButton();
        market = new javax.swing.JRadioButton();
        otel = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        para = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Satın Al");
        setLocation(new java.awt.Point(500, 250));

        buttonGroup.add(mulk);
        mulk.setText("Mülk");
        mulk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulkActionPerformed(evt);
            }
        });

        buttonGroup.add(araba);
        araba.setText("Araba");
        araba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arabaActionPerformed(evt);
            }
        });

        buttonGroup.add(gemi);
        gemi.setText("Gemi");
        gemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gemiActionPerformed(evt);
            }
        });

        buttonGroup.add(bilgisayar);
        bilgisayar.setText("Bilgisayar");
        bilgisayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgisayarActionPerformed(evt);
            }
        });

        buttonGroup.add(market);
        market.setText("Market");
        market.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketActionPerformed(evt);
            }
        });

        buttonGroup.add(otel);
        otel.setText("Otel");
        otel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otelActionPerformed(evt);
            }
        });

        jLabel1.setText("Eşya Satın Al");

        para.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        para.setText("Mevcut Para");

        buyButton.setText("Satın Almak İçin Bir Eşya Seç");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/back.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(para, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulk)
                            .addComponent(bilgisayar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(araba)
                            .addComponent(market))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gemi)
                                    .addComponent(otel))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(para))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mulk)
                    .addComponent(araba)
                    .addComponent(gemi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilgisayar)
                    .addComponent(market)
                    .addComponent(otel))
                .addGap(18, 18, 18)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        if (mulk.isSelected()) {
            uyari(items.itemsValue[0]);
            userItems.Guncelle(userItems.mulk+1,userItems.araba,userItems.gemi,userItems.pc,userItems.market,userItems.otel);
        } else if (araba.isSelected()) {
            uyari(items.itemsValue[1]);
            userItems.Guncelle(userItems.mulk,userItems.araba+1,userItems.gemi,userItems.pc,userItems.market,userItems.otel);
        } else if (gemi.isSelected()) {
            uyari(items.itemsValue[2]);
            userItems.Guncelle(userItems.mulk,userItems.araba,userItems.gemi+1,userItems.pc,userItems.market,userItems.otel);
        } else if (bilgisayar.isSelected()) {
            uyari(items.itemsValue[3]);
            userItems.Guncelle(userItems.mulk,userItems.araba,userItems.gemi,userItems.pc+1,userItems.market,userItems.otel);
        } else if (market.isSelected()) {
            uyari(items.itemsValue[4]);
            userItems.Guncelle(userItems.mulk,userItems.araba,userItems.gemi,userItems.pc,userItems.market+1,userItems.otel);
        } else if (otel.isSelected()) {
            uyari(items.itemsValue[5]);
            userItems.Guncelle(userItems.mulk,userItems.araba,userItems.gemi,userItems.pc,userItems.market,userItems.otel+1);
        }


    }//GEN-LAST:event_buyButtonActionPerformed

    private void buttonEnable() {
        buyButton.setEnabled(true);
    }

    private void mulkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulkActionPerformed
        buyButton.setText("Mülk (" + items.itemsValue[0] + "$)");
        buttonEnable();
    }//GEN-LAST:event_mulkActionPerformed

    private void arabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arabaActionPerformed
        buyButton.setText("Araba (" + items.itemsValue[1] + "$)");
        buttonEnable();
    }//GEN-LAST:event_arabaActionPerformed

    private void gemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gemiActionPerformed
        buyButton.setText("Gemi (" + items.itemsValue[2] + "$)");
        buttonEnable();
    }//GEN-LAST:event_gemiActionPerformed

    private void bilgisayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgisayarActionPerformed
        buyButton.setText("Bilgisayar (" + items.itemsValue[3] + "$)");
        buttonEnable();
    }//GEN-LAST:event_bilgisayarActionPerformed

    private void marketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketActionPerformed
        buyButton.setText("Market (" + items.itemsValue[4] + "$)");
        buttonEnable();
    }//GEN-LAST:event_marketActionPerformed

    private void otelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otelActionPerformed
        buyButton.setText("Otel (" + items.itemsValue[5] + "$)");
        buttonEnable();
    }//GEN-LAST:event_otelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.setVisible(false);
        super.dispose();
        ProfilePage home = new ProfilePage();
        home.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void uyari(int value) {

        if (value > data.priceValue) {
            JOptionPane.showMessageDialog(null, "Bu eşyayı alabilmek yeterli bakiyen yok!",
                    "Hey!", JOptionPane.ERROR_MESSAGE);
        } else {
            int yeniPara = data.priceValue - value;
            System.out.println("Yeni: " + yeniPara + " value: " + value);
            data.Guncelle(yeniPara);
            DatabaseProcess.priceValue = yeniPara;

            System.out.println("Güncel para: " + data.priceValue);
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
            java.util.logging.Logger.getLogger(ItemBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemBuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton araba;
    private javax.swing.JRadioButton bilgisayar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buyButton;
    private javax.swing.JRadioButton gemi;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton market;
    private javax.swing.JRadioButton mulk;
    private javax.swing.JRadioButton otel;
    private javax.swing.JLabel para;
    // End of variables declaration//GEN-END:variables
}
