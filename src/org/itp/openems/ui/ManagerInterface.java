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
public class ManagerInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public ManagerInterface() {
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

        empDetBtn = new javax.swing.JButton();
        viewSalaryEmp = new javax.swing.JButton();
        appraisalBtn = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        empRepBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management System");
        setExtendedState(5);
        setPreferredSize(new java.awt.Dimension(1150, 650));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empDetBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        empDetBtn.setText("Employee Details");
        empDetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(empDetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 342, 75));

        viewSalaryEmp.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        viewSalaryEmp.setText("View Salary");
        viewSalaryEmp.setToolTipText("");
        viewSalaryEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSalaryEmpActionPerformed(evt);
            }
        });
        getContentPane().add(viewSalaryEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 342, 75));

        appraisalBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        appraisalBtn.setText("Appraisals");
        appraisalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appraisalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(appraisalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 342, 75));

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 115, 58));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 519, 75));

        empRepBtn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        empRepBtn.setText("Employee Reports");
        empRepBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empRepBtnActionPerformed(evt);
            }
        });
        getContentPane().add(empRepBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 342, 75));

        logoutBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empDetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDetBtnActionPerformed
        ViewEmployeesManager r1 = new ViewEmployeesManager();
        r1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_empDetBtnActionPerformed

    private void viewSalaryEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSalaryEmpActionPerformed
        ViewSalary v1 = new ViewSalary();
        v1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_viewSalaryEmpActionPerformed

    private void appraisalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appraisalBtnActionPerformed
        Appraisals a1 = new Appraisals();
        a1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_appraisalBtnActionPerformed

    private void empRepBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empRepBtnActionPerformed
        EmployeeReports em=new EmployeeReports();
        em.setVisible(true);
    }//GEN-LAST:event_empRepBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appraisalBtn;
    private javax.swing.JButton empDetBtn;
    private javax.swing.JButton empRepBtn;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton viewSalaryEmp;
    // End of variables declaration//GEN-END:variables
}
