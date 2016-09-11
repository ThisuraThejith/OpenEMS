/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.ui;

import java.sql.PreparedStatement;
import org.itp.commons.Queries;
import java.sql.Connection;
import java.sql.ResultSet;
import org.itp.commons.DBConnect;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.itp.commons.Constants;
import org.itp.commons.DBUtils;
import org.itp.commons.Validation;


/**
 *
 * @author THISURA THEJITH
 */
public class SetSalary extends javax.swing.JFrame {

    /**
     * Creates new form SetSalary
     */
    public SetSalary() {
        initComponents();
        roleCmb.addItem("--Select--");
        DBUtils.loadRoles(roleCmb);
        tableload();
    }
    
    public void tableload(){
        try{
        
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        //AbstractTableModel table = null;
        String query="Select * from Salary";
        PreparedStatement preparedStatement = connect.prepareStatement(query);
        ResultSet resultset = preparedStatement.executeQuery();
        salaryTable.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch (SQLException e){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roleCmb = new javax.swing.JComboBox<>();
        basicSalaryTxt = new javax.swing.JTextField();
        epfTxt = new javax.swing.JTextField();
        etfTxt = new javax.swing.JTextField();
        nopayTxt = new javax.swing.JTextField();
        roleLbl = new javax.swing.JLabel();
        basicSalLbl = new javax.swing.JLabel();
        epfLbl = new javax.swing.JLabel();
        etfLbl = new javax.swing.JLabel();
        nopayLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        demoBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Set Salary");
        setSize(new java.awt.Dimension(632, 482));

        jLabel1.setText("Role");

        jLabel2.setText("Basic Salary");

        jLabel3.setText("EPF");

        jLabel4.setText("ETF");

        jLabel5.setText("No of leaves for no pay");

        basicSalaryTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicSalaryTxtMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Salary details"));

        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        salaryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salaryTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        demoBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        demoBtn.setText("Demo");
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        CancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(demoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(demoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nopayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(177, 177, 177)
                                            .addComponent(nopayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(177, 177, 177)
                                            .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(177, 177, 177)
                                            .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(177, 177, 177)
                                            .addComponent(basicSalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel1)
                                        .addGap(121, 121, 121)
                                        .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(searchBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)
                                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(basicSalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(nopayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nopayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        clearlabels();
        if (roleCmb.getSelectedItem().toString().equals("--Select--")) {
            roleLbl.setText("Please select a role");
            JOptionPane.showMessageDialog(null, "You haven't selected a role", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            try {
                int roleID = 0;
                int salaryID = 0;
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_NAME);
                preparedStatement.setString(1, this.roleCmb.getSelectedItem().toString());
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    roleID = resultset.getInt("RoleID");
                }
                resultset.close();
                preparedStatement.close();

                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_SALARY_ID_BY_ROLE_ID);
                preparedStatement.setInt(1, roleID);
                resultset = preparedStatement.executeQuery();
                int count = 0;
                while (resultset.next()) {
                    salaryID = resultset.getInt("SalaryID");
                    count++;
                }
                if (count != 0) {
                    JOptionPane.showMessageDialog(null, "This role already has an assigned salary", "Error", JOptionPane.ERROR_MESSAGE);
                    cleartext();
                    return;
                }
                resultset.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        
        if (basicSalaryTxt.getText().isEmpty() || epfTxt.getText().isEmpty() || etfTxt.getText().isEmpty() || nopayTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields Cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        else {
            
            try {

                if (!validateFields()) {
                    JOptionPane.showMessageDialog(null, "One or more fields are invalid", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }
                else {
                    int roleID = 0;
                    Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                    PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_NAME);
                    preparedStatement.setString(1, this.roleCmb.getSelectedItem().toString());
                    ResultSet resultset = preparedStatement.executeQuery();
                    while (resultset.next()) {
                        roleID = resultset.getInt("RoleID");
                    }
                    resultset.close();
                    preparedStatement.close();
                    
                    
                    if (Double.parseDouble(this.basicSalaryTxt.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "Basic Salary cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                    preparedStatement = connect.prepareStatement(Queries.EMS.Insert.SALARY);
                    preparedStatement.setInt(1, roleID);
                    preparedStatement.setDouble(2, Double.parseDouble(this.basicSalaryTxt.getText()));
                    preparedStatement.setFloat(3, Float.parseFloat(this.epfTxt.getText()));
                    preparedStatement.setFloat(4, Float.parseFloat(this.etfTxt.getText()));
                    preparedStatement.setInt(5, Integer.parseInt(this.nopayTxt.getText()));
                    int affectedRows = preparedStatement.executeUpdate();
                    System.out.println("affected rows=" + affectedRows);
                    preparedStatement.close();
                    JOptionPane.showMessageDialog(null, "Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    tableload();
                    cleartext();
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        clearlabels();
        if (roleCmb.getSelectedItem().toString().equals("--Select--")){
            JOptionPane.showMessageDialog(null,"No role or record is selected to update salary","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(basicSalaryTxt.getText().isEmpty() || epfTxt.getText().isEmpty() || etfTxt.getText().isEmpty() || nopayTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please press the search button or select a record to update","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(!validateFields()){
            JOptionPane.showMessageDialog(null,"One or more fields are invalid", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            try {
                int roleID = 0;
                int salaryID = 0;
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_NAME);
                preparedStatement.setString(1, this.roleCmb.getSelectedItem().toString());
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    roleID = resultset.getInt("RoleID");
                }
                resultset.close();
                preparedStatement.close();
                
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_SALARY_ID_BY_ROLE_ID);
                preparedStatement.setInt(1, roleID);
                resultset = preparedStatement.executeQuery();
                int count = 0;
                while (resultset.next()) {
                    salaryID = resultset.getInt("SalaryID");
                    count++;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Can't update a non existing record", "Error", JOptionPane.ERROR_MESSAGE);
                    clearlabels();
                    return;
                }
                resultset.close();
                preparedStatement.close();
                preparedStatement = connect.prepareStatement(Queries.EMS.Update.SALARY);
                preparedStatement.setString(1, this.basicSalaryTxt.getText());
                preparedStatement.setString(2, this.epfTxt.getText());
                preparedStatement.setString(3, this.etfTxt.getText());
                preparedStatement.setString(4, this.nopayTxt.getText());
                preparedStatement.setInt(5, roleID);
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("affected rows=" + affectedRows);
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                tableload();
                cleartext();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        this.roleCmb.setSelectedItem("Manager");
        this.basicSalaryTxt.setText("20000");
        this.epfTxt.setText("0.1");
        this.etfTxt.setText("0.1");
        this.nopayTxt.setText("10");
    }//GEN-LAST:event_demoBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       //roleLbl.setText(null);
        clearlabels();
        if (roleCmb.getSelectedItem().toString().equals("--Select--")) {
            roleLbl.setText("*Please select a role");
            JOptionPane.showMessageDialog(null, "You haven't selected a role", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                int roleID = 0;
                int salaryID=0;
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_NAME);
                preparedStatement.setString(1, this.roleCmb.getSelectedItem().toString());
                ResultSet resultset = preparedStatement.executeQuery();
                while (resultset.next()) {
                    roleID = resultset.getInt("RoleID");
                }
                resultset.close();
                preparedStatement.close();
                
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_SALARY_ID_BY_ROLE_ID);
                preparedStatement.setInt(1, roleID);
                resultset = preparedStatement.executeQuery();
                int count = 0;
                while (resultset.next()) {
                    salaryID = resultset.getInt("SalaryID");
                    count++;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "A salary for this role is not defined", "Error", JOptionPane.ERROR_MESSAGE);
                    clearlabels();
                    return;
                }
                resultset.close();
                preparedStatement.close();
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_SALARY_BY_ROLE_ID);
                preparedStatement.setInt(1, roleID);
                resultset = preparedStatement.executeQuery();

                int count1 = 0;
                while (resultset.next()) {
                    this.basicSalaryTxt.setText(resultset.getString("BasicSalary"));
                    this.epfTxt.setText(resultset.getString("EPF"));
                    this.etfTxt.setText(resultset.getString("ETF"));
                    this.nopayTxt.setText(resultset.getString("No_of_Leaves_for_no_pay"));
                    count1++;
                }
                
                resultset.close();
                preparedStatement.close();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void salaryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTableMouseClicked
        int i = salaryTable.getSelectedRow();
        TableModel model = salaryTable.getModel();
        roleCmb.setSelectedItem(DBUtils.getRoleNameByID(Integer.parseInt(model.getValueAt(i, 1).toString())));
        basicSalaryTxt.setText(model.getValueAt(i, 2).toString());
        epfTxt.setText(model.getValueAt(i, 3).toString());
        etfTxt.setText(model.getValueAt(i, 4).toString());
        nopayTxt.setText(model.getValueAt(i, 5).toString());    
        SaveBtn.setEnabled(false);
    }//GEN-LAST:event_salaryTableMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearlabels();
        cleartext();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void basicSalaryTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basicSalaryTxtMouseClicked
        if(basicSalaryTxt.getText().isEmpty()){
            SaveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_basicSalaryTxtMouseClicked

    private boolean validateFields() {
        boolean isValid = true;
        if (!Validation.ValidDigits(this.basicSalaryTxt.getText())) {
            basicSalLbl.setText("*Invalid Salary");
            isValid = false;
        } 
        else if (Double.parseDouble(this.basicSalaryTxt.getText()) < 0) {
            basicSalLbl.setText("*Salary cannot be negative");
            isValid = false;
        }
        else if (Double.parseDouble(this.epfTxt.getText()) < 0) {
            epfLbl.setText("*EPF cannot be negative");
            isValid = false;
        }
        else if (Double.parseDouble(this.etfTxt.getText()) < 0) {
            etfLbl.setText("*ETF cannot be negative");
            isValid = false;
        }
        else if (Double.parseDouble(this.nopayTxt.getText()) < 0) {
            nopayLbl.setText("*No pay number cannot be negative");
            isValid = false;
        }
        if (!Validation.ValidDigits(this.epfTxt.getText())) {
            epfLbl.setText("*Invalid EPF");
            isValid = false;
        }

        if (!Validation.ValidDigits(this.etfTxt.getText())) {
            etfLbl.setText("*Invalid ETF");
            isValid = false;
        }
        
        if (!Validation.ValidDigits(this.nopayTxt.getText())) {
            nopayLbl.setText("*Invalid Leave amount");
            isValid = false;
        }
        return isValid;
    }

    private void clearlabels() {
        epfLbl.setText(null);
        etfLbl.setText(null);
        basicSalLbl.setText(null);
        roleLbl.setText(null);
        nopayLbl.setText(null);

    }
    private void cleartext(){
        basicSalaryTxt.setText(null);
        epfTxt.setText(null);
        etfTxt.setText(null);
        nopayTxt.setText(null);
        roleCmb.setSelectedItem("--Select--");
    }

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
            java.util.logging.Logger.getLogger(SetSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel basicSalLbl;
    private javax.swing.JTextField basicSalaryTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton demoBtn;
    private javax.swing.JLabel epfLbl;
    private javax.swing.JTextField epfTxt;
    private javax.swing.JLabel etfLbl;
    private javax.swing.JTextField etfTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nopayLbl;
    private javax.swing.JTextField nopayTxt;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JTable salaryTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
