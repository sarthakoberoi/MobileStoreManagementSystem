package mobilestoremanagementsystem;

import dao.UserDao;
import javax.swing.JOptionPane;
import model.User;

public class ChangePassword extends javax.swing.JFrame {

    String UserMail;

    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String recMail) {
        UserMail = recMail;
        initComponents();
        SetEmail(UserMail);
    }

    public void SetEmail(String UserMail) {
        fregemail.setText(UserMail);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cont_btn1 = new javax.swing.JButton();
        clr_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fnewpass = new javax.swing.JPasswordField();
        fregemail = new javax.swing.JTextField();
        homebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        fnewpass1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 72, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Change Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 70));

        cont_btn1.setBackground(new java.awt.Color(183, 239, 205));
        cont_btn1.setText("Continue");
        cont_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(cont_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 100, 40));

        clr_btn.setBackground(new java.awt.Color(255, 188, 188));
        clr_btn.setText("Clear");
        clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_btnActionPerformed(evt);
            }
        });
        jPanel1.add(clr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registered Email Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        fnewpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(fnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 540, 40));

        fregemail.setEditable(false);
        fregemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(fregemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 540, 40));

        homebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("New Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        fnewpass1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(fnewpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 540, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 135, 135));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 290, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ChangePasswordIcon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

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
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 662, 1280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cont_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont_btn1ActionPerformed
        String newpass = fnewpass.getText();
        String conpass = fnewpass1.getText();
        fregemail.setText(UserMail);
        if (newpass == null ? conpass != null : !newpass.equals(conpass)) {
            jLabel1.setText("Passwords Don't Match");
        } else if (newpass.equals("") || conpass.equals("")) {
            jLabel1.setText("Password Feild(s) Cannot Be Empty");
        } else {
            try {
                UserDao.changePassword(UserMail, newpass);
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_cont_btn1ActionPerformed

    public void clear() {
        fnewpass.setText("");
        jLabel1.setText("");
        fnewpass1.setText("");
    }

    private void clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_btnActionPerformed
        clear();
    }//GEN-LAST:event_clr_btnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        dispose();
    }//GEN-LAST:event_homebtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr_btn;
    private javax.swing.JButton cont_btn1;
    private javax.swing.JPasswordField fnewpass;
    private javax.swing.JPasswordField fnewpass1;
    private javax.swing.JTextField fregemail;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
