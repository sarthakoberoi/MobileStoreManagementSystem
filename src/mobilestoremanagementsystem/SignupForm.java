package mobilestoremanagementsystem;

import model.User;
import java.util.regex.*;

public class SignupForm extends javax.swing.JFrame {
    
    public void validateFeilds() {
        if (f_fname.getText().isBlank() || f_email.getText().isBlank() || f_pass.getText().isBlank() || f_mob.getText().isBlank() || f_address.getText().isBlank()) {
            cont_btn.setEnabled(false);
            labelwarning.setText("Signup feilds cannot be empty");
            
        } else {
            cont_btn.setEnabled(true);
            labelwarning.setText("");
        }
    }
    
    public SignupForm() {
        initComponents();
        cont_btn.setEnabled(false);
        labelwarning.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        f_lname = new javax.swing.JTextField();
        f_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        f_fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        f_mob = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        f_dob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        f_pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        f_address = new javax.swing.JTextArea();
        cont_btn = new javax.swing.JButton();
        clr_btn1 = new javax.swing.JButton();
        login_btn = new javax.swing.JButton();
        labelwarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile Store Mangement System");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(1012, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1280, 50));

        jPanel1.setBackground(new java.awt.Color(48, 72, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_lname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_lnameActionPerformed(evt);
            }
        });
        f_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_lnameKeyReleased(evt);
            }
        });
        jPanel1.add(f_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 260, 40));

        f_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_emailKeyReleased(evt);
            }
        });
        jPanel1.add(f_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 540, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 70));

        f_fname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_fnameActionPerformed(evt);
            }
        });
        f_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_fnameKeyReleased(evt);
            }
        });
        jPanel1.add(f_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 260, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        f_mob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_mobKeyReleased(evt);
            }
        });
        jPanel1.add(f_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 540, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Of Birth [YYYY-MM-DD]");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, -1, -1));

        f_dob.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_dobKeyReleased(evt);
            }
        });
        jPanel1.add(f_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 540, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Create a password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        f_pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_passKeyReleased(evt);
            }
        });
        jPanel1.add(f_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 540, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Current Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        f_address.setColumns(20);
        f_address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_address.setRows(5);
        f_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_addressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(f_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 540, 140));

        cont_btn.setBackground(new java.awt.Color(183, 239, 205));
        cont_btn.setText("Continue");
        cont_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cont_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 100, 40));

        clr_btn1.setBackground(new java.awt.Color(255, 188, 188));
        clr_btn1.setText("Clear");
        clr_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(clr_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 100, 40));

        login_btn.setBackground(new java.awt.Color(255, 255, 255));
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 100, 40));

        labelwarning.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelwarning.setForeground(new java.awt.Color(255, 255, 102));
        labelwarning.setText("Warning/Error");
        jPanel1.add(labelwarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 1110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clear() {
        f_address.setText("");
        f_email.setText("");
        f_fname.setText("");
        f_lname.setText("");
        f_mob.setText("");
        f_pass.setText("");
        f_dob.setText("");
        cont_btn.setEnabled(false);
    }

    private void f_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_lnameActionPerformed

    }//GEN-LAST:event_f_lnameActionPerformed

    private void clr_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_btn1ActionPerformed
        clear();
    }//GEN-LAST:event_clr_btn1ActionPerformed

    private void cont_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont_btnActionPerformed
        User user = new User();
        user.setFname(f_fname.getText());
        user.setLname(f_lname.getText());
        user.setEmail(f_email.getText().toLowerCase());
        user.setAddress(f_address.getText());
        user.setPassword(f_pass.getText());
        user.setMobile(f_mob.getText());
        user.setDob(f_dob.getText());
        dao.UserDao.save(user);
    }//GEN-LAST:event_cont_btnActionPerformed

    private void f_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_fnameActionPerformed
        
    }//GEN-LAST:event_f_fnameActionPerformed

    private void f_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_fnameKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_fnameKeyReleased

    private void f_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_lnameKeyReleased
        
    }//GEN-LAST:event_f_lnameKeyReleased

    private void f_dobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_dobKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_dobKeyReleased

    private void f_mobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_mobKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_mobKeyReleased

    private void f_addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_addressKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_addressKeyReleased

    private void f_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_emailKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_emailKeyReleased

    private void f_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_passKeyReleased
        validateFeilds();
    }//GEN-LAST:event_f_passKeyReleased

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_login_btnActionPerformed
    
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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr_btn1;
    private javax.swing.JButton cont_btn;
    private javax.swing.JTextArea f_address;
    private javax.swing.JTextField f_dob;
    private javax.swing.JTextField f_email;
    private javax.swing.JTextField f_fname;
    private javax.swing.JTextField f_lname;
    private javax.swing.JTextField f_mob;
    private javax.swing.JPasswordField f_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelwarning;
    private javax.swing.JButton login_btn;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
