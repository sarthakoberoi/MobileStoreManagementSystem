package mobilestoremanagementsystem;

import dao.DbOperations;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import dao.UserDao;

public class UserHome extends javax.swing.JFrame {

    public String email;
    public String name;
    public int userid = 0;

    public UserHome(String UserMail, String UserName) {
        initComponents();
        email = UserMail;
        name = UserName;

        if (!email.equals("admin@msms.com")) {
            adminlabel.setVisible(false);
            btn_verify.setVisible(false);
            btn_stafflogs.setVisible(false);
            btn_managec.setVisible(false);
            btn_logs.setVisible(false);
            stat2.setVisible(false);
            stat3.setVisible(false);
        }
        greeting(name);
        showstats(email);
    }

    public void greeting(String uname) {
        labelwelcome.setText("Welcome " + uname + "!");
    }

    public void showstats(String id) {

        int totalsold = 0;
        int soldbyuser = 0;
        int smartphones = 0;
        userid = UserDao.getId(email);
        
        // total number of items sold
        try {
            ResultSet rs = DbOperations.getData("select count(*) from bills");
            if (rs.next()) {
                totalsold = rs.getInt("count(*)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        // number of items sold by the user
        try {
            ResultSet rs = DbOperations.getData("select count(*) from bills where soldby = " + userid + " ");
            if (rs.next()) {
                soldbyuser = rs.getInt("count(*)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //select count(*) from bills where category="smartphone"
        try {
            ResultSet rs = DbOperations.getData("select count(*) from bills where category= 'smartphone'");
            if (rs.next()) {
                smartphones = rs.getInt("count(*)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        stat1.setText("You have sold " + soldbyuser + " Items in total");
        stat2.setText("Total Sales - " + totalsold + "");
        stat3.setText("Mobile Phones Sold - " + smartphones + "");
    }

    private UserHome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelwelcome = new javax.swing.JLabel();
        btn_crud = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_password = new javax.swing.JButton();
        btn_logs = new javax.swing.JButton();
        btn_order = new javax.swing.JButton();
        btn_verify = new javax.swing.JButton();
        btn_stafflogs = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_managec = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        adminlabel1 = new javax.swing.JLabel();
        adminlabel = new javax.swing.JLabel();
        summ = new javax.swing.JLabel();
        stat1 = new javax.swing.JLabel();
        stat2 = new javax.swing.JLabel();
        stat3 = new javax.swing.JLabel();
        stat4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 72, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelwelcome.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelwelcome.setForeground(new java.awt.Color(255, 255, 255));
        labelwelcome.setText("Welcome");
        jPanel1.add(labelwelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 760, 70));

        btn_crud.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_crud.setText("Manage Inventory");
        btn_crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crudActionPerformed(evt);
            }
        });
        jPanel1.add(btn_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 200, 50));

        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_add.setText("Add Item");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 200, 50));

        btn_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_password.setText("Change Password");
        btn_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(btn_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 200, 50));

        btn_logs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_logs.setText("Order History");
        btn_logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 200, 50));

        btn_order.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_order.setText("New Order");
        btn_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderActionPerformed(evt);
            }
        });
        jPanel1.add(btn_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 50));

        btn_verify.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_verify.setText("Verify Users");
        btn_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verifyActionPerformed(evt);
            }
        });
        jPanel1.add(btn_verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, 50));

        btn_stafflogs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_stafflogs.setText("View Staff");
        btn_stafflogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stafflogsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_stafflogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 200, 50));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 35));

        btn_managec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_managec.setText("Manage Category");
        btn_managec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managecActionPerformed(evt);
            }
        });
        jPanel1.add(btn_managec, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 200, 50));

        btn_reload.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_reload.setText("Reload");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, 90, 35));

        adminlabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminlabel1.setForeground(new java.awt.Color(255, 255, 255));
        adminlabel1.setText("Options");
        jPanel1.add(adminlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        adminlabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adminlabel.setForeground(new java.awt.Color(255, 255, 255));
        adminlabel.setText("Administrator Options");
        jPanel1.add(adminlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        summ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        summ.setForeground(new java.awt.Color(255, 255, 255));
        summ.setText("Summary");
        jPanel1.add(summ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 800, 40));

        stat1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stat1.setForeground(new java.awt.Color(255, 255, 255));
        stat1.setText("You have sold 00 Items in total and 00 in this month");
        jPanel1.add(stat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 800, 30));

        stat2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stat2.setForeground(new java.awt.Color(255, 255, 255));
        stat2.setText("Total Sales - 00 , [00 Items], 00 this month");
        jPanel1.add(stat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 800, 30));

        stat3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stat3.setForeground(new java.awt.Color(255, 255, 255));
        stat3.setText("Mobile Phones Sold - 00");
        jPanel1.add(stat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 800, 30));

        stat4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stat4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(stat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 800, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home-small.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pp.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Mobile Store Mangement System V2.0");

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addContainerGap(979, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 662, 1280, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_managecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managecActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btn_managecActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        new AddIem().setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_crudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crudActionPerformed
        new Inventory().setVisible(true);
    }//GEN-LAST:event_btn_crudActionPerformed

    private void btn_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderActionPerformed
        new NewOrder(email).setVisible(true);
    }//GEN-LAST:event_btn_orderActionPerformed

    private void btn_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verifyActionPerformed
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btn_verifyActionPerformed

    private void btn_logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logsActionPerformed
        new PastOrders().setVisible(true);
    }//GEN-LAST:event_btn_logsActionPerformed

    private void btn_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_passwordActionPerformed
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btn_passwordActionPerformed

    private void btn_stafflogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stafflogsActionPerformed
        new ViewStaff().setVisible(true);
    }//GEN-LAST:event_btn_stafflogsActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        dispose();
        new UserHome(email, name).setVisible(true);
    }//GEN-LAST:event_btn_reloadActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlabel;
    private javax.swing.JLabel adminlabel1;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_crud;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_logs;
    private javax.swing.JButton btn_managec;
    private javax.swing.JButton btn_order;
    private javax.swing.JButton btn_password;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_stafflogs;
    private javax.swing.JButton btn_verify;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelwelcome;
    private javax.swing.JPanel pp;
    private javax.swing.JLabel stat1;
    private javax.swing.JLabel stat2;
    private javax.swing.JLabel stat3;
    private javax.swing.JLabel stat4;
    private javax.swing.JLabel summ;
    // End of variables declaration//GEN-END:variables
}
