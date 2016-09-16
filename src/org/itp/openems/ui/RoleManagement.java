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
import org.itp.commons.Validation;
/**
 *
 * @author THISURA THEJITH
 */
public class RoleManagement extends javax.swing.JFrame {

    /**
     * Creates new form RoleManagement
     */
    public RoleManagement() {
        initComponents();
        tableload();
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }

    public void tableload() {
        try {

            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_TABLE);
            ResultSet resultset = preparedStatement.executeQuery();
            roleTable.setModel(DbUtils.resultSetToTableModel(resultset));
        } catch (SQLException e) {
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
        roleName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        roleDesc = new javax.swing.JTextArea();
        roleNameLbl = new javax.swing.JLabel();
        descLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        roleTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BackBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Role Management");

        jLabel1.setText("Role Name");

        jLabel2.setText("Role Description");

        roleName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                roleNameFocusLost(evt);
            }
        });

        roleDesc.setColumns(20);
        roleDesc.setRows(5);
        roleDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roleDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                roleDescFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(roleDesc);

        roleNameLbl.setForeground(new java.awt.Color(255, 0, 51));

        descLbl.setForeground(new java.awt.Color(255, 0, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N

        roleTable.setModel(new javax.swing.table.DefaultTableModel(
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
        roleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roleTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(roleTable);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BackBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackBtn)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(roleNameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roleName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(roleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(roleNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
            this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //roleNameLbl.setText(null);
        //descLbl.setText(null);
        if (validateFields()) {
            try {
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Insert.ROLE);
                preparedStatement.setString(1, this.roleName.getText());
                preparedStatement.setString(2, this.roleDesc.getText());
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("affected rows=" + affectedRows);
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.roleName.setText("");
                this.roleDesc.setText("");
                tableload();

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void roleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roleTableMouseClicked
        roleNameLbl.setText(null);
        descLbl.setText(null);
        updateBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        int i = roleTable.getSelectedRow();
        TableModel model = roleTable.getModel();
        roleName.setText(model.getValueAt(i, 1).toString());
        roleDesc.setText(model.getValueAt(i, 2).toString());
        SaveBtn.setEnabled(false);
    }//GEN-LAST:event_roleTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = roleTable.getSelectedRow();
        if (validateFields()) {
            try {

                if (selectedRow != -1) {
                    int RoleID = (int) roleTable.getValueAt(selectedRow, 0);
                    
                    try {
                        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Update.ROLE);
                        preparedStatement.setString(1, this.roleName.getText());
                        preparedStatement.setString(2, this.roleDesc.getText());
                        preparedStatement.setInt(3, RoleID);
                        int affectedRows = preparedStatement.executeUpdate();
                        System.out.println("affected rows=" + affectedRows);
                        preparedStatement.close();
                        JOptionPane.showMessageDialog(null, "Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        roleName.setText(null);
                        roleDesc.setText(null);
                        tableload();
                        updateBtn.setEnabled(false);
                        deleteBtn.setEnabled(false);
                        SaveBtn.setEnabled(true);

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Role update failed", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex);
                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Please select a record to update", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a record to update", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = roleTable.getSelectedRow();
        if (validateFields()) {
            try {

                if (selectedRow != -1) {
                    int RoleID = (int) roleTable.getValueAt(selectedRow, 0);
                    
                    try {
                        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Update.ROLE_DELETE);
                        preparedStatement.setInt(1, RoleID);
                        int affectedRows = preparedStatement.executeUpdate();
                        System.out.println("affected rows=" + affectedRows);
                        preparedStatement.close();
                        JOptionPane.showMessageDialog(null, "Role deleted Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                        roleName.setText(null);
                        roleDesc.setText(null);
                        tableload();
                        updateBtn.setEnabled(false);
                        deleteBtn.setEnabled(false);
                        SaveBtn.setEnabled(true);

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Role delete failed", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println(ex);
                        return;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Please select a record to delete", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        roleNameLbl.setText(null);
        descLbl.setText(null);
        roleName.setText(null);
        roleDesc.setText(null);
        tableload();
        SaveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void roleDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roleDescFocusGained
        if(roleName.getText().isEmpty()){
            roleNameLbl.setText("*Necessary field");
        }
    }//GEN-LAST:event_roleDescFocusGained

    private void roleNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roleNameFocusLost
        if (!Validation.ValidName(this.roleName.getText())) {
                    roleNameLbl.setText("*Invalid Role name");
            }
        if (this.roleName.getText().isEmpty()) {
                    roleNameLbl.setText("*Necessary field");
            }
        else{
            roleNameLbl.setText(null);
        }
    }//GEN-LAST:event_roleNameFocusLost

    private void roleDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roleDescFocusLost
        if (this.roleDesc.getText().isEmpty()) {
                    descLbl.setText("*Necessary field");
            }
        else{
            descLbl.setText(null);
        }
    }//GEN-LAST:event_roleDescFocusLost
    
    
    private boolean validateFields() {
        if (roleName.getText().isEmpty() || roleDesc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necessary fields cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            roleNameLbl.setText(null);
            descLbl.setText(null);
            boolean isValid = true;
            if (!Validation.ValidName(this.roleName.getText())) {
                    roleNameLbl.setText("*Invalid Role name");
                    isValid=false;
                }
            if(roleDesc.getText().isEmpty()){
                    descLbl.setText("*Enter a description for the role");
                    JOptionPane.showMessageDialog(null,"Please enter a role description","Error",JOptionPane.ERROR_MESSAGE);
                    isValid=false;
            }
           
            if (!isValid) {
                JOptionPane.showMessageDialog(null, "One or more fields are invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return isValid;
        }
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
            java.util.logging.Logger.getLogger(RoleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoleManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel descLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea roleDesc;
    private javax.swing.JTextField roleName;
    private javax.swing.JLabel roleNameLbl;
    private javax.swing.JTable roleTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
