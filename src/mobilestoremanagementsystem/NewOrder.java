package mobilestoremanagementsystem;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import dao.*;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.*;

public class NewOrder extends javax.swing.JFrame {

    public int billId = 1;
    public double totalamount = 0;
    public String usermail;
    public int userid;
    public int index;
    public String cname;
    public String cmobile;
    public int sellerid = UserDao.getId(usermail);

//    public String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[-]+[a-zA-Z0-9]+$";
//    public String mobilepattern = "^[0-9]*$";
    public NewOrder() {
        initComponents();
    }

    public NewOrder(String email) {
        initComponents();
        usermail = email;
        userid = UserDao.getId(email);
        addtocart.setEnabled(false);
        labelcvalidation.setText("");
        labelwarning.setText("");
        genbill.setEnabled(false);
    }

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

    public void validatefeilds() {
        if (fcname.getText().isEmpty() || fcemail.getText().isEmpty() || fcmob.getText().isEmpty()) {
            labelwarning.setText("Customer details can't be empty!");
            genbill.setEnabled(false);
        } else {
            labelwarning.setText("");
            genbill.setEnabled(true);
        }
    }

    public void clearItemDetails() {
        labelbrand.setText("");
        labelimei.setText("");
        labelmodelname.setText("");
        labelmodelnumber.setText("");
        labelprice.setText("");
        labelvariant.setText("");
        labelid.setText("Preview for Item ");
        addtocart.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        fsearch = new javax.swing.JTextField();
        categorylabel9 = new javax.swing.JLabel();
        categorylabel10 = new javax.swing.JLabel();
        categorylabel11 = new javax.swing.JLabel();
        categorylabel12 = new javax.swing.JLabel();
        fcname = new javax.swing.JTextField();
        fcmob = new javax.swing.JTextField();
        categorylabel14 = new javax.swing.JLabel();
        categorylabel15 = new javax.swing.JLabel();
        fcategory = new javax.swing.JComboBox<>();
        fcemail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesearch = new javax.swing.JTable();
        labeltotal = new javax.swing.JLabel();
        categorylabel18 = new javax.swing.JLabel();
        categorylabel19 = new javax.swing.JLabel();
        categorylabel20 = new javax.swing.JLabel();
        categorylabel21 = new javax.swing.JLabel();
        categorylabel22 = new javax.swing.JLabel();
        categorylabel23 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        labelprice = new javax.swing.JLabel();
        labelbrand = new javax.swing.JLabel();
        labelvariant = new javax.swing.JLabel();
        labelmodelname = new javax.swing.JLabel();
        labelmodelnumber = new javax.swing.JLabel();
        labelimei = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        categorylabel25 = new javax.swing.JLabel();
        addtocart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecart = new javax.swing.JTable();
        labelbillnumber = new javax.swing.JLabel();
        categorylabel26 = new javax.swing.JLabel();
        categorylabel29 = new javax.swing.JLabel();
        categorylabel28 = new javax.swing.JLabel();
        categorylabel16 = new javax.swing.JLabel();
        closebtn1 = new javax.swing.JButton();
        genbill = new javax.swing.JButton();
        labelid = new javax.swing.JLabel();
        categorylabel17 = new javax.swing.JLabel();
        labelcvalidation = new javax.swing.JLabel();
        labelwarning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 665, -1, 40));

        jPanel3.setBackground(new java.awt.Color(48, 72, 82));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("New Sale");
        jPanel3.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 70));

        fsearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearchActionPerformed(evt);
            }
        });
        fsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fsearchKeyReleased(evt);
            }
        });
        jPanel3.add(fsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 320, -1));

        categorylabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel9.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel9.setText("Product Details");
        jPanel3.add(categorylabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        categorylabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel10.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel10.setText("Category");
        jPanel3.add(categorylabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        categorylabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel11.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel11.setText("Mobile Number");
        jPanel3.add(categorylabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        categorylabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel12.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel12.setText("Email");
        jPanel3.add(categorylabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        fcname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fcnameKeyReleased(evt);
            }
        });
        jPanel3.add(fcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 30));

        fcmob.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fcmob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fcmobKeyReleased(evt);
            }
        });
        jPanel3.add(fcmob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, -1));

        categorylabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel14.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel14.setText("Search");
        jPanel3.add(categorylabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 30));

        categorylabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categorylabel15.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel15.setText("*Click on the item to remove it from cart");
        jPanel3.add(categorylabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, 30));

        fcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcategoryActionPerformed(evt);
            }
        });
        jPanel3.add(fcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 250, 30));

        fcemail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fcemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fcemailKeyReleased(evt);
            }
        });
        jPanel3.add(fcemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 250, -1));

        tablesearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Variant"
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
        jScrollPane2.setViewportView(tablesearch);
        if (tablesearch.getColumnModel().getColumnCount() > 0) {
            tablesearch.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablesearch.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 390, 200));

        labeltotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labeltotal.setForeground(new java.awt.Color(255, 255, 255));
        labeltotal.setText("00");
        jPanel3.add(labeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, -1, -1));

        categorylabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel18.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel18.setText("Price                   :");
        jPanel3.add(categorylabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, 30));

        categorylabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel19.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel19.setText("Variant               :");
        jPanel3.add(categorylabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, 30));

        categorylabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel20.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel20.setText("Model Name      :");
        jPanel3.add(categorylabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 30));

        categorylabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel21.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel21.setText("Model Number   :");
        jPanel3.add(categorylabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 30));

        categorylabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel22.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel22.setText("IMEI / Serial       :");
        jPanel3.add(categorylabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, 30));

        categorylabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel23.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel23.setText("Item Cart");
        jPanel3.add(categorylabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        clear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 100, 35));

        labelprice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelprice.setForeground(new java.awt.Color(255, 255, 255));
        labelprice.setText("-");
        jPanel3.add(labelprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 150, 30));

        labelbrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelbrand.setForeground(new java.awt.Color(255, 255, 255));
        labelbrand.setText("-");
        jPanel3.add(labelbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 150, 30));

        labelvariant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelvariant.setForeground(new java.awt.Color(255, 255, 255));
        labelvariant.setText("-");
        jPanel3.add(labelvariant, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 150, 30));

        labelmodelname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelmodelname.setForeground(new java.awt.Color(255, 255, 255));
        labelmodelname.setText("-");
        jPanel3.add(labelmodelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 150, 30));

        labelmodelnumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelmodelnumber.setForeground(new java.awt.Color(255, 255, 255));
        labelmodelnumber.setText("-");
        jPanel3.add(labelmodelnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 150, 30));

        labelimei.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelimei.setForeground(new java.awt.Color(255, 255, 255));
        labelimei.setText("-");
        jPanel3.add(labelimei, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 150, 30));

        closebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel3.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, 100, 35));

        categorylabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel25.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel25.setText("Brand                 :");
        jPanel3.add(categorylabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 30));

        addtocart.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addtocart.setText("Add to cart");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });
        jPanel3.add(addtocart, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 290, 35));

        tablecart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Brand", "Model Name", "Variant", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablecart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecart);
        if (tablecart.getColumnModel().getColumnCount() > 0) {
            tablecart.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablecart.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, 390));

        labelbillnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelbillnumber.setForeground(new java.awt.Color(255, 255, 255));
        labelbillnumber.setText("00");
        jPanel3.add(labelbillnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 75, -1, -1));

        categorylabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel26.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel26.setText("Total Payble (In Rupees) : ");
        jPanel3.add(categorylabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        categorylabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel29.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel29.setText("Customer Details");
        jPanel3.add(categorylabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        categorylabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        categorylabel28.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel28.setText("Purchase No:");
        jPanel3.add(categorylabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 75, -1, -1));

        categorylabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        categorylabel16.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel16.setText("Name");
        jPanel3.add(categorylabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 30));

        closebtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closebtn1.setText("Clear Cart");
        closebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(closebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 180, 35));

        genbill.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        genbill.setText("Checkout");
        genbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genbillActionPerformed(evt);
            }
        });
        jPanel3.add(genbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 290, 35));

        labelid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelid.setForeground(new java.awt.Color(255, 255, 255));
        labelid.setText("Preview for item");
        jPanel3.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 150, 30));

        categorylabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categorylabel17.setForeground(new java.awt.Color(255, 255, 255));
        categorylabel17.setText("*Total Amount generated includes 18% GST per item.");
        jPanel3.add(categorylabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, 30));

        labelcvalidation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelcvalidation.setForeground(new java.awt.Color(255, 153, 153));
        jPanel3.add(labelcvalidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 250, 20));

        labelwarning.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelwarning.setForeground(new java.awt.Color(255, 255, 102));
        jPanel3.add(labelwarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 250, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        // brand, product, variant, price
        String id = labelid.getText();
        String brand = labelbrand.getText();
        String product = labelmodelname.getText();
        String variant = labelvariant.getText();
        double price = Integer.parseInt(labelprice.getText());

        DefaultTableModel dtm = (DefaultTableModel) tablecart.getModel();
        DefaultTableModel dtms = (DefaultTableModel) tablesearch.getModel();

        dtm.addRow(new Object[]{id, brand, product, variant, price});
        dtms.removeRow(index);

        totalamount = totalamount + price;
        labeltotal.setText(Double.toString(Math.round(totalamount)));

        clearItemDetails();
    }//GEN-LAST:event_addtocartActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        billId = Integer.parseInt(HistoryDao.getBillno());
        labelbillnumber.setText(HistoryDao.getBillno());
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryobj = itr.next();
            fcategory.addItem(categoryobj.getName());
        }
        String category = (String) fcategory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_formComponentShown

    private void fsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fsearchKeyReleased
        String name = fsearch.getText();
        String category = (String) fcategory.getSelectedItem();
        filterProductByName(name, category);
    }//GEN-LAST:event_fsearchKeyReleased

    private void tablesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesearchMouseClicked
        index = tablesearch.getSelectedRow();
        TableModel model = tablesearch.getModel();
        String ItemId = model.getValueAt(index, 0).toString();
        Item item = ItemDao.getItemInfo(Integer.valueOf(ItemId));

        labelid.setText(ItemId);
        labelbrand.setText(item.getBrand());
        labelmodelname.setText(item.getModelname());
        labelmodelnumber.setText(item.getModelnumber());
        labelprice.setText(Integer.toString(item.getPrice()));
        labelvariant.setText(item.getVariant());
        labelimei.setText(item.getImei());
        addtocart.setEnabled(true);


    }//GEN-LAST:event_tablesearchMouseClicked

    private void fcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcategoryActionPerformed
        String category = (String) fcategory.getSelectedItem();
        productNameByCategory(category);
    }//GEN-LAST:event_fcategoryActionPerformed

    private void closebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtn1ActionPerformed
        dispose();
        new NewOrder().setVisible(true);
    }//GEN-LAST:event_closebtn1ActionPerformed

    private void fcnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fcnameKeyReleased
        validatefeilds();
    }//GEN-LAST:event_fcnameKeyReleased

    private void fcmobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fcmobKeyReleased
        validatefeilds();
    }//GEN-LAST:event_fcmobKeyReleased

    private void fcemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fcemailKeyReleased
        validatefeilds();
    }//GEN-LAST:event_fcemailKeyReleased

    private void genbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genbillActionPerformed
        //add the cart items to the bill table

        //itemid,category,brand,modelnumber,modelname,variant,imei,price
        //billno(billid) ,cname,cemail,cmobile,soldby
        DefaultTableModel dtm = (DefaultTableModel) tablecart.getModel();
        Bills bill = new Bills();

        int a = JOptionPane.showConfirmDialog(null, "Confirm Payement of " + totalamount + "", "Confirm Payement", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                try {

                    bill.setBillno(billId);
                    bill.setCustomername(fcname.getText());
                    bill.setCustomeremail(fcemail.getText());
                    bill.setCustomermobile(fcmob.getText());

                    String ItemId = dtm.getValueAt(i, 0).toString();
                    Item item = ItemDao.getItemInfo(Integer.valueOf(ItemId));

                    bill.setItemid(item.getId());//itemid
                    bill.setCategory(item.getCategory());//category
                    bill.setBrand(item.getBrand());//brand
                    bill.setModelnumber(item.getModelnumber());//modelnumber
                    bill.setModelname(item.getModelname());//modelname
                    bill.setVariant(item.getVariant());//variant
                    bill.setImei(item.getImei());//imei
                    bill.setPrice(item.getPrice());//price
                    bill.setSellerid(userid);

                    HistoryDao.save(bill);

                    //remove the items from the item(Stocks) table
                ItemDao.delete(Integer.parseInt(ItemId));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

            dispose();
            new NewOrder().setVisible(true);
        }
    }//GEN-LAST:event_genbillActionPerformed

    private void tablecartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecartMouseClicked
        index = tablecart.getSelectedRow();
        TableModel model = tablecart.getModel();

        String ItemId = model.getValueAt(index, 0).toString();
        Item item = ItemDao.getItemInfo(Integer.valueOf(ItemId));

        labelid.setText(ItemId);
        labelbrand.setText(item.getBrand());
        labelmodelname.setText(item.getModelname());
        labelmodelnumber.setText(item.getModelnumber());
        labelprice.setText(Integer.toString(item.getPrice()));
        labelvariant.setText(item.getVariant());
        labelimei.setText(item.getImei());
        addtocart.setEnabled(true);

        DefaultTableModel dtm = (DefaultTableModel) tablecart.getModel();
        DefaultTableModel dtms = (DefaultTableModel) tablesearch.getModel();

        dtms.addRow(new Object[]{ItemId, item.getModelname(), item.getVariant()});
        dtm.removeRow(index);

        totalamount = totalamount - item.getPrice();
        labeltotal.setText(Double.toString(Math.round(totalamount)));

        clearItemDetails();
    }//GEN-LAST:event_tablecartMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearItemDetails();
    }//GEN-LAST:event_clearActionPerformed

    private void fsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fsearchActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart;
    private javax.swing.JLabel categorylabel10;
    private javax.swing.JLabel categorylabel11;
    private javax.swing.JLabel categorylabel12;
    private javax.swing.JLabel categorylabel14;
    private javax.swing.JLabel categorylabel15;
    private javax.swing.JLabel categorylabel16;
    private javax.swing.JLabel categorylabel17;
    private javax.swing.JLabel categorylabel18;
    private javax.swing.JLabel categorylabel19;
    private javax.swing.JLabel categorylabel20;
    private javax.swing.JLabel categorylabel21;
    private javax.swing.JLabel categorylabel22;
    private javax.swing.JLabel categorylabel23;
    private javax.swing.JLabel categorylabel25;
    private javax.swing.JLabel categorylabel26;
    private javax.swing.JLabel categorylabel28;
    private javax.swing.JLabel categorylabel29;
    private javax.swing.JLabel categorylabel9;
    private javax.swing.JButton clear;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton closebtn1;
    private javax.swing.JComboBox<String> fcategory;
    private javax.swing.JTextField fcemail;
    private javax.swing.JTextField fcmob;
    private javax.swing.JTextField fcname;
    private javax.swing.JTextField fsearch;
    private javax.swing.JButton genbill;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelbillnumber;
    private javax.swing.JLabel labelbrand;
    private javax.swing.JLabel labelcvalidation;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelimei;
    private javax.swing.JLabel labelmodelname;
    private javax.swing.JLabel labelmodelnumber;
    private javax.swing.JLabel labelprice;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel labelvariant;
    private javax.swing.JLabel labelwarning;
    private javax.swing.JTable tablecart;
    private javax.swing.JTable tablesearch;
    private javax.swing.JPanel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
