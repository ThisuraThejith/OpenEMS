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
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.DBUtils;
import org.itp.commons.Queries;

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
        empIDTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        generateSalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Salary");

        jLabel1.setText("Employee ID");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generateSalBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(basicSalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(epfTxt)
                                .addComponent(etfTxt)
                                .addComponent(bonusTxt)
                                .addComponent(totalSalTxt)
                                .addComponent(empIDTxt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn)
                    .addComponent(backBtn))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(basicSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(epfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bonusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(totalSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(generateSalBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
            MainInterface m1=new MainInterface();
            m1.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try{
            int roleID=0;
            double bonus=0.0;
            double epf=0.0;
            double etf=0.0;
            double basicSalary=0.0;
            Connection connect=new DBConnect (Constants.USER,Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement=connect.prepareStatement(Queries.EMS.Select.GET_BONUS_BY_EMPLOYEE_ID);
            preparedStatement.setString(1,this.empIDTxt.getText());
            ResultSet resultset=preparedStatement.executeQuery();
            
            while (resultset.next()){
                  bonus = resultset.getDouble("Bonus");
            }
            this.bonusTxt.setText(Double.toString(bonus));
            resultset.close();
            preparedStatement.close();
            preparedStatement=connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_EMPLOYEE_ID);
            preparedStatement.setString(1,this.empIDTxt.getText());
            resultset=preparedStatement.executeQuery();
            while (resultset.next()){
                  roleID=resultset.getInt("RoleID");
            }
            resultset.close();
            preparedStatement.close();
            preparedStatement =connect.prepareStatement(Queries.EMS.Select.GET_SALARY_BY_ROLE_ID);
            preparedStatement.setInt(1,roleID);
                       
            resultset=preparedStatement.executeQuery();
            while (resultset.next()){
                  basicSalary = resultset.getDouble("BasicSalary");
                  epf = resultset.getDouble("EPF");
                  etf = resultset.getDouble("ETF");
            }
            this.basicSalTxt.setText(Double.toString(basicSalary));
            this.epfTxt.setText(Double.toString(epf));
            this.etfTxt.setText(Double.toString(etf));
            resultset.close();
            preparedStatement.close();
            this.totalSalTxt.setText(Double.toString(calculateSalary(basicSalary, epf, etf, bonus)));
            
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    private double calculateSalary(double basicSalary,double EPF,double ETF,double bonus){
        double totalSalary;
        basicSalary=Double.parseDouble(this.basicSalTxt.getText());
        EPF=Double.parseDouble(this.epfTxt.getText());
        ETF=Double.parseDouble(this.etfTxt.getText());
        bonus=Double.parseDouble(this.bonusTxt.getText());
        totalSalary=basicSalary-(EPF+ETF)*basicSalary+bonus;
        
        return totalSalary;
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
    private javax.swing.JTextField empIDTxt;
    private javax.swing.JTextField epfTxt;
    private javax.swing.JTextField etfTxt;
    private javax.swing.JButton generateSalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField totalSalTxt;
    // End of variables declaration//GEN-END:variables
}
