package org.itp.service.scheduling;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
//import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.*;
import org.itp.customer.management.CleanManagementSystem;
import org.itp.openems.ui.ViewIReport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavinda
 */
public class jobschedulemain extends javax.swing.JFrame {

    PreparedStatement pst = null;
    ResultSet rs1 = null;
    Connection con2 = DBconnect.connect();

    /**
     * Creates new form schedulemain
     */
    public jobschedulemain() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    public jobschedulemain(int cus) {
        jTextField3.setText(Integer.toString(cus));
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scheduling system");
        setName("Scheduling System"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Search job");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 124, -1, -1));

        jLabel2.setText("job ID");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 152, -1, -1));

        jLabel3.setText("keyword");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 204, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 149, 119, -1));

        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 201, 119, -1));

        jButton2.setText("Add new job");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 239, -1, -1));

        jButton3.setText("Edit job");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 239, -1, -1));

        jButton4.setText("cancel job");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 239, -1, -1));

        jButton5.setText("Search");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 239, -1, -1));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job ID", "Customer ID", "Location",
                "Date", "Employees assigned", "gross price"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 273, 573, 129));

        jLabel4.setText("customer ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 178, -1, -1));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 175, 119, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 462, -1));

        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jobaddnew a1 = new jobaddnew();
        //this.setVisible(false);
        
        this.dispose(); //close this form
        //a1.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        
        for (int i = 0; i < jTextField1.getText().length(); i++) {
            if (!(Character.isDigit(jTextField1.getText().charAt(i)))) {
                jTextField1.setForeground(Color.red);
                //jButton2.setEnabled(false);
                jOptionPane1.showMessageDialog(rootPane, "please enter only digits in this field");
                jTextField1.setText("");
                jTextField1.setForeground(Color.BLACK);
                return;
            }    
            
        }

        try {

            String sqlstmt = "select * from jobs where jobid=" + jTextField1.getText();
            //String sqlstmt = "select * from jobs where jobid like '%" + jTextField1.getText()+"'%";

            //jTable1=new JTable(buildTableModel(rs1));
            FillTable(jTable1, sqlstmt);
            System.out.println(rs1);
            //JOptionPane.showMessageDialog(null, "Successfuly completed");

        } catch (Exception e) {

        }


    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        try {
            String kword = jTextField2.getText();
            //String kword="lab";
            String sqlstsmt = "select * from jobs where location like '%" + kword + "%' or date like '%" + kword + "%'";
            //String sqlstsmt="select * from jobs where location like '%lab%'";
            FillTable(jTable1, sqlstsmt);
            jTextField1.setText("");
            jTextField3.setText("");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        for (int i = 0; i < jTextField3.getText().length(); i++) {
            if (!(Character.isDigit(jTextField3.getText().charAt(i)))) {
                jTextField3.setForeground(Color.red);
                //jButton2.setEnabled(false);
                jOptionPane1.showMessageDialog(rootPane, "please enter only digits in this field");
                jTextField3.setText("");
                jTextField3.setForeground(Color.BLACK);
                return;
            }    
            
        }
        try {

            String sqlstmt = "select * from jobs where cusid=" + jTextField3.getText();

            //jTable1=new JTable(buildTableModel(rs1));
            FillTable(jTable1, sqlstmt);
            System.out.println(rs1);
            //JOptionPane.showMessageDialog(null, "Successfuly completed");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        //update u1=new jobupdate();
        //this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //int rno=jTable1.getSelectedRow();
        int rr = jTable1.getSelectedRow();
        int cc = 0;

        if (rr == -1) {
            jOptionPane1.showMessageDialog(rootPane, "No reocrd selected to update", "Invalid selection", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int val = (int) jTable1.getValueAt(rr, cc);
        //else
        System.out.println(val);

        jobupdate u1 = new jobupdate(val);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int rr = jTable1.getSelectedRow();
        int cc = 0;

        if (rr == -1) {
            jOptionPane1.showMessageDialog(rootPane, "No reocrd selected to cancel", "Invalid selection", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        int val = (int) jTable1.getValueAt(rr, cc);
        //else
        System.out.println(val);
        jobcancel c1 = new jobcancel(val);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        CleanManagementSystem cm3=new CleanManagementSystem();
        cm3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewIReport.scheduleReport();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jobschedulemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jobschedulemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jobschedulemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jobschedulemain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jobschedulemain().setVisible(true);
            }
        });
    }

    public void FillTable(JTable table, String sqlq) {
        try {

            //String sqlq="select * from employees where fe1="+jTextField1.getText();
            //To remove previously added rows
            PreparedStatement pst = con2.prepareStatement(sqlq);
            rs1 = pst.executeQuery();
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs1.getMetaData().getColumnCount();
            while (rs1.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs1.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs1.getRow() - 1, row);
            }

            rs1.close();
            //stat.close();
            //conn2.close();
        } catch (SQLException e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
