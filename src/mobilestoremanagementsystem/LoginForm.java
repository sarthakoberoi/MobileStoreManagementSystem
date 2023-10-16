package mobilestoremanagementsystem;

import dao.*;
import javax.swing.JOptionPane;
import model.User;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        cont_btn1.setEnabled(false);
        labelerrormessage.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        femail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fpass = new javax.swing.JPasswordField();
        cont_btn1 = new javax.swing.JButton();
        rg_button = new javax.swing.JButton();
        clr_btn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelerrormessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 72, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 80));

        femail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        femail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                femailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                femailKeyTyped(evt);
            }
        });
        jPanel1.add(femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 540, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registered Email Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        fpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fpassKeyReleased(evt);
            }
        });
        jPanel1.add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 540, 40));

        cont_btn1.setBackground(new java.awt.Color(183, 239, 205));
        cont_btn1.setText("Continue");
        cont_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(cont_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 100, 40));

        rg_button.setBackground(new java.awt.Color(255, 255, 255));
        rg_button.setText("Register");
        rg_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rg_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(rg_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, 40));

        clr_btn1.setBackground(new java.awt.Color(255, 188, 188));
        clr_btn1.setText("Clear");
        clr_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(clr_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 100, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Login.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        labelerrormessage.setBackground(new java.awt.Color(48, 72, 82));
        labelerrormessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelerrormessage.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.add(labelerrormessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 400, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        title.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile Store Mangement System");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(1018, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 670, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 58, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear() {
        femail.setText("");
        fpass.setText("");
        labelerrormessage.setText("");
    }

    public void nullvalidate() {
        if (femail.getText().isEmpty() || fpass.getText().isEmpty()) {
            cont_btn1.setEnabled(false);
        } else {
            cont_btn1.setEnabled(true);
        }
    }

    private void rg_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rg_buttonActionPerformed
        setVisible(false);
        new SignupForm().setVisible(true);
    }//GEN-LAST:event_rg_buttonActionPerformed

    private void clr_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_btn1ActionPerformed
        clear();
    }//GEN-LAST:event_clr_btn1ActionPerformed

    private void cont_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont_btn1ActionPerformed
        String email = femail.getText().toLowerCase();
        String pass = fpass.getText();

        User user = null;
        user = UserDao.login(email, pass);

        if (user.getEmail() == null) {
            labelerrormessage.setText("Unable to login: User not found");
        } else {
            if (user.getPassword() == null ? pass != null : !user.getPassword().equals(pass)) {
                labelerrormessage.setText("Unable to login: Incorrect Password!");
                fpass.setText("");
            } else {
                if ("true".equals(user.getApproved())) {
                    setVisible(false);
                    String name = user.getFname();
                    new UserHome(email, name).setVisible(true);
                } else {
                    labelerrormessage.setText("Unable to login: User isn't approved!");
                }
            }
        }

    }//GEN-LAST:event_cont_btn1ActionPerformed

    private void femailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_femailKeyReleased
        nullvalidate();
    }//GEN-LAST:event_femailKeyReleased

    private void fpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fpassKeyReleased
        nullvalidate();
    }//GEN-LAST:event_fpassKeyReleased

    private void femailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_femailKeyTyped
        nullvalidate();
    }//GEN-LAST:event_femailKeyTyped

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr_btn1;
    private javax.swing.JButton cont_btn1;
    private javax.swing.JTextField femail;
    private javax.swing.JPasswordField fpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelerrormessage;
    private javax.swing.JButton rg_button;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
