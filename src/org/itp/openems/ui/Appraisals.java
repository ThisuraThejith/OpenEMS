/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.DBUtils;
import org.itp.commons.Queries;
import org.itp.commons.Validation;

/**
 *
 * @author THISURA THEJITH
 */
public class Appraisals extends javax.swing.JFrame {

    /**
     * Creates new form Appraisals
     */
    public Appraisals() {
        initComponents();
        tableload();
        updateBtn.setEnabled(false);
    }
    public void tableload(){
        try{
        
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_APPRAISAL_TABLE);
        ResultSet resultset = preparedStatement.executeQuery();
        appraisalTable.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    
    public void tableload(String keyword) {
        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.SEARCH_APPRAISALS);
            for (int i = 1; i < 6; i++) {
                preparedStatement.setString(i, "%" + keyword + "%");
            }
            ResultSet resultset = preparedStatement.executeQuery();
            while (appraisalTable.getRowCount() > 0) {
                ((DefaultTableModel) appraisalTable.getModel()).removeRow(0);
            }
            int columns = resultset.getMetaData().getColumnCount();
            while (resultset.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = resultset.getObject(i);
                }
                ((DefaultTableModel) appraisalTable.getModel()).insertRow(resultset.getRow() - 1, row);
            }

            resultset.close();
        } catch (SQLException e) {

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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bonusTxt = new javax.swing.JTextField();
        reviewsTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        nicLbl = new javax.swing.JLabel();
        bonusLbl = new javax.swing.JLabel();
        reviewsLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        demoBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appraisalTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        searchkBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Appraisals");

        jLabel1.setText("NIC No");

        jLabel3.setText("Bonus");

        jLabel5.setText("Reviews");

        nicTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nicTxtMouseClicked(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        nicLbl.setForeground(new java.awt.Color(255, 0, 51));

        bonusLbl.setForeground(new java.awt.Color(255, 0, 51));

        reviewsLbl.setForeground(new java.awt.Color(255, 0, 51));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        demoBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        demoBtn.setText("Demo");
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });

        insertBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(demoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Appraisal details"));

        appraisalTable.setModel(new javax.swing.table.DefaultTableModel(
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
        appraisalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appraisalTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appraisalTable);

        jLabel2.setText("Search Keyword");

        searchkBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchkBtn.setText("Search Key");
        searchkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchkBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchkBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nicTxt)
                                            .addComponent(bonusTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                            .addComponent(reviewsTxt)
                                            .addComponent(bonusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchBtn))
                                    .addComponent(reviewsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bonusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bonusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reviewsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reviewsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    int employeeID = 0;
    int appraisalID = 0;
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        updateBtn.setEnabled(true);
        nicLbl.setText(null);
        clear();
        if (nicTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the NIC No", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                if (!Validation.ValidNIC(this.nicTxt.getText())) {
                    nicLbl.setText("*Invalid NIC No");
                    JOptionPane.showMessageDialog(null, "The NIC No is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (Validation.ValidNIC(this.nicTxt.getText())) {
                    clear();
                    Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                    PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
                    preparedStatement.setString(1, this.nicTxt.getText());
                    ResultSet resultset = preparedStatement.executeQuery();
                    int count = 0;
                    while (resultset.next()) {
                        employeeID = resultset.getInt("EmployeeID");
                        count++;
                    }
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "An employee with this NIC No is not present", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultset.close();
                    preparedStatement.close();
                    connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                    preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_APPRAISAL_BY_EMPLOYEE_ID);
                    preparedStatement.setInt(1, employeeID);
                    resultset = preparedStatement.executeQuery();
                    int count1 = 0;
                    while (resultset.next()) {
                        this.bonusTxt.setText(resultset.getString("Bonus"));
                        this.reviewsTxt.setText(resultset.getString("Reviews"));
                        count1++;
                    }
                    if (count1 == 0) {
                        JOptionPane.showMessageDialog(null, "An appraisal for this employee is not present", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultset.close();
                    preparedStatement.close();
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        nicLbl.setText(null);
                
        if (nicTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employee to update", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (bonusTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please press the search button or select a record to load appraisal details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!Validation.ValidDigits(this.bonusTxt.getText())) {
            bonusLbl.setText("*Invalid bonus");
            JOptionPane.showMessageDialog(null, "The bonus is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (Double.parseDouble(this.bonusTxt.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "Bonus cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            bonusLbl.setText(null);
            try {
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
                preparedStatement.setString(1, this.nicTxt.getText());
                ResultSet resultset = preparedStatement.executeQuery();
                int count = 0;
                while (resultset.next()) {
                    employeeID = resultset.getInt("EmployeeID");
                    count++;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "You haven't pressed the search button.An employee with this NIC No doesn't exist", "Error", JOptionPane.ERROR_MESSAGE);
                    clear();
                    return;
                }
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_APPRAISAL_ID_BY_EMPLOYEE_ID);
                preparedStatement.setInt(1, employeeID);
                resultset = preparedStatement.executeQuery();
                int count1 = 0;
                while (resultset.next()) {
                    appraisalID = resultset.getInt("AppraisalID");
                    count1++;
                }
                if (count1 == 0) {
                    JOptionPane.showMessageDialog(null, "Can't update a non-existing record", "Error", JOptionPane.ERROR_MESSAGE);
                    clear();
                    return;
                }

                resultset.close();
                preparedStatement.close();
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Update.APPRAISAL);
                preparedStatement.setString(1, this.bonusTxt.getText());
                preparedStatement.setString(2, this.reviewsTxt.getText());
                preparedStatement.setInt(3, employeeID);
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("affected rows=" + affectedRows);
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                tableload();
                nicTxt.setText(null);
                clear();
                updateBtn.setEnabled(false);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        nicLbl.setText(null);
        if (nicTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No employee to insert the appraisal", "Error", JOptionPane.ERROR_MESSAGE);
            clear();
            return;
        } else if (!Validation.ValidNIC(this.nicTxt.getText())) {
            nicLbl.setText("*Invalid NIC No");
            JOptionPane.showMessageDialog(null, "The NIC No is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            bonusLbl.setText(null);
            try {
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
                preparedStatement.setString(1, this.nicTxt.getText());
                ResultSet resultset = preparedStatement.executeQuery();
                int count = 0;
                while (resultset.next()) {
                    employeeID = resultset.getInt("EmployeeID");
                    count++;
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "An employee with this NIC No is not registered", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                resultset.close();
                preparedStatement.close();
                
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_APPRAISAL_ID_BY_EMPLOYEE_ID);
                preparedStatement.setInt(1, employeeID);
                resultset = preparedStatement.executeQuery();
                int count1 = 0;
                while (resultset.next()) {
                    appraisalID = resultset.getInt("AppraisalID");
                    count1++;
                }
                if (count1 != 0) {
                    JOptionPane.showMessageDialog(null, "This employee already has an appraisal ", "Error", JOptionPane.ERROR_MESSAGE);
                    nicLbl.setText(null);
                    return;
                }

                resultset.close();
                preparedStatement.close();

                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
                preparedStatement.setString(1, this.nicTxt.getText());
                resultset = preparedStatement.executeQuery();
                int count2 = 0;
                while (resultset.next()) {
                    employeeID = resultset.getInt("EmployeeID");
                    count2++;
                }
                resultset.close();
                preparedStatement.close();
                
                
                if (bonusTxt.getText().isEmpty()){
                    bonusLbl.setText("*Insert the bonus amount");
                    JOptionPane.showMessageDialog(null, "You havent inserted the bonus of this employee", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else if (Double.parseDouble(this.bonusTxt.getText()) < 0) {
                    JOptionPane.showMessageDialog(null, "Bonus cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                preparedStatement = connect.prepareStatement(Queries.EMS.Insert.APPRAISALS);
                preparedStatement.setInt(1, employeeID);
                preparedStatement.setString(2, this.bonusTxt.getText());
                preparedStatement.setString(3, this.reviewsTxt.getText());

                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("affected rows=" + affectedRows);
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Inserted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                tableload();
                clear();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        this.nicTxt.setText("942811110v");
    }//GEN-LAST:event_demoBtnActionPerformed

    private void appraisalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appraisalTableMouseClicked
        updateBtn.setEnabled(true);
        insertBtn.setEnabled(false);
        int i = appraisalTable.getSelectedRow();
        TableModel model = appraisalTable.getModel();
        nicTxt.setText(model.getValueAt(i, 3).toString());
        bonusTxt.setText(model.getValueAt(i, 5).toString());
        reviewsTxt.setText(model.getValueAt(i, 6).toString());
        insertBtn.setEnabled(false);
    }//GEN-LAST:event_appraisalTableMouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
        updateBtn.setEnabled(false);
        insertBtn.setEnabled(true);
        nicTxt.setText(null);
        reviewsLbl.setText(null);
        bonusLbl.setText(null);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void nicTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicTxtMouseClicked
        if(nicTxt.getText().isEmpty()){
            insertBtn.setEnabled(true);
        }
    }//GEN-LAST:event_nicTxtMouseClicked

    private void searchkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchkBtnActionPerformed
        if(this.searchTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a search keyword","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String keyword = searchTxt.getText();
            tableload(keyword);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_searchkBtnActionPerformed
    private void clear() {
        reviewsTxt.setText(null);
        bonusTxt.setText(null);
        nicLbl.setText(null);

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
            java.util.logging.Logger.getLogger(Appraisals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appraisals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appraisals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appraisals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appraisals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appraisalTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel bonusLbl;
    private javax.swing.JTextField bonusTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton demoBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nicLbl;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JLabel reviewsLbl;
    private javax.swing.JTextField reviewsTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton searchkBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
