/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.inventory.management;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.itp.sales.handling.DbConnect;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class InventoryDetails extends javax.swing.JFrame {

    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection con = null;

    //private Object ItemName;
    //private Object Available_Quantitytxt;
    //private Object stocktxt;
    /**
     * Creates new form InventoryDetails
     */
    public InventoryDetails() {
        initComponents();
        con = DbConnect.connect();
        tableLoad();

    }
 

    public void tableLoad() {
        try {
            String qry = "select * from inventory_management";
            pst = con.prepareStatement(qry);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Available_Quantitytxt = new javax.swing.JTextField();
        stocktxt = new javax.swing.JTextField();
        ItemNametxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Cost_Per_Itemtxt = new javax.swing.JTextField();
        itemcodetxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Supplier_Nametxt = new javax.swing.JTextField();
        Customer_Nametxt = new javax.swing.JTextField();
        expiredate = new com.toedter.calendar.JDateChooser();
        issuedate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();
        Searchbtn = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        PRINTbtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Demobtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Item Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Available Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Stock");

        Available_Quantitytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Available_QuantitytxtKeyTyped(evt);
            }
        });

        stocktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stocktxtKeyTyped(evt);
            }
        });

        ItemNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNametxtActionPerformed(evt);
            }
        });
        ItemNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ItemNametxtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Cost Per Item");

        Cost_Per_Itemtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cost_Per_ItemtxtKeyTyped(evt);
            }
        });

        itemcodetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                itemcodetxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cost_Per_Itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(stocktxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addComponent(Available_Quantitytxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ItemNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Available_Quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Cost_Per_Itemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 350, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Supplier Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Expire Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Issued Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Customer Name");

        Supplier_Nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Supplier_NametxtKeyTyped(evt);
            }
        });

        Customer_Nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Customer_NametxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(expiredate, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(issuedate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Customer_Nametxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Supplier_Nametxt))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Supplier_Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(expiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 320, 220));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Main Menu");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 135, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Suppier Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Code", "Item Name", "Available Quantity", "Stock", "Cost Per Item ", "Supplier Name", "Expire Date", "Issued Date", "Customer Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Customer Name");
        }

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 850, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Inventory Details");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Deletebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 105, 40));

        Searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Searchbtn.setText("Search");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 105, 40));

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 105, 40));

        Clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 90, 40));

        Addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, 40));

        PRINTbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PRINTbtn.setText("PRINT");
        PRINTbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTbtnActionPerformed(evt);
            }
        });
        getContentPane().add(PRINTbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 640, 90, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/images.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 240, 220));

        Demobtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Demobtn.setText("Demo");
        Demobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemobtnActionPerformed(evt);
            }
        });
        getContentPane().add(Demobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 640, 80, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 11, 480, 71));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNametxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SupplierDetails sd = new SupplierDetails();
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        String itemCode;
        itemCode = itemcodetxt.getText();
        String itemname;
        itemname = ItemNametxt.getText();
        int aveilableQuantity = Integer.parseInt(Available_Quantitytxt.getText());
        int Stock = Integer.parseInt(stocktxt.getText());
        //date = dc.getDate();
        //sqldate = new java.sql.Date(date.getTime());
        double CostPerItem = Double.parseDouble(Cost_Per_Itemtxt.getText());
        String SupplierName = Supplier_Nametxt.getText();
        Date s = expiredate.getDate();
        Date d = issuedate.getDate();
        // String ExpireDate = expiredate.get();
        //String IssueDate = issuedate.getText();
        String CustomerName = Customer_Nametxt.getText();
        //JOptionPane.showMessageDialog(null, "hiii");*/
        int loss =Stock-aveilableQuantity ;
        
        try {
            System.out.println("feadf");

            String qry = "insert into inventory_management (Item_Code,Item_Name,Avalible_Quantity,Stock,Cost_Per_Item,Supplier_name,Expire_Date,Issue_Date,Customer_Name) values(?,?,?,?,?,?,?,?,?)"; //('"+ this.itemcodetxt.getText() +"', '"+ this.ItemNametxt.getText() +"', '"+ aveilableQuantity +"', '"+ Stock +"', '"+ CostPerItem +"', '"+ this.Supplier_Nametxt.getText()+"', '"+ this.expiredate.getDateEditor().getUiComponent()).getText() +"', '"+ this.issuedate.getDateEditor().getUiComponent()).getText();+"','"+ this.Customer_Nametxt.getText()+"')";

            pst = con.prepareStatement(qry);
            pst.setString(1, itemCode);
            pst.setString(2, itemname);
            pst.setInt(3, aveilableQuantity);
            pst.setInt(4, Stock);
            pst.setDouble(5, CostPerItem);
            pst.setString(6, SupplierName);
            pst.setDate(7, convertJavaDateToSqlDate(s));
            pst.setDate(8, convertJavaDateToSqlDate(d));
            pst.setString(9, CustomerName);

            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Saved");
            JOptionPane.showMessageDialog(null, "loss amount :"+Integer.toString(loss));
            new InventoryDetails().setVisible(true);
            tableLoad();
            //   tableLoad();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("error");
        }

    }//GEN-LAST:event_AddbtnActionPerformed
    public static java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        // update
        //UPDATE table_name SET column1=value1,column2=value2,... WHERE some_column=some_value;
        //String cid=jTextField1.getText()
        java.sql.Date d1=convertJavaDateToSqlDate(expiredate.getDate());
        java.sql.Date d2=convertJavaDateToSqlDate(issuedate.getDate());
        String ItemCode = itemcodetxt.getText();
        String ItemName= ItemNametxt.getText();
        int AvalibleQuantity= Integer.parseInt(Available_Quantitytxt.getText());
       // gpr = Double.parseDouble(eneed)*spr*1.15;

        String sqlq= "update inventory_management  set Item_Code='" + ItemCode + "', Item_Name='" + ItemName + "',Avalible_Quantity=" +AvalibleQuantity+ ","
                + "Stock =" +Integer.parseInt(stocktxt.getText())+ ",Cost_Per_Item=" +Double.parseDouble(Cost_Per_Itemtxt.getText())+ ", Supplier_name='" +Supplier_Nametxt.getText() +"',Expire_Date='" +d1+ "',"
                + " Issue_Date='" +d2+"', Customer_Name='" +Customer_Nametxt.getText()+"' where Item_Code='" +ItemCode +"'";

        int rep = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want ot update this InventoryDetails ?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
            try {

                pst = con.prepareStatement(sqlq);
                pst.execute(sqlq);
                JOptionPane.showMessageDialog(rootPane, "InventoryDetails updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                new InventoryDetails().setVisible(true);
                tableLoad();
                this.dispose();

            } catch (Exception e) {
                System.out.print(e);
                JOptionPane.showMessageDialog(rootPane, "InventoryDetails update failed", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
            
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int r = jTable1.getSelectedRow();
        String ItemCode =jTable1.getValueAt(r,0). toString();
        String ItemName =jTable1.getValueAt(r,1). toString();
        String AvalibleQuantity =jTable1.getValueAt(r,2). toString();
        String Stock=jTable1.getValueAt(r,3). toString();
        String Cost_Per_Item=jTable1.getValueAt(r,4). toString();
        String SupplierName =jTable1.getValueAt(r,5). toString();
       // Date Supply_Date =(Date)jTable1.getValueAt(r,6);
       String DDate=model.getValueAt(r, 6).toString();
       String DDate1=model.getValueAt(r, 7). toString();
       String CustomerName =jTable1.getValueAt(r, 8).toString();
       
       try{
        java.util.Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(DDate);
        java.util.Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(DDate1);
        //String sd2=dateFormat.format(date1);
        expiredate.setDate(date1);
        issuedate.setDate(date2);
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null, "invalide Date format");
        }
        
      
        String CustomerNumber =jTable1.getValueAt(r,8). toString();
       
        
        itemcodetxt.setText(ItemCode);
        ItemNametxt.setText(ItemName);
        Available_Quantitytxt.setText(AvalibleQuantity);
       // Item_Nametxt.setText(ItemName);
        stocktxt.setText(Stock);
        Cost_Per_Itemtxt.setText(Cost_Per_Item);
        Supplier_Nametxt.setText(SupplierName);
        //SupplyDatetxt.setDate(Supply_Date);
        Customer_Nametxt.setText(CustomerName);
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        this.itemcodetxt.setText(null);
        this.ItemNametxt.setText(null);
        this.Available_Quantitytxt.setText(null);
        this.stocktxt.setText(null);
        this.Cost_Per_Itemtxt.setText(null);
        this.Supplier_Nametxt.setText(null);
        ((JTextField) this.expiredate.getDateEditor().getUiComponent()).setText(null);
        ((JTextField) this.issuedate.getDateEditor().getUiComponent()).setText(null);
        //this.expiredate.setText(null);
        //this.issuedate.setText(null);
        this.Customer_Nametxt.setText(null);


    }//GEN-LAST:event_ClearbtnActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        // TODO add your handling code here:
        //if()
        String ItemCode = itemcodetxt.getText();
        String ItemName = ItemNametxt.getText();
        try {

            //String ItemCode = itemcodetxt.getText();
            //String ItemName= ItemNametxt.getText();
            String qry = ("select * from inventory_management where Item_Code = '" + ItemCode + "' and Item_Name ='" + ItemName + "'");

            pst = con.prepareStatement(qry);

           // pst.setString(1, itemcodetxt.getText());
            //pst.setString(2, ItemNametxt.getText());

            System.out.println("ok111");
            rs = pst.executeQuery();
            System.out.println("ok111");
            // tableLoad(tbl, qry);

            if (rs.next()) {
                //JOptionPane.showMessageDialog(null, "hiiiiiiiiiiiii");
                String a = rs.getString("Item_Code");
                itemcodetxt.setText(a);
                String b = rs.getString("Item_Name");
                ItemNametxt.setText(b);
                String c = rs.getString("Avalible_Quantity");
                Available_Quantitytxt.setText(c);
                String d = rs.getString("Stock");
                stocktxt.setText(d);
                String f = rs.getString("Cost_Per_Item");
                Cost_Per_Itemtxt.setText(f);
                String g = rs.getString("Supplier_name");
                Supplier_Nametxt.setText(g);
                Date h = rs.getDate("Expire_Date");
                expiredate.setDate(h);
                Date i = rs.getDate("Issue_Date");
                issuedate.setDate(i);
                String j = rs.getString("Customer_Name");
                Customer_Nametxt.setText(j);
                System.out.println("ok111");
            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }//GEN-LAST:event_SearchbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        int rep = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to Delete this row", "confirm", JOptionPane.YES_NO_CANCEL_OPTION);
        if (rep == JOptionPane.YES_OPTION) {
           String quary= "delete from inventory_management where Item_Code='" + itemcodetxt.getText()+"'";
            try {
                pst = con.prepareStatement(quary);
                //int eavailable=
                pst.execute();
                JOptionPane.showMessageDialog(rootPane, "Row deleted", "", JOptionPane.INFORMATION_MESSAGE);
              //  new schedulemain();
                //this.dispose();

                //System.out.println(sqlq);
            } catch (Exception e) {
                System.err.print(e);
                JOptionPane.showMessageDialog(rootPane, "InventoryDetails deletion failure", "Error", JOptionPane.ERROR_MESSAGE);
            }
            new InventoryDetails().setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_DeletebtnActionPerformed

    private void PRINTbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTbtnActionPerformed
        
        try {
                    boolean complete=jTable1.print();
                    if(complete){
                        
                        JOptionPane.showMessageDialog(null, "Done Printing...");
                        
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "Printing...");
                    }   } catch (PrinterException ex) {
                    Logger.getLogger(SupplierDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
        
    }//GEN-LAST:event_PRINTbtnActionPerformed

    private void DemobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemobtnActionPerformed
        // TODO add your handling code here:
         itemcodetxt.setText("213");
        java.util.Date date1=new java.util.Date();
         java.util.Date date2=new java.util.Date();
        ItemNametxt.setText("daad");
       // ItemCodecmb.setSelectedItem(1);
        //ItemNamecmb.setSelectedItem(2);
        Available_Quantitytxt.setText("56");
        stocktxt.setText("100");
        Cost_Per_Itemtxt.setText("50.00");
        Supplier_Nametxt.setText("Amal");
        expiredate.setDate(date1);
        issuedate.setDate(date2);
        Customer_Nametxt.setText("Kasun");
        
        
    }//GEN-LAST:event_DemobtnActionPerformed

    private void stocktxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stocktxtKeyTyped
      // TODO add your handling code here:
       char v = evt.getKeyChar();
        if (Character.isLetter(v)) {
            evt.consume();
        }
    }//GEN-LAST:event_stocktxtKeyTyped

    private void ItemNametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemNametxtKeyTyped
      // TODO add your handling code here:
       char v = evt.getKeyChar();
        if (Character.isDigit(v)) {
            evt.consume();
        }
    }//GEN-LAST:event_ItemNametxtKeyTyped

    private void Supplier_NametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Supplier_NametxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (Character.isDigit(v)) {
            evt.consume();
        }
    }//GEN-LAST:event_Supplier_NametxtKeyTyped

    private void Customer_NametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Customer_NametxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (Character.isDigit(v)) {
            evt.consume();
        }
    }//GEN-LAST:event_Customer_NametxtKeyTyped

    private void Cost_Per_ItemtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cost_Per_ItemtxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (Character.isLetter(v)) {
            evt.consume();
        }
        
        
    }//GEN-LAST:event_Cost_Per_ItemtxtKeyTyped

    private void Available_QuantitytxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Available_QuantitytxtKeyTyped
        // TODO add your handling code here:
        char v = evt.getKeyChar();
        if (Character.isLetter(v)) {
            evt.consume();
        }
    }//GEN-LAST:event_Available_QuantitytxtKeyTyped

    private void itemcodetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodetxtKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_itemcodetxtKeyTyped

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
            java.util.logging.Logger.getLogger(InventoryDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField Available_Quantitytxt;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField Cost_Per_Itemtxt;
    private javax.swing.JTextField Customer_Nametxt;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Demobtn;
    private javax.swing.JTextField ItemNametxt;
    private javax.swing.JButton PRINTbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField Supplier_Nametxt;
    private javax.swing.JButton Update;
    private com.toedter.calendar.JDateChooser expiredate;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JTextField itemcodetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField stocktxt;
    // End of variables declaration//GEN-END:variables
}
