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
        basicSalTxt = new javax.swing.JTextField();
        epfTxt = new javax.swing.JTextField();
        etfTxt = new javax.swing.JTextField();
        bonusTxt = new javax.swing.JTextField();
        totalSalTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        nicNoTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        generateSalBtn = new javax.swing.JButton();
        nicNoLbl = new javax.swing.JLabel();
        demoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Salary");

        jLabel1.setText("NIC No");

        jLabel2.setText("Basic Salary");

        jLabel3.setText("EPF");

        jLabel4.setText("ETF");

        jLabel5.setText("Bonus");

        jLabel6.setText("Total Salary");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        generateSalBtn.setText("Generate Salary Report");
        generateSalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateSalBtnActionPerformed(evt);
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(basicSalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(etfTxt)
                            .addComponent(bonusTxt)
                            .addComponent(totalSalTxt)
                            .addComponent(nicNoTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn)
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateSalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchBtn))
                .addGap(1, 1, 1)
                .addComponent(nicNoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(generateSalBtn)
                    .addComponent(demoBtn))
                .addContainerGap())
        );

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
            this.bonusTxt.setText(Double.toString(salary.getBonus()));
            this.basicSalTxt.setText(Double.toString(salary.getBasicSalary()));
            this.epfTxt.setText(Double.toString(salary.getEpf() * salary.getBasicSalary()));
            this.etfTxt.setText(Double.toString(salary.getEtf() * salary.getBasicSalary()));
            this.totalSalTxt.setText(Double.toString(salary.calculateSalary()));
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void generateSalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateSalBtnActionPerformed
        try {
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
        basicSalTxt.setText(null);
        epfTxt.setText(null);
        bonusTxt.setText(null);
        etfTxt.setText(null);
        totalSalTxt.setText(null);
    
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
    private javax.swing.JTextField basicSalTxt;
    private javax.swing.JTextField bonusTxt;
    private javax.swing.JButton demoBtn;
    private javax.swing.JTextField epfTxt;
    private javax.swing.JTextField etfTxt;
    private javax.swing.JButton generateSalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nicNoLbl;
    private javax.swing.JTextField nicNoTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField totalSalTxt;
    // End of variables declaration//GEN-END:variables
}
