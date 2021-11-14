package coinsimulators;
import databases.DatabaseProcess;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmet
 */
public class MainClass extends javax.swing.JFrame {

    /**
     * Creates new form MainClass
     */
    DatabaseProcess database = new DatabaseProcess();
    public MainClass() {
        initComponents();
        String [] list = new String [0];
        DatabaseProcess.main(list);   
        DatabaseProcess.Listele();
        kullaniciAdiTextField.setText("Kullanıcı adını gir ve başla...");
        baslaButton.setVisible(false);
       
        if(DatabaseProcess.userName != null){
            
            CloseFrame();
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullaniciAdiTextField = new javax.swing.JTextField();
        baslaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setPreferredSize(new java.awt.Dimension(522, 395));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monaco", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Coin Simulator");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Hoşgeldin oyuncu, başlamak için aşağıdaki bilgileri doldur lütfen.");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Kullanıcı Adın:");

        kullaniciAdiTextField.setForeground(new java.awt.Color(102, 102, 102));
        kullaniciAdiTextField.setToolTipText("");
        kullaniciAdiTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kullaniciAdiTextField.setFocusable(false);
        kullaniciAdiTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciAdiTextFieldMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kullaniciAdiTextFieldMousePressed(evt);
            }
        });
        kullaniciAdiTextField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                kullaniciAdiTextFieldİnputMethodTextChanged(evt);
            }
        });
        kullaniciAdiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciAdiTextFieldActionPerformed(evt);
            }
        });
        kullaniciAdiTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kullaniciAdiTextFieldKeyPressed(evt);
            }
        });

        baslaButton.setBackground(new java.awt.Color(255, 204, 102));
        baslaButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        baslaButton.setForeground(new java.awt.Color(102, 102, 102));
        baslaButton.setLabel("BAŞLA");
        baslaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kullaniciAdiTextField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(baslaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciAdiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(baslaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciAdiTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciAdiTextFieldMouseClicked

    }//GEN-LAST:event_kullaniciAdiTextFieldMouseClicked

    private void kullaniciAdiTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciAdiTextFieldMousePressed
        kullaniciAdiTextField.setText("");
        kullaniciAdiTextField.setFocusable(true);
        kullaniciAdiTextField.requestFocus(true);
    }//GEN-LAST:event_kullaniciAdiTextFieldMousePressed

    private void kullaniciAdiTextFieldİnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kullaniciAdiTextFieldİnputMethodTextChanged

    }//GEN-LAST:event_kullaniciAdiTextFieldİnputMethodTextChanged

    private void kullaniciAdiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciAdiTextFieldActionPerformed

    }//GEN-LAST:event_kullaniciAdiTextFieldActionPerformed
    String inputText = "";
    private void kullaniciAdiTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kullaniciAdiTextFieldKeyPressed

        inputText = kullaniciAdiTextField.getText();
        if (inputText.length() > 6) {
            baslaButton.setVisible(true);
        } else {
            baslaButton.setVisible(false);
        }
    }//GEN-LAST:event_kullaniciAdiTextFieldKeyPressed
    public void CloseFrame() {
        super.setVisible(false);
        super.dispose();
    }
    private void baslaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslaButtonActionPerformed
        String text = kullaniciAdiTextField.getText();
        MainClass mainClass = new MainClass();

        if (text.trim().length() < 6) {
            var f = new JFrame();
            JOptionPane.showMessageDialog(f, "Kullanıcı adın en az 6 karakter olmalıdır! Boşluklara dikkat edin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        } else {
            DatabaseProcess.Ekle(0,text,1000);
            var f = new JFrame();
            JOptionPane.showMessageDialog(f, "Kaydınız tamamlandı anasayfaya yönlendiriliyorsunuz..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                var f2 = new JFrame();
                JOptionPane.showMessageDialog(f2, "Bir hata oluştu, lütfen daha sonra tekrar deneyin.");
            }

            CloseFrame();
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        }
    }//GEN-LAST:event_baslaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baslaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField kullaniciAdiTextField;
    // End of variables declaration//GEN-END:variables

}
