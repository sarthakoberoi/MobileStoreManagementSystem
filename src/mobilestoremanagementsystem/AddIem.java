package mobilestoremanagementsystem;

import javax.swing.JOptionPane;
import java.util.*;
import model.*;
import dao.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddIem extends javax.swing.JFrame {

    public AddIem() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        brandlabel = new javax.swing.JLabel();
        categorylabel = new javax.swing.JLabel();
        fbrand = new javax.swing.JTextField();
        categorycombo = new javax.swing.JComboBox<>();
        fmodeldumber = new javax.swing.JTextField();
        brandlabel1 = new javax.swing.JLabel();
        fmodelname = new javax.swing.JTextField();
        brandlabel2 = new javax.swing.JLabel();
        fvariant = new javax.swing.JTextField();
        brandlabel3 = new javax.swing.JLabel();
        fimei = new javax.swing.JTextField();
        brandlabel4 = new javax.swing.JLabel();
        fprice = new javax.swing.JTextField();
        brandlabel5 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        categorylabel1 = new javax.swing.JLabel();
        categorylabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesearch = new javax.swing.JTable();
        searchitem = new javax.swing.JTextField();
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

        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("New Item");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 570, 70));

        brandlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel.setText("Brand");
        jPanel1.add(brandlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 140, 40));

        categorylabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        categorylabel.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel.setText("Re-Stock");
        jPanel1.add(categorylabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, 50));

        fbrand.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fbrand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fbrandKeyReleased(evt);
            }
        });
        jPanel1.add(fbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 360, 40));

        categorycombo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        categorycombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorycomboActionPerformed(evt);
            }
        });
        jPanel1.add(categorycombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 360, 40));

        fmodeldumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fmodeldumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fmodeldumberKeyReleased(evt);
            }
        });
        jPanel1.add(fmodeldumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 360, 40));

        brandlabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel1.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel1.setText("Model Number");
        jPanel1.add(brandlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 40));

        fmodelname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fmodelname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fmodelnameKeyReleased(evt);
            }
        });
        jPanel1.add(fmodelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 360, 40));

        brandlabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel2.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel2.setText("Model Name");
        jPanel1.add(brandlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 140, 40));

        fvariant.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fvariant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fvariantKeyReleased(evt);
            }
        });
        jPanel1.add(fvariant, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 360, 40));

        brandlabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel3.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel3.setText("Variant");
        jPanel1.add(brandlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, 40));

        fimei.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fimei.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fimeiKeyReleased(evt);
            }
        });
        jPanel1.add(fimei, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 360, 40));

        brandlabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel4.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel4.setText("IMEI / Serial No.");
        jPanel1.add(brandlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 40));

        fprice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fpriceKeyReleased(evt);
            }
        });
        jPanel1.add(fprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 360, 40));

        brandlabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brandlabel5.setForeground(new java.awt.Color(255, 255, 255));
        brandlabel5.setText("Price");
        jPanel1.add(brandlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 140, 40));

        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 100, 40));

        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 100, 40));

        categorylabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel1.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel1.setText("Category");
        jPanel1.add(categorylabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, 40));

        categorylabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        categorylabel2.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel2.setText("Enter details manually:");
        jPanel1.add(categorylabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 50));

        tablesearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Model Name", "Variant"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablesearch);
        if (tablesearch.getColumnModel().getColumnCount() > 0) {
            tablesearch.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, 390));

        searchitem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        searchitem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchitemKeyReleased(evt);
            }
        });
        jPanel1.add(searchitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 350, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        title1.setBackground(new java.awt.Color(0, 0, 0));
        title1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile Store Mangement System V2.0");
        title1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 30));

        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1280, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void productNameByCategory(String category) {
        DefaultTableModel dtm = (DefaultTableModel) tablesearch.getModel();
        dtm.setRowCount(0);
        ArrayList<Item> list = ItemDao.getAllRecordsByCategory(category);
        Iterator<Item> itr = list.iterator();
        while (itr.hasNext()) {
            Item itemobj = itr.next();
            dtm.addRow(new Object[]{itemobj.getId(), itemobj.getModelname(), itemobj.getVariant()});
        }
    }

    public void filterProductByName(String name, String category) {
        DefaultTableModel dtm = (DefaultTableModel) tablesearch.getModel();
        dtm.setRowCount(0);
        ArrayList<Item> list = ItemDao.filterItemByName(name, category);
        Iterator<Item> itr = list.iterator();
        while (itr.hasNext()) {
            Item itemobj = itr.next();
            dtm.addRow(new Object[]{itemobj.getId(), itemobj.getModelname(), itemobj.getVariant()});
        }
    }

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void fbrandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fbrandKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fbrandKeyReleased

    private void categorycomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorycomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorycomboActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryObj = itr.next();
            categorycombo.addItem(categoryObj.getName());
        }
        String category = (String) categorycombo.getSelectedItem();
        productNameByCategory(category);

    }//GEN-LAST:event_formComponentShown

    private void fmodeldumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmodeldumberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fmodeldumberKeyReleased

    private void fmodelnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmodelnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fmodelnameKeyReleased

    private void fvariantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fvariantKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fvariantKeyReleased

    private void fimeiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fimeiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fimeiKeyReleased

    private void fpriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fpriceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_fpriceKeyReleased

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try {
            Item item = new Item();
            item.setBrand(fbrand.getText());
            item.setCategory((String) categorycombo.getSelectedItem());
            item.setModelname(fmodelname.getText());
            item.setModelnumber(fmodeldumber.getText());
            item.setImei(fimei.getText());
            item.setVariant(fvariant.getText());
            item.setPrice(Integer.parseInt(fprice.getText()));
            ItemDao.save(item);
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Price feild should only contain numbers");
        }
        dispose();
        new AddIem().setVisible(true);
    }//GEN-LAST:event_addbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        dispose();
        new AddIem().setVisible(true);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void tablesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesearchMouseClicked
        // TODO add your handling code here:
        int index = tablesearch.getSelectedRow();
        TableModel model = tablesearch.getModel();
        String ItemId = model.getValueAt(index, 0).toString();
        Item item = ItemDao.getItemInfo(Integer.valueOf(ItemId));

        fbrand.setText(item.getBrand());
        fmodeldumber.setText(item.getModelnumber());
        fmodelname.setText(item.getModelname());
        fvariant.setText(item.getVariant());
        fprice.setText(Integer.toString(item.getPrice()));
    }//GEN-LAST:event_tablesearchMouseClicked

    private void searchitemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchitemKeyReleased
        // TODO add your handling code here:
        String name = searchitem.getText();
        String category = (String) categorycombo.getSelectedItem();
        filterProductByName(name, category);
    }//GEN-LAST:event_searchitemKeyReleased

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
            java.util.logging.Logger.getLogger(AddIem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddIem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddIem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddIem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddIem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel brandlabel;
    private javax.swing.JLabel brandlabel1;
    private javax.swing.JLabel brandlabel2;
    private javax.swing.JLabel brandlabel3;
    private javax.swing.JLabel brandlabel4;
    private javax.swing.JLabel brandlabel5;
    private javax.swing.JComboBox<String> categorycombo;
    private javax.swing.JLabel categorylabel;
    private javax.swing.JLabel categorylabel1;
    private javax.swing.JLabel categorylabel2;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField fbrand;
    private javax.swing.JTextField fimei;
    private javax.swing.JTextField fmodeldumber;
    private javax.swing.JTextField fmodelname;
    private javax.swing.JTextField fprice;
    private javax.swing.JTextField fvariant;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchitem;
    private javax.swing.JTable tablesearch;
    private javax.swing.JLabel title;
    private javax.swing.JPanel title1;
    // End of variables declaration//GEN-END:variables
}
