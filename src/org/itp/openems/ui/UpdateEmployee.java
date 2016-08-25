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
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.DBUtils;
import org.itp.commons.Queries;

/**
 *
 * @author THISURA THEJITH
 */
public class UpdateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        dobTxt = new javax.swing.JTextField();
        cstatusCmb = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        roleCmb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        empIDTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Employee");
        setPreferredSize(new java.awt.Dimension(525, 460));

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("NIC No");
        jLabel3.setToolTipText("");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Role");

        jLabel6.setText("Current Status");

        cstatusCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Working", "Resigned" }));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel7.setText("Employee ID");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nicTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(dobTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cstatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(empIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(searchBtn)
                .addGap(0, 72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(empIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cstatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(updateBtn))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
            MainInterface m1=new MainInterface();
            m1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try{
         
            Connection connect=new DBConnect (Constants.USER,Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement=connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_BY_EMPLOYEE_ID);
            preparedStatement.setString(1,this.empIDTxt.getText());
            ResultSet resultset=preparedStatement.executeQuery();
            while (resultset.next()){
                  this.nameTxt.setText(resultset.getString("EmployeeName"));
                  this.addressTxt.setText(resultset.getString("Address"));
                  this.dobTxt.setText(resultset.getString("Date_of_Birth"));
                  this.nicTxt.setText(resultset.getString("NIC_No"));
                  this.roleCmb.setSelectedItem(DBUtils.getRoleNameByID(resultset.getInt("RoleID")));
                  this.cstatusCmb.setSelectedItem(resultset.getString("Current_Status"));
            }
            resultset.close();
            preparedStatement.close();
            
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try{
            int roleID=0;
            int salaryID=0;
            Connection connect=new DBConnect (Constants.USER,Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement =connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_NAME);
            preparedStatement.setString(1,this.roleCmb.getSelectedItem().toString());
            ResultSet resultset=preparedStatement.executeQuery();
            while (resultset.next()){
                      roleID=resultset.getInt("RoleID");      
            }
            resultset.close();
            preparedStatement.close();
            preparedStatement =connect.prepareStatement(Queries.EMS.Select.GET_SALARY_ID_BY_ROLE_ID);
            preparedStatement.setInt(1,roleID);
                       
            resultset=preparedStatement.executeQuery();
            while (resultset.next()){
                salaryID=resultset.getInt("SalaryID");
            }
            preparedStatement.close();
            preparedStatement =connect.prepareStatement(Queries.EMS.Update.EMPLOYEE);
            preparedStatement.setString(1, this.nameTxt.getText());
            preparedStatement.setString(2,this.addressTxt.getText());
            preparedStatement.setString(3,this.dobTxt.getText());
            preparedStatement.setString(4,this.nicTxt.getText());
            preparedStatement.setString(5,this.cstatusCmb.getSelectedItem().toString());
            preparedStatement.setInt(6,roleID);
            preparedStatement.setString(7,this.empIDTxt.getText());
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println("affected rows=" + affectedRows);
            preparedStatement.close();
            JOptionPane.showMessageDialog(null,"Successfully Updated","Success",JOptionPane.INFORMATION_MESSAGE);
            MainInterface m2=new MainInterface();
            m2.setVisible(true);
            this.dispose();
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> cstatusCmb;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField empIDTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
