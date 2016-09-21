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
import org.itp.commons.Validation;
import org.itp.openems.model.Salary;

/**
 *
 * @author THISURA THEJITH
 */
public class ViewSalary extends javax.swing.JFrame {

    /**
     * Creates new form ViewSalary
     */
    public ViewSalary() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nicNoTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        generateSalBtn = new javax.swing.JButton();
        nicNoLbl = new javax.swing.JLabel();
        demoBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        basicSalLbl = new javax.swing.JLabel();
        epfLbl = new javax.swing.JLabel();
        etfLbl = new javax.swing.JLabel();
        bonusLbl = new javax.swing.JLabel();
        totalSalLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Salary");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NIC No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 110, -1, -1));

        jLabel2.setText("Basic Salary");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 167, -1, -1));

        jLabel3.setText("EPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 216, -1, -1));

        jLabel4.setText("ETF");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 266, -1, -1));

        jLabel5.setText("Bonus");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 316, -1, -1));

        jLabel6.setText("Total Salary");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 365, -1, -1));

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, 32));
        getContentPane().add(nicNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 107, 146, -1));

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 33));

        generateSalBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        generateSalBtn.setText("Generate Salary Report");
        generateSalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateSalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(generateSalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 420, -1, 32));

        nicNoLbl.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(nicNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 134, 146, 19));

        demoBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        demoBtn.setText("Demo");
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(demoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, 477, 59));

        basicSalLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        basicSalLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(basicSalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 146, 20));

        epfLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        epfLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(epfLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 146, 20));

        etfLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        etfLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(etfLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 146, 20));

        bonusLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        bonusLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(bonusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 146, 20));

        totalSalLbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        totalSalLbl.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(totalSalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 146, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    int employeeID = 0;
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        nicNoLbl.setText(null);
        clear();
        if (nicNoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter the NIC No","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            if (!Validation.ValidNIC(this.nicNoTxt.getText())) {
                nicNoLbl.setText("*Invalid NIC No");
                JOptionPane.showMessageDialog(null,"The NIC No is invalid","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if (Validation.ValidNIC(this.nicNoTxt.getText())) {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
            preparedStatement.setString(1, this.nicNoTxt.getText());
            ResultSet resultset = preparedStatement.executeQuery();
            int count=0;
            while (resultset.next()) {
                employeeID = resultset.getInt("EmployeeID");
                count++;
            }
            if (count == 0){
                        JOptionPane.showMessageDialog(null, "An employee with this NIC No is not present", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
            }
            resultset.close();
            preparedStatement.close();
            Salary salary = DBUtils.getSalaryForEmployeeID(employeeID);
            if (salary.getAbsentCount() + (salary.getHalfDayCount() / 2) > salary.getMaxLeaves()) {
                JOptionPane.showMessageDialog(null, "The employee is in NOPAY status.", "No Salary", JOptionPane.ERROR_MESSAGE);
                return;
            }
            this.basicSalLbl.setText(Double.toString(salary.getBasicSalary()));
            this.epfLbl.setText(Double.toString(salary.getEpf()/100 * salary.getBasicSalary()));
            this.etfLbl.setText(Double.toString(salary.getEtf()/100 * salary.getBasicSalary()));
            this.bonusLbl.setText(Double.toString(salary.getBonus()));
            this.totalSalLbl.setText(Double.toString(salary.calculateSalary()));
            
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void generateSalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateSalBtnActionPerformed
        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_ID_BY_NIC);
            preparedStatement.setString(1,this.nicNoTxt.getText());
            ResultSet resultset = preparedStatement.executeQuery();
            int count = 0;
            while (resultset.next()) {
                employeeID = resultset.getInt("EmployeeID");
                count++;
            }
            if (count == 0) {
                clear();
                JOptionPane.showMessageDialog(null, "No Employee to generate salary report or the NIC No is invalid", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                int empid = employeeID;
                ViewIReport.SalReport(empid);
            }
            resultset.close();
            preparedStatement.close();

        }
        catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_generateSalBtnActionPerformed

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        this.nicNoTxt.setText("942811110v");
    }//GEN-LAST:event_demoBtnActionPerformed
    private void clear(){
        basicSalLbl.setText(null);
        epfLbl.setText(null);
        bonusLbl.setText(null);
        etfLbl.setText(null);
        totalSalLbl.setText(null);
        //nicNoTxt.setText(null);
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
            java.util.logging.Logger.getLogger(ViewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel basicSalLbl;
    private javax.swing.JLabel bonusLbl;
    private javax.swing.JButton demoBtn;
    private javax.swing.JLabel epfLbl;
    private javax.swing.JLabel etfLbl;
    private javax.swing.JButton generateSalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nicNoLbl;
    private javax.swing.JTextField nicNoTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel totalSalLbl;
    // End of variables declaration//GEN-END:variables
}
