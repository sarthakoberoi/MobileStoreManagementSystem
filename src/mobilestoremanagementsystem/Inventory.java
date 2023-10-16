package mobilestoremanagementsystem;

import java.util.*;
import dao.*;
import javax.swing.*;
import javax.swing.table.*;
import model.*;

public class Inventory extends javax.swing.JFrame {

    public Inventory() {
        initComponents();
        updatebtn.setEnabled(false);
        deletebtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventorytable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fvariant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fcategory = new javax.swing.JComboBox<>();
        fprice = new javax.swing.JTextField();
        fmodelname = new javax.swing.JTextField();
        fmodelnumber = new javax.swing.JTextField();
        fimei = new javax.swing.JTextField();
        fbrand = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        searchitem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
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

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Inventory");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 570, 70));

        home.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 90, 35));

        inventorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Brand", "Model Name", "Model Number", "Variant", "IMEI", "Price"
            }
        ));
        inventorytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventorytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventorytable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 1160, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Price");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        idlabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        idlabel.setForeground(new java.awt.Color(255, 255, 255));
        idlabel.setText("00");
        jPanel1.add(idlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search by name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Model Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Model Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Variant");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IMEI / Serial No.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        fvariant.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fvariant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fvariantActionPerformed(evt);
            }
        });
        jPanel1.add(fvariant, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 200, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        fcategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(fcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 200, 30));

        fprice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpriceActionPerformed(evt);
            }
        });
        jPanel1.add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 200, 30));

        fmodelname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fmodelname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmodelnameActionPerformed(evt);
            }
        });
        jPanel1.add(fmodelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 200, 30));

        fmodelnumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fmodelnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmodelnumberActionPerformed(evt);
            }
        });
        jPanel1.add(fmodelnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 200, 30));

        fimei.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fimei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fimeiActionPerformed(evt);
            }
        });
        jPanel1.add(fimei, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 200, 30));

        fbrand.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbrandActionPerformed(evt);
            }
        });
        jPanel1.add(fbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 200, 30));

        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 100, -1));

        deletebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 100, -1));

        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearbtn.setText("Refresh");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 100, -1));

        searchitem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchitemActionPerformed(evt);
            }
        });
        searchitem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchitemKeyReleased(evt);
            }
        });
        jPanel1.add(searchitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 260, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Category");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        title1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile Store Mangement System");

        javax.swing.GroupLayout title1Layout = new javax.swing.GroupLayout(title1);
        title1.setLayout(title1Layout);
        title1Layout.setHorizontalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title1Layout.createSequentialGroup()
                .addContainerGap(1012, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        title1Layout.setVerticalGroup(
            title1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, title1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void fvariantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fvariantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fvariantActionPerformed

    private void fpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fpriceActionPerformed

    private void fmodelnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmodelnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmodelnameActionPerformed

    private void fmodelnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmodelnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmodelnumberActionPerformed

    private void fimeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fimeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fimeiActionPerformed

    private void fbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbrandActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            Item item = new Item();
            int id = Integer.parseInt(idlabel.getText());
            item.setId(id);
            item.setCategory((String) fcategory.getSelectedItem());
            item.setBrand(fbrand.getText());
            item.setModelname(fmodelname.getText());
            item.setModelnumber(fmodelnumber.getText());
            item.setVariant(fvariant.getText());
            item.setImei(fimei.getText());
            item.setPrice(Integer.parseInt(fprice.getText()));
            ItemDao.update(item);
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price feild should only contain numbers");
        }
        dispose();
        new Inventory().setVisible(true);
    }//GEN-LAST:event_updatebtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel dtm = (DefaultTableModel) inventorytable.getModel();
        ArrayList<Item> list = ItemDao.getAllRecords();
        Iterator<Item> itr = list.iterator();
        while (itr.hasNext()) {
            Item itemobj = itr.next();
            dtm.addRow(new Object[]{itemobj.getId(), itemobj.getCategory(), itemobj.getBrand(), itemobj.getModelname(), itemobj.getModelnumber(), itemobj.getVariant(), itemobj.getImei(), itemobj.getPrice()});

        }
    }//GEN-LAST:event_formComponentShown

    private void inventorytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventorytableMouseClicked
        int index = inventorytable.getSelectedRow();
        TableModel model = inventorytable.getModel();
        String id = model.getValueAt(index, 0).toString();
        idlabel.setText(id);
        String category = model.getValueAt(index, 1).toString();
        String brand = model.getValueAt(index, 2).toString();
        fbrand.setText(brand);
        String modelname = model.getValueAt(index, 3).toString();
        fmodelname.setText(modelname);
        String modelnumber = model.getValueAt(index, 4).toString();
        fmodelnumber.setText(modelnumber);
        String variant = model.getValueAt(index, 5).toString();
        fvariant.setText(variant);
        String imei = model.getValueAt(index, 6).toString();
        fimei.setText(imei);
        String price = model.getValueAt(index, 7).toString();
        fprice.setText(price);

        updatebtn.setEnabled(true);
        deletebtn.setEnabled(true);
        fcategory.removeAllItems();
        fcategory.addItem(category);

        ArrayList<Category> categoryList = CategoryDao.getAllRecords();
        Iterator<Category> categoryItr = categoryList.iterator();
        while (categoryItr.hasNext()) {
            Category categoryobj = categoryItr.next();
            if (!categoryobj.getName().equals(category)) {
                fcategory.addItem(categoryobj.getName());
            }

        }
    }//GEN-LAST:event_inventorytableMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        String id = idlabel.getText();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this item?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            ItemDao.delete(Integer.parseInt(id));
            dispose();
            new Inventory().setVisible(true);
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchitemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchitemActionPerformed

    private void searchitemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchitemKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) inventorytable.getModel();
        dtm.setRowCount(0);
        String name = searchitem.getText();
        ArrayList<Item> list = ItemDao.SearchRecord(name);
        Iterator<Item> itr = list.iterator();

        while (itr.hasNext()) {
            Item itemobj = itr.next();
            dtm.addRow(new Object[]{itemobj.getId(), itemobj.getCategory(), itemobj.getBrand(), itemobj.getModelname(), itemobj.getModelnumber(), itemobj.getVariant(), itemobj.getImei(), itemobj.getPrice()});

        }

    }//GEN-LAST:event_searchitemKeyReleased

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        dispose();
        new Inventory().setVisible(true);
    }//GEN-LAST:event_clearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField fbrand;
    private javax.swing.JComboBox<String> fcategory;
    private javax.swing.JTextField fimei;
    private javax.swing.JTextField fmodelname;
    private javax.swing.JTextField fmodelnumber;
    private javax.swing.JTextField fprice;
    private javax.swing.JTextField fvariant;
    private javax.swing.JButton home;
    private javax.swing.JLabel idlabel;
    private javax.swing.JTable inventorytable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchitem;
    private javax.swing.JLabel title;
    private javax.swing.JPanel title1;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}