/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.ui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import jdk.nashorn.internal.objects.NativeArray;
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.DBUtils;
import org.itp.customer.management.CleanManagementSystem;
import org.itp.customer.management.Login;
import org.itp.openems.model.Salary;

/**
 *
 * @author THISURA THEJITH
 */
public class DEOInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public DEOInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerEmpBtn = new javax.swing.JButton();
        calcSalBtn = new javax.swing.JButton();
        viewSalaryEmp = new javax.swing.JButton();
        setAttBtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management System");
        setExtendedState(5);
        setPreferredSize(new java.awt.Dimension(1031, 650));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerEmpBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        registerEmpBtn.setText("Register Employees");
        registerEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerEmpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 342, 75));

        calcSalBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        calcSalBtn.setText("Calculate Salary");
        calcSalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcSalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(calcSalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 342, 75));

        viewSalaryEmp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewSalaryEmp.setText("View Salary");
        viewSalaryEmp.setToolTipText("");
        viewSalaryEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSalaryEmpActionPerformed(evt);
            }
        });
        getContentPane().add(viewSalaryEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 342, 75));

        setAttBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        setAttBtn.setText("Set Attendance");
        setAttBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setAttBtnActionPerformed(evt);
            }
        });
        getContentPane().add(setAttBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 342, 75));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 115, 58));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 519, 75));

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerEmpBtnActionPerformed
        RegisterEmployees r1 = new RegisterEmployees();
        r1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_registerEmpBtnActionPerformed

    private void setAttBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setAttBtnActionPerformed
        SetAttendance at1 = new SetAttendance();
        at1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_setAttBtnActionPerformed

    private void calcSalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcSalBtnActionPerformed
        try {
            if(Calendar.getInstance().get(Calendar.DATE)<Constants.SALARYDATE){
                JOptionPane.showMessageDialog(null, "It's too early to calculate the salary", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            List<Integer> eids = DBUtils.getEmployeeIds();
            File dir = new File(Constants.REPORT_LOCATION);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            for(int eid : eids){
                Salary salary = DBUtils.getSalaryForEmployeeID(eid);
                String status=DBUtils.getStatusByEmployeeID(eid);
                File file = new File(Constants.REPORT_LOCATION + File.separator + eid + ".txt");
                
                if (salary.getAbsentCount() + (salary.getHalfDayCount() / 2) > salary.getMaxLeaves()){
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter writer = new FileWriter(file);
                    writer.write("No Pay");
                    writer.flush();
                    writer.close();
                }
                else if(status.equals("Resigned")){
                    //writer.close();
                    continue;
                }
                else{
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    FileWriter writer = new FileWriter(file);
                    writer.write(salary.toString());
                    writer.flush();
                    writer.close();
                }
            }  
            JOptionPane.showMessageDialog(null, "All the files are saved at the "+ Constants.REPORT_LOCATION+  " folder.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException e) {
        } 
        catch (IOException e){
        }

    }//GEN-LAST:event_calcSalBtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        CleanManagementSystem cm=new CleanManagementSystem();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Login lg=new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void viewSalaryEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSalaryEmpActionPerformed
        DEOViewSalary v1 = new DEOViewSalary();
        v1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_viewSalaryEmpActionPerformed

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
            java.util.logging.Logger.getLogger(DEOInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEOInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEOInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEOInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEOInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcSalBtn;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton registerEmpBtn;
    private javax.swing.JButton setAttBtn;
    private javax.swing.JButton viewSalaryEmp;
    // End of variables declaration//GEN-END:variables
}