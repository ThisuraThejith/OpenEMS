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
import org.itp.commons.Queries;
import org.itp.commons.Validation;

/**
 *
 * @author THISURA THEJITH
 */
public class EmployeeReports extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeReports
     */
    public EmployeeReports() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nicNoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        generateRepBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nicNoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nicNoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nicNoTxtFocusLost(evt);
            }
        });

        jLabel1.setText("NIC No");

        generateRepBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generateRepBtn.setText("Generate report");
        generateRepBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRepBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        nicNoLbl.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(generateRepBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn))
                            .addComponent(nicNoTxt)
                            .addComponent(nicNoLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nicNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nicNoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateRepBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateRepBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRepBtnActionPerformed
        if (nicNoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the NIC No", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                if (!Validation.ValidNIC(this.nicNoTxt.getText())) {
                    nicNoLbl.setText("*Invalid NIC No");
                    JOptionPane.showMessageDialog(null, "The NIC No is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(Validation.ValidNIC(this.nicNoTxt.getText()))  {
                    int employeeID = 0;
                    Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                    PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
                    preparedStatement.setString(1, this.nicNoTxt.getText());
                    ResultSet resultset = preparedStatement.executeQuery();
                    int count = 0;
                    while (resultset.next()) {
                        employeeID = resultset.getInt("EmployeeID");
                        count++;
                    }
                    if (count == 0) {
                        JOptionPane.showMessageDialog(null, "An employee with this NIC No is not registered", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        int empid = employeeID;
                        ViewIReport.EmpReport(empid);
                    }
                    resultset.close();
                    preparedStatement.close();
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_generateRepBtnActionPerformed

    private void nicNoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicNoTxtFocusLost
        if(this.nicNoTxt.getText().isEmpty()){
            nicNoLbl.setText("*Insert the NIC No");
        }
        else if(!Validation.ValidNIC(this.nicNoTxt.getText())){
            nicNoLbl.setText("*Invalid NIC No");
        }
        else{
            nicNoLbl.setText(null);
        }
    }//GEN-LAST:event_nicNoTxtFocusLost

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton generateRepBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nicNoLbl;
    private javax.swing.JTextField nicNoTxt;
    // End of variables declaration//GEN-END:variables
}
