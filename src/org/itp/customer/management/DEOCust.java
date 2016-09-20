/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author CHATHURAAKSHA
 */
public class DEOCust extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs1;
    public DEOCust() {
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

        jLabel1 = new javax.swing.JLabel();
        NIC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jKeyword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jCusID = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jType = new javax.swing.JLabel();
        jLevel = new javax.swing.JLabel();
        jtarrif = new javax.swing.JLabel();
        jTarrif = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNIC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCity = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jGender = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMobile = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jEMail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Customer Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        NIC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NIC.setForeground(new java.awt.Color(0, 51, 51));
        NIC.setText("Cus ID");
        getContentPane().add(NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("F Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Level");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Tarrif");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 490, 40));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("Enter Customer ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jKeyword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jKeyword.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 80, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Find Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        l1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 60, 20));

        jCusID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCusID.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jCusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, 20));

        jName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 20));

        jType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jType.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 140, 20));

        jLevel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLevel.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 120, 20));

        jtarrif.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jtarrif.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jtarrif, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 140, 20));

        jTarrif.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTarrif.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jTarrif, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("L Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        jLName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLName.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 120, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("NIC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jNIC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNIC.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 130, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jCity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCity.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jGender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jGender.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 100, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Mobile");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jMobile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMobile.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 110, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("Email");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jEMail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEMail.setForeground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jEMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 210, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 560));

        setSize(new java.awt.Dimension(611, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            String str = jKeyword.getText();
            
            Connection con2 = DBconnect.connect();
        //String sqlq="select * from employees where fe1="+jTextField1.getText();
            String sqlstsmt = str;
            //To remove previously added rows
            PreparedStatement pst = con2.prepareStatement(sqlstsmt);
            rs1 = pst.executeQuery("select * from customer where CusID='"+str+"'");
            
            while(rs1.next()){
            
            jCusID.setText(rs1.getString("CusID"));
            jName.setText(rs1.getString("FName"));
            jType.setText(rs1.getString("Type"));
            jLevel.setText(rs1.getString("Level"));
            jLName.setText(rs1.getString("LName"));
            jNIC.setText(rs1.getString("NIC"));
            jCity.setText(rs1.getString("City"));
          //  jMobile.setText(rs1.getString("Mobile"));
            jGender.setText(rs1.getString("Gender"));
           // jEMail.setText(rs1.getString("email"));
            String m =rs1.getString("Level");
            
           






            if(m.equals("Default Customer")){
                System.out.println(m);
            jtarrif.setText("No Discount");
            }
            else if (m.equals("Level 1")){
            jtarrif.setText("5%");
            
            }
            else if (m.equals("Level 2")){
            jtarrif.setText("7%");
            
            }
            else if (m.equals("Level 3")){
            jtarrif.setText("9%");
            
            }
            else if (m.equals("Level 4")){
            jtarrif.setText("10%");
           
            
            }
            
            else if (m.equals("Level 5")){
            jtarrif.setText("12%");
            
            }
            else if (m.equals("Level 6")){
            jtarrif.setText("12.5%");
            
            }
            else if (m.equals("Level 7")){
            jtarrif.setText("15%");
            
            }
            
            else if (m.equals("Level 8")){
            jtarrif.setText("17.5%");
            
            }
            else if (m.equals("Level 9")){
            jtarrif.setText("19.75%");
            
            }
            else if (m.equals("Level 10")){
            jtarrif.setText("20%");
            
            }
            else if (m.equals("Inner Circle Customer")){
            jtarrif.setText("22%");
            
            }
            else if (m.equals("Bronze Customer")){
            jtarrif.setText("23%");
            
            }
            else if (m.equals("Silver Customer")){
            jtarrif.setText("23.5%");
            
            }
            else if (m.equals("Gold Customer")){
            jtarrif.setText("25%");
            
            }
            else if (m.equals("Platinum Customer")){
            jtarrif.setText("25.5%");
            
            }
            
            else {
                 jtarrif.setText("Ops Somthing Wrong with Data");
            }
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          this.setVisible(false);
                    new Login().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jKeyword.setText("");
        jCusID.setText("");
        jName.setText("");
        jLName.setText("");
        jNIC.setText("");
        jCity.setText("");
        jGender.setText("");
        jMobile.setText("");
        jEMail.setText("");
        jType.setText("");
        jLevel.setText("");
        jtarrif.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DEOCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DEOCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DEOCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DEOCust.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DEOCust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jCity;
    private javax.swing.JLabel jCusID;
    private javax.swing.JLabel jEMail;
    private javax.swing.JLabel jGender;
    private javax.swing.JTextField jKeyword;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLevel;
    private javax.swing.JLabel jMobile;
    private javax.swing.JLabel jNIC;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jTarrif;
    private javax.swing.JLabel jType;
    private javax.swing.JLabel jtarrif;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
