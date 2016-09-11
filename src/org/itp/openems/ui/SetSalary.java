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
        SaveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        roleLbl = new javax.swing.JLabel();
        basicSalLbl = new javax.swing.JLabel();
        epfLbl = new javax.swing.JLabel();
        etfLbl = new javax.swing.JLabel();
        nopayLbl = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        demoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Set Salary");

        jLabel1.setText("Role");

        jLabel2.setText("Basic Salary");

        jLabel3.setText("EPF");

        jLabel4.setText("ETF");

        jLabel5.setText("No of leaves for no pay");

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        demoBtn.setText("Demo");
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etfTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nopayLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(basicSalaryTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nopayTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(epfTxt)
                            .addComponent(roleCmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)
                            .addComponent(basicSalLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(epfLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etfLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(searchBtn)))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SaveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn)
                .addGap(5, 5, 5)
                .addComponent(CancelBtn)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchBtn))
                .addGap(3, 3, 3)
                .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basicSalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nopayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nopayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(CancelBtn)
                    .addComponent(updateBtn)
                    .addComponent(demoBtn))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        clear1();
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
                    clear2();
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
                    clear2();
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
            
        }

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        clear1();
        if (roleCmb.getSelectedItem().toString().equals("--Select--")){
            JOptionPane.showMessageDialog(null,"No role is selected to update salary","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(basicSalaryTxt.getText().isEmpty() || epfTxt.getText().isEmpty() || etfTxt.getText().isEmpty() || nopayTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please press the search button to load salary details","Error",JOptionPane.ERROR_MESSAGE);
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
                    clear1();
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
                clear2();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        //roleLbl.setText(null);
        clear1();
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
                    clear1();
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

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        this.roleCmb.setSelectedItem("Driver");
        this.basicSalaryTxt.setText("20000");
        this.epfTxt.setText("0.1");
        this.etfTxt.setText("0.1");
        this.nopayTxt.setText("10");
    }//GEN-LAST:event_demoBtnActionPerformed

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

    private void clear1() {
        epfLbl.setText(null);
        etfLbl.setText(null);
        basicSalLbl.setText(null);
        roleLbl.setText(null);
        nopayLbl.setText(null);

    }
    private void clear2(){
        basicSalaryTxt.setText(null);
        epfTxt.setText(null);
        etfTxt.setText(null);
        nopayTxt.setText(null);
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
    private javax.swing.JLabel nopayLbl;
    private javax.swing.JTextField nopayTxt;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
