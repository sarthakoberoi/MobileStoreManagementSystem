package mobilestoremanagementsystem;

import dao.HistoryDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import model.Bills;

public class PastOrders extends javax.swing.JFrame {

    public PastOrders() {
        initComponents();
    }

    public void getAllRecords(String id) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Bills> list = HistoryDao.getAllRecords(id);
        Iterator<Bills> itr = list.iterator();
        while (itr.hasNext()) {
            Bills billObj = itr.next();
            dtm.addRow(new Object[]{billObj.getBillno(), billObj.getCustomername(),billObj.getCustomeremail(),billObj.getCustomermobile(),billObj.getItemid(),billObj.getCategory(),billObj.getBrand(),billObj.getModelnumber(),billObj.getModelname(),billObj.getVariant(),billObj.getImei(),billObj.getPrice(),billObj.getSellerid(),billObj.getSoldon()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        searchfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        categorylabel2 = new javax.swing.JLabel();
        title1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 72, 82));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel1.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 35));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Past Orders");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, -1));

        searchfield.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        searchfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchfieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 100, 240, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill No", "Customer Name", "Customer Email", "Customer Mobile", "Item ID", "Category", "Brand", "Model Number", "Model Name", "Variant", "IMEI", "Price", "Seller ID", "Sold On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(12).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1240, 340));

        categorylabel2.setBackground(new java.awt.Color(255, 255, 255));
        categorylabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel2.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel2.setText("Search by Bill Number");
        jPanel1.add(categorylabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        title1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile Store Mangement System V 2.0");

        javax.swing.GroupLayout title1Layout = new javax.swing.GroupLayout(title1);
        title1.setLayout(title1Layout);
        title1Layout.setHorizontalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title1Layout.createSequentialGroup()
                .addContainerGap(968, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        title1Layout.setVerticalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 669, 1280, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed

    }//GEN-LAST:event_searchfieldActionPerformed

    public void setAllRecords(String id) {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<Bills> list = HistoryDao.getAllRecords(id);
        Iterator<Bills> itr = list.iterator();
        while (itr.hasNext()) {
            Bills billObj = itr.next();
            dtm.addRow(new Object[]{billObj.getBillno(), billObj.getCustomername(),billObj.getCustomeremail(),billObj.getCustomermobile(),billObj.getItemid(),billObj.getCategory(),billObj.getBrand(),billObj.getModelnumber(),billObj.getModelname(),billObj.getVariant(),billObj.getImei(),billObj.getPrice(),billObj.getSellerid(),billObj.getSoldon()});
        }
    }
    
    private void searchfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfieldKeyReleased
        String id = searchfield.getText();
        setAllRecords(id);
    }//GEN-LAST:event_searchfieldKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        getAllRecords("");
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(PastOrders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastOrders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastOrders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastOrders.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PastOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categorylabel2;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchfield;
    private javax.swing.JLabel title;
    private javax.swing.JPanel title1;
    // End of variables declaration//GEN-END:variables
}
