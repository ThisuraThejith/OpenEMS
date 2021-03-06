/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CHATHURAAKSHA
 */
public class PCust extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs1;
    public PCust() {
        initComponents();
        con = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Type = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        NIC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jKeyword = new javax.swing.JTextField();
        jFind = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jCusID = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jTarrif = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jOrdinary = new javax.swing.JRadioButton();
        jBulk = new javax.swing.JRadioButton();
        jLevel = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jReason = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Customer Privilage");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        NIC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NIC.setForeground(new java.awt.Color(0, 51, 51));
        NIC.setText("Cus ID");
        getContentPane().add(NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("CustomerType");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Level");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 490, 40));

        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Enter Customer ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jKeyword.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, -1));

        jFind.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jFind.setForeground(new java.awt.Color(0, 102, 102));
        jFind.setText("Find Customer");
        jFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFindActionPerformed(evt);
            }
        });
        getContentPane().add(jFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 20));

        jCusID.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 70, 20));

        jName.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 20));
        getContentPane().add(jTarrif, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 20));

        jUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jUpdate.setForeground(new java.awt.Color(0, 102, 102));
        jUpdate.setText("Update Privilage");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        Type.add(jOrdinary);
        jOrdinary.setForeground(new java.awt.Color(0, 102, 102));
        jOrdinary.setText("Ordinary");
        jOrdinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdinaryActionPerformed(evt);
            }
        });
        getContentPane().add(jOrdinary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        Type.add(jBulk);
        jBulk.setForeground(new java.awt.Color(0, 102, 102));
        jBulk.setText("Bulk");
        jBulk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBulkActionPerformed(evt);
            }
        });
        getContentPane().add(jBulk, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLevel.setForeground(new java.awt.Color(0, 102, 102));
        jLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select Customer Level-", "Default Customer", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10", "Inner Circle Customer", "Bronze Customer", "Silver Customer", "Gold Customer", "Platinum Customer" }));
        getContentPane().add(jLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Reason to Change");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 60, -1));

        jReason.setColumns(20);
        jReason.setForeground(new java.awt.Color(0, 102, 102));
        jReason.setRows(5);
        jScrollPane1.setViewportView(jReason);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 60, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        setSize(new java.awt.Dimension(611, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFindActionPerformed
       
        try {
            String str = jKeyword.getText();
          
            Connection con2 = DBconnect.connect();
     
            String sqlstsmt = str;
            //To remove previously added rows
            PreparedStatement pst = con2.prepareStatement(sqlstsmt);
            rs1 = pst.executeQuery("select * from customer where CusID='"+str+"'");
            
            while(rs1.next()){
           
            jCusID.setText(rs1.getString("CusID"));
            jName.setText(rs1.getString("FName"));
            jLevel.setSelectedItem(rs1.getString("Level"));
            String Type=rs1.getString("Type");
            if (Type.equals("Bulk")){
            jBulk.setSelected(true);
            }
            else {
            
            jOrdinary.setSelected(true);
            }
            jReason.setText(rs1.getString("PReason"));
            //    System.out.println(Type);
            
    //    Strinf S=    CustomerType.get(rs1.getString("Type"));
      //       jLevel.setSelectedItem(rs1.getString("Level"));
         //   CustomerType.setText(rs1.getString("Type"));
  //          jLevel.setText(rs1.getString("Level"));
            
            }
            //String kword="lab";
//            String sqlstsmt;
//            rs=sqlstsmt.executeQuery();
//            String sqlstsmt = "select CusID,FName,Type,Level from customer where CusID like '%" + kword + "%'";
            
//            jCusID.getText();
//            jName.getText();
//            jType.getText();
//            jLevel.getText();
            
            //String sqlstsmt="select * from jobs where location like '%lab%'";
            //FillTable(jTable_tableitp, sqlstsmt);
          //  FillLable();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_jFindActionPerformed
    
    
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          this.setVisible(false);
                    new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jOrdinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdinaryActionPerformed
        CustomerType = "Ordinary";
        jLevel.setSelectedItem("Default Customer");
    }//GEN-LAST:event_jOrdinaryActionPerformed

    private void jBulkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBulkActionPerformed
         CustomerType = "Bulk";
        // TODO add your handling code here:
    }//GEN-LAST:event_jBulkActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        try {
       String CusID = jKeyword.getText();
         String Reason=jReason.getText();
            
        String q=jLevel.getSelectedItem().toString();
        String sql=("update customer set Level='"+q+"',PReason='"+Reason+"' where CusID='"+CusID+"'");
  
         pst=con.prepareStatement(sql);
           pst.execute();
       if(pst.execute()){          
        JOptionPane.showMessageDialog(null, "Updated is not Done Privilage Successfully");
         jKeyword.setText("");
       jCusID.setText("");
       jName.setText("");
       jLevel.setSelectedItem("- Customer Level-");
       jReason.setText("");
       Type.clearSelection();
       }
       
       else{
       
       JOptionPane.showMessageDialog(null, "Update  Privilage Successfully");
       jKeyword.setText("");
       jCusID.setText("");
       jName.setText("");
       jLevel.setSelectedItem("- Customer Level-");
       jReason.setText("");
       }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_jUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jKeyword.setText("");
       jCusID.setText("");
       jName.setText("");
       jLevel.setSelectedItem("- Customer Level-");
       jReason.setText("");
       Type.clearSelection();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
                    new Login().setVisible(true);
               
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PCust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIC;
    private javax.swing.ButtonGroup Type;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton jBulk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jCusID;
    private javax.swing.JButton jFind;
    private javax.swing.JTextField jKeyword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jLevel;
    private javax.swing.JLabel jName;
    private javax.swing.JRadioButton jOrdinary;
    private javax.swing.JTextArea jReason;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTarrif;
    private javax.swing.JButton jUpdate;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
     private String CustomerType;
}
