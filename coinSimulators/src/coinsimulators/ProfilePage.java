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
public class ProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form ProfilePage
     */
    ItemsDatabase items = new ItemsDatabase();
    UserItems userItems = new UserItems();
    
    public ProfilePage() {
        initComponents();
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;        
        super.setLocation(dx, dy);
        username.setText(DatabaseProcess.userName);
        price.setText(DatabaseProcess.priceValue + " $");
        mulkName.setText(items.itemsName[0]);
        arabaName.setText(items.itemsName[1]);
        gemiName.setText(items.itemsName[2]);
        bilgisayarName.setText(items.itemsName[3]);
        marketName.setText(items.itemsName[4]);
        otelName.setText(items.itemsName[5]);
        
        mulkPrice.setText(" : " + userItems.mulk);
        arabaPrice.setText(" : " + userItems.araba);
        gemiPrice.setText(" : " +userItems.gemi);
        bilgisayarPrice.setText(" : " + userItems.pc);
        marketPrice.setText(" : " +userItems.market);
        otelPrice.setText(" : " + userItems.otel);
    }


     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mulkName = new javax.swing.JLabel();
        arabaName = new javax.swing.JLabel();
        gemiName = new javax.swing.JLabel();
        bilgisayarName = new javax.swing.JLabel();
        marketName = new javax.swing.JLabel();
        otelName = new javax.swing.JLabel();
        mulkPrice = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        arabaPrice = new javax.swing.JLabel();
        gemiPrice = new javax.swing.JLabel();
        bilgisayarPrice = new javax.swing.JLabel();
        marketPrice = new javax.swing.JLabel();
        otelPrice = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profilim");
        setLocation(new java.awt.Point(400, 150));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/profileresim.png")); // NOI18N

        jlabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jlabel2.setForeground(new java.awt.Color(153, 153, 153));
        jlabel2.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/profile.png")); // NOI18N
        jlabel2.setText("Kullanıcı Adı:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/profilpara.png")); // NOI18N
        jLabel2.setText("Mevcut Para:");

        username.setText("jLabel3");
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameMousePressed(evt);
            }
        });

        price.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel3.setText("Not: Kullanıcı adını düzenlemek için üstüne tıkla.");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Eşyalar");

        mulkName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        mulkName.setForeground(new java.awt.Color(153, 153, 153));
        mulkName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/ev.png")); // NOI18N

        arabaName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        arabaName.setForeground(new java.awt.Color(153, 153, 153));
        arabaName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/araba.png")); // NOI18N

        gemiName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        gemiName.setForeground(new java.awt.Color(153, 153, 153));
        gemiName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/gemi.png")); // NOI18N

        bilgisayarName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        bilgisayarName.setForeground(new java.awt.Color(153, 153, 153));
        bilgisayarName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/bilgisayar.png")); // NOI18N

        marketName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        marketName.setForeground(new java.awt.Color(153, 153, 153));
        marketName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/market.png")); // NOI18N

        otelName.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        otelName.setForeground(new java.awt.Color(153, 153, 153));
        otelName.setIcon(new javax.swing.ImageIcon("/Users/ahmet/Github/swing-coin-simulator/coinSimulators/src/icons/otel.png")); // NOI18N

        mulkPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mulkPrice.setForeground(new java.awt.Color(153, 153, 0));
        mulkPrice.setText("0");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        arabaPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        arabaPrice.setForeground(new java.awt.Color(153, 153, 0));
        arabaPrice.setText("0");

        gemiPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        gemiPrice.setForeground(new java.awt.Color(153, 153, 0));
        gemiPrice.setText("0");

        bilgisayarPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bilgisayarPrice.setForeground(new java.awt.Color(153, 153, 0));
        bilgisayarPrice.setText("0");

        marketPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        marketPrice.setForeground(new java.awt.Color(153, 153, 0));
        marketPrice.setText("0");

        otelPrice.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        otelPrice.setForeground(new java.awt.Color(153, 153, 0));
        otelPrice.setText("0");

        jButton1.setText("Eşya Al");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gemiName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gemiPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(arabaName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arabaPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(mulkName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mulkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marketName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marketPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(otelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bilgisayarName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bilgisayarPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(username))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(price))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel2)
                            .addComponent(username))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(price))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mulkName)
                                    .addComponent(mulkPrice))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(arabaName)
                                    .addComponent(arabaPrice))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gemiPrice)
                                    .addComponent(gemiName))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bilgisayarName)
                            .addComponent(bilgisayarPrice))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marketName)
                            .addComponent(marketPrice))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(otelName)
                            .addComponent(otelPrice))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMousePressed
        var frame = new JFrame();
        String result = JOptionPane.showInputDialog(frame, "Yeni Kullanıcı Adı:", "Profili Düzenle", JOptionPane.PLAIN_MESSAGE);
        System.out.println("+ " + result);
        if (result.isEmpty()) {
            System.out.println(result);
            System.out.println("Noya bastı");
        } else {
            DatabaseProcess.GuncelleUsername(result);
        }
    }//GEN-LAST:event_usernameMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        super.setVisible(false);
        super.dispose();
        ItemBuy itemBuy = new ItemBuy();
        itemBuy.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.setVisible(false);
        super.dispose();
        HomePage home = new HomePage();
        home.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arabaName;
    private javax.swing.JLabel arabaPrice;
    private javax.swing.JLabel bilgisayarName;
    private javax.swing.JLabel bilgisayarPrice;
    private javax.swing.JLabel gemiName;
    private javax.swing.JLabel gemiPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel marketName;
    private javax.swing.JLabel marketPrice;
    private javax.swing.JLabel mulkName;
    private javax.swing.JLabel mulkPrice;
    private javax.swing.JLabel otelName;
    private javax.swing.JLabel otelPrice;
    private javax.swing.JLabel price;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
