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
        updateBtn.setEnabled(false);
    }

    public void tableload() {
        try {

            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            //AbstractTableModel table = null;
            String query = "Select * from Salary";
            PreparedStatement preparedStatement = connect.prepareStatement(query);
            ResultSet resultset = preparedStatement.executeQuery();
            salaryTable.setModel(DbUtils.resultSetToTableModel(resultset));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        demoBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nopayLbl = new javax.swing.JLabel();
        nopayTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etfLbl = new javax.swing.JLabel();
        etfTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        epfLbl = new javax.swing.JLabel();
        epfTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        basicSalLbl = new javax.swing.JLabel();
        basicSalaryTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roleLbl = new javax.swing.JLabel();
        roleCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Salary");
        setExtendedState(5);
        setSize(new java.awt.Dimension(632, 482));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 470, -1));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        demoBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        demoBtn.setText("Demo");
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });
        jPanel2.add(demoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 36, 75, 34));

        SaveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 36, 76, 34));

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 36, 91, 34));

        CancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 36, 85, 36));

        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 36, -1, 36));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b1.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 470, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Salary"));

        nopayLbl.setForeground(new java.awt.Color(255, 0, 51));

        nopayTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nopayTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nopayTxtFocusLost(evt);
            }
        });

        jLabel5.setText("No of leaves for no pay");

        etfLbl.setForeground(new java.awt.Color(255, 0, 51));

        etfTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                etfTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                etfTxtFocusLost(evt);
            }
        });

        jLabel4.setText("ETF(Percentage%)");

        epfLbl.setForeground(new java.awt.Color(255, 0, 51));

        epfTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                epfTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                epfTxtFocusLost(evt);
            }
        });

        jLabel3.setText("EPF(Percentage%)");

        basicSalLbl.setForeground(new java.awt.Color(255, 0, 51));

        basicSalaryTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                basicSalaryTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                basicSalaryTxtFocusLost(evt);
            }
        });
        basicSalaryTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basicSalaryTxtMouseClicked(evt);
            }
        });

        jLabel2.setText("Basic Salary");

        roleLbl.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setText("Role");

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basicSalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nopayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nopayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basicSalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nopayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nopayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 400, 330));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //clearlabels();
        try {
                roleLbl.setText("");
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
        if(validateFields()){
            
            
        
        
            try {

                 
                    //clearlabels();
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
                

            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }
        

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //clearlabels();
       if(validateFields()) {
            try {
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
                SaveBtn.setEnabled(true);
                searchBtn.setEnabled(true);
                updateBtn.setEnabled(false);
            } catch (SQLException e) {
                System.out.println(e);
            }
       }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        this.roleCmb.setSelectedItem("Driver");
        this.basicSalaryTxt.setText("20000");
        this.epfTxt.setText("10");
        this.etfTxt.setText("10");
        this.nopayTxt.setText("20");
    }//GEN-LAST:event_demoBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //roleLbl.setText(null);
        basicSalaryTxt.setText(null);
        epfTxt.setText(null);
        etfTxt.setText(null);
        nopayTxt.setText(null);
        clearlabels();
        
        SaveBtn.setEnabled(false);

        if (roleCmb.getSelectedItem().toString().equals("--Select--")) {
            cleartext();
            roleLbl.setText("*Please select a role");
            JOptionPane.showMessageDialog(null, "You haven't selected a role", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            updateBtn.setEnabled(true);
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
                    JOptionPane.showMessageDialog(null, "A salary for this role is not defined", "Error", JOptionPane.ERROR_MESSAGE);
                    clearlabels();
                    SaveBtn.setEnabled(true);
                    updateBtn.setEnabled(false);
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
        clearlabels();
        SaveBtn.setEnabled(false);
        searchBtn.setEnabled(false);
        updateBtn.setEnabled(true);
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
        updateBtn.setEnabled(false);
        SaveBtn.setEnabled(true);
        searchBtn.setEnabled(true);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void basicSalaryTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basicSalaryTxtMouseClicked
        if (basicSalaryTxt.getText().isEmpty()) {
            SaveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_basicSalaryTxtMouseClicked

    private void basicSalaryTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basicSalaryTxtFocusLost
        if (this.basicSalaryTxt.getText().isEmpty()) {
            basicSalLbl.setText("*Necessary Field");
        } else if (!Validation.ValidDigits(this.basicSalaryTxt.getText())) {
            basicSalLbl.setText("*Invalid Salary");
        } else if (Double.parseDouble(this.basicSalaryTxt.getText()) < 0) {
            basicSalLbl.setText("*Salary cannot be negative");
        }
        else{
            basicSalLbl.setText(null);
        }
    }//GEN-LAST:event_basicSalaryTxtFocusLost

    private void epfTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epfTxtFocusLost
        if (this.epfTxt.getText().isEmpty()) {
            epfLbl.setText("*Necessary Field");
        } 
        else if (!Validation.ValidDigits(this.epfTxt.getText())) {
            epfLbl.setText("*Invalid EPF");
        }else if (!Validation.ValidPercentage(this.epfTxt.getText())) {
            epfLbl.setText("*EPF can't be > 100");
        } else if (Double.parseDouble(this.epfTxt.getText()) < 0) {
            epfLbl.setText("*EPF cannot be negative");
        }
        else{
            epfLbl.setText(null);
        }
    }//GEN-LAST:event_epfTxtFocusLost

    private void etfTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etfTxtFocusLost
        if (this.etfTxt.getText().isEmpty()) {
            etfLbl.setText("*Necessary Field");
        }
        else if (!Validation.ValidDigits(this.etfTxt.getText())) {
            etfLbl.setText("*Invalid ETF");
        }else if (!Validation.ValidPercentage(this.etfTxt.getText())) {
            etfLbl.setText("*ETF can't be > 100");
        } else if (Double.parseDouble(this.etfTxt.getText()) < 0) {
            etfLbl.setText("*ETF cannot be negative");
        }
        else{
            etfLbl.setText(null);
        }
    }//GEN-LAST:event_etfTxtFocusLost

    private void nopayTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nopayTxtFocusLost
        if (this.nopayTxt.getText().isEmpty()) {
            nopayLbl.setText("*Necessary Field");
        } else if (!Validation.ValidDigits(this.nopayTxt.getText())) {
            nopayLbl.setText("*Invalid Leave amount");
        } else if (Integer.parseInt(this.nopayTxt.getText()) < 0) {
            nopayLbl.setText("*Leaves cannot be negative");
        }
        else{
            nopayLbl.setText(null);
        }
    }//GEN-LAST:event_nopayTxtFocusLost

    private void epfTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epfTxtFocusGained
        if (!roleCmb.getSelectedItem().toString().equals("--Select--")){
            roleLbl.setText(null);
        }
        if (this.basicSalaryTxt.getText().isEmpty()) {
            basicSalLbl.setText("*Necessary Field");
        }
    }//GEN-LAST:event_epfTxtFocusGained

    private void etfTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etfTxtFocusGained
        if (!roleCmb.getSelectedItem().toString().equals("--Select--")){
            roleLbl.setText(null);
        }
        if (this.basicSalaryTxt.getText().isEmpty()||this.epfTxt.getText().isEmpty()) {
            if(this.basicSalaryTxt.getText().isEmpty()){
                basicSalLbl.setText("*Necessary Field");
            }
            if(this.epfTxt.getText().isEmpty()){
                epfLbl.setText("*Necessary Field");
            }
        }
    }//GEN-LAST:event_etfTxtFocusGained

    private void nopayTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nopayTxtFocusGained
        if (!roleCmb.getSelectedItem().toString().equals("--Select--")){
            roleLbl.setText(null);
        }
        if (this.basicSalaryTxt.getText().isEmpty()||this.epfTxt.getText().isEmpty()||this.etfTxt.getText().isEmpty()) {
            if(this.basicSalaryTxt.getText().isEmpty()){
                basicSalLbl.setText("*Necessary Field");
            }
            if(this.epfTxt.getText().isEmpty()){
                epfLbl.setText("*Necessary Field");
            }
            if(this.etfTxt.getText().isEmpty()){
                etfLbl.setText("*Necessary Field");
            }
        }
    }//GEN-LAST:event_nopayTxtFocusGained

    private void basicSalaryTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basicSalaryTxtFocusGained
        if (!roleCmb.getSelectedItem().toString().equals("--Select--")){
            roleLbl.setText(null);
        }
        else{
            roleLbl.setText("*Please select a role");
        }
    }//GEN-LAST:event_basicSalaryTxtFocusGained

    private boolean validateFields() {
        if (roleCmb.getSelectedItem().toString().equals("--Select--")) {
            roleLbl.setText("Please select a role");
            JOptionPane.showMessageDialog(null, "You haven't selected a role", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        roleLbl.setText("");
        if (basicSalaryTxt.getText().isEmpty() || epfTxt.getText().isEmpty() || etfTxt.getText().isEmpty() || nopayTxt.getText().isEmpty()) {
            if(basicSalaryTxt.getText().isEmpty()){
                basicSalLbl.setText("*This field is necessary");
            }
            if(epfTxt.getText().isEmpty()){
                epfLbl.setText("*This field is necessary");
            }
            if(etfTxt.getText().isEmpty()){
                etfLbl.setText("*This field is necessary");
            }
            if(nopayTxt.getText().isEmpty()){
                nopayLbl.setText("*This field is necessary");
            }
            
            JOptionPane.showMessageDialog(null, "Necessary fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            clearlabels();
            boolean isValid = true;
        
        if (!Validation.ValidDigits(this.basicSalaryTxt.getText())) {
            basicSalLbl.setText("*Invalid Salary");
            isValid = false;
        }else if (Double.parseDouble(this.basicSalaryTxt.getText()) < 0) {
            basicSalLbl.setText("*Salary cannot be negative");
            isValid = false;
        }
        if (!Validation.ValidDigits(this.epfTxt.getText())) {
            epfLbl.setText("*Invalid EPF");
            isValid = false;
        }else if (Double.parseDouble(this.epfTxt.getText()) < 0) {
            epfLbl.setText("*EPF cannot be negative");
            isValid = false;
        }else if (!Validation.ValidPercentage(this.epfTxt.getText())) {
            epfLbl.setText("*EPF can't be > 100");
            isValid = false;
        }
        if (!Validation.ValidDigits(this.etfTxt.getText())) {
            etfLbl.setText("*Invalid ETF");
            isValid = false;
        }else  if (Double.parseDouble(this.etfTxt.getText()) < 0) {
            etfLbl.setText("*ETF cannot be negative");
            isValid = false;
        }else if (!Validation.ValidPercentage(this.etfTxt.getText())) {
            etfLbl.setText("*ETF can't be > 100");
            isValid = false;
        }
        if (!Validation.ValidDigits(this.nopayTxt.getText())) {
            nopayLbl.setText("*Invalid Leave amount");
            isValid = false;
        }else if (Integer.parseInt(this.nopayTxt.getText()) < 0) {
            nopayLbl.setText("*Leaves cannot be negative");
            isValid = false;
        }
        
        if (!isValid) {
                JOptionPane.showMessageDialog(null, "One or more fields are invalid", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return isValid;
        }
    }

    private void clearlabels() {
        epfLbl.setText(null);
        etfLbl.setText(null);
        basicSalLbl.setText(null);
        roleLbl.setText(null);
        nopayLbl.setText(null);

    }

    private void cleartext() {
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
