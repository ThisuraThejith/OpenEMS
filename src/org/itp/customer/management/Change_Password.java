/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Change_Password extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password
     */
    public Change_Password() {
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

        jPasswordField2 = new javax.swing.JPasswordField();
        Change_Password_lbl1 = new javax.swing.JLabel();
        Change_Password_lbl2 = new javax.swing.JLabel();
        Change_Password_text1 = new javax.swing.JTextField();
        Change_Password_btn1 = new javax.swing.JButton();
        Change_Password_pwd1 = new javax.swing.JPasswordField();
        Change_Password_pwd2 = new javax.swing.JPasswordField();
        Change_Password_lbl3 = new javax.swing.JLabel();
        Change_Password_lbl4 = new javax.swing.JLabel();
        Change_Password_pwd3 = new javax.swing.JPasswordField();
        Change_Password_btn2 = new javax.swing.JButton();
        Change_Password_btn3 = new javax.swing.JButton();
        Change_Password_btn4 = new javax.swing.JButton();
        Change_Password_lbl5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField2.setText("jPasswordField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Change_Password_lbl1.setFont(new java.awt.Font("Teen", 1, 20)); // NOI18N
        Change_Password_lbl1.setText("User Name                   :");
        getContentPane().add(Change_Password_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 41, -1, -1));

        Change_Password_lbl2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Change_Password_lbl2.setForeground(new java.awt.Color(255, 255, 0));
        Change_Password_lbl2.setText("Old Password              :");
        getContentPane().add(Change_Password_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 89, 220, 40));

        Change_Password_text1.setFont(new java.awt.Font("Teen", 0, 18)); // NOI18N
        Change_Password_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_text1ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 40, 100, -1));

        Change_Password_btn1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Change_Password_btn1.setForeground(new java.awt.Color(255, 51, 51));
        Change_Password_btn1.setText("Change Password");
        Change_Password_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 245, -1, -1));

        Change_Password_pwd1.setFont(new java.awt.Font("Teen", 0, 18)); // NOI18N
        getContentPane().add(Change_Password_pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 88, 100, -1));

        Change_Password_pwd2.setFont(new java.awt.Font("Teen", 0, 18)); // NOI18N
        getContentPane().add(Change_Password_pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 136, 100, -1));

        Change_Password_lbl3.setFont(new java.awt.Font("Teen", 1, 20)); // NOI18N
        Change_Password_lbl3.setText(" ");
        getContentPane().add(Change_Password_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 137, -1, -1));

        Change_Password_lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Change_Password_lbl4.setForeground(new java.awt.Color(204, 204, 0));
        Change_Password_lbl4.setText("Retype-Password     :");
        getContentPane().add(Change_Password_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 185, -1, -1));

        Change_Password_pwd3.setFont(new java.awt.Font("Teen", 0, 18)); // NOI18N
        getContentPane().add(Change_Password_pwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 184, 100, -1));

        Change_Password_btn2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Change_Password_btn2.setForeground(new java.awt.Color(153, 0, 153));
        Change_Password_btn2.setText("Clear");
        Change_Password_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 278, 113, -1));

        Change_Password_btn3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Change_Password_btn3.setForeground(new java.awt.Color(153, 0, 153));
        Change_Password_btn3.setText("Exit");
        Change_Password_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 316, 113, -1));

        Change_Password_btn4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Change_Password_btn4.setForeground(new java.awt.Color(153, 0, 153));
        Change_Password_btn4.setText("Main Menu");
        Change_Password_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(Change_Password_btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 354, -1, -1));

        Change_Password_lbl5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Change_Password_lbl5.setForeground(new java.awt.Color(204, 204, 0));
        Change_Password_lbl5.setText("New Password           :");
        getContentPane().add(Change_Password_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Change_Password_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_text1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Change_Password_text1ActionPerformed

    private void Change_Password_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_btn1ActionPerformed
        
        String user=Change_Password_text1.getText();
        String pwd1=Change_Password_pwd1.getText();
        String pwd2=Change_Password_pwd2.getText();
        String pwd3=Change_Password_pwd3.getText();
        
        String query1="Update Login Set Password = \""+pwd2+"\" where User_Name = \""+user+"\""+" AND Password = \""+pwd1+"\"" ;
        String query2="select UserName from Login where User_Name = \""+user+"\"";
        String query3="select Password from Login where User_Name= \""+user+"\"";
        String check="";
        try{
            
        String host = "jdbc:mysql://localhost:3306/itp";
        String Name = "itp";
        String Pass= "itp";
        
        Connection con=DriverManager.getConnection(host,Name,Pass);
        
        Statement stmt2;
        Statement stmt3;
        
        ResultSet rs2;
        ResultSet rs3;
          
        stmt2=con.createStatement();
        stmt3=con.createStatement();
           
        rs2=stmt2.executeQuery(query2);
        rs3=stmt3.executeQuery(query3);
        
          if(!rs2.next())//validating user name is incorrect
           {
               JOptionPane.showMessageDialog(null,"User Name is invalid!!!");
               Change_Password_text1.setText("");
               Change_Password_pwd1.setText("");
               Change_Password_pwd2.setText("");  
               Change_Password_pwd3.setText(""); 
           }
         
        
          else if(rs3.first())//user name is correct
           {
                check=rs3.getString("Password");//getting input from database
               
                 //checking password is correct or not with retrieved database results
                 
           if(!check.equals(pwd1))//old password is wrong
           {
               JOptionPane.showMessageDialog(null,"Password is incorrect!!!");
               Change_Password_pwd1.setText("");
               Change_Password_pwd2.setText("");  
               Change_Password_pwd3.setText(""); 
           }
           
           else//old password is correct
           {
                 
         if(!pwd2.equals(pwd3))//changed passwords are not same
        {
            JOptionPane.showMessageDialog(null,"Password seems to be different, type again");
            Change_Password_pwd2.setText("");
            Change_Password_pwd3.setText("");    
        }
        
        else//changed passwords are same
        {
            Statement stmt1;
            
            stmt1=con.createStatement();
            stmt1.executeUpdate(query1);
            JOptionPane.showMessageDialog(null,"Password Changed Successully");
            
            //clearing all fields after successful update
            Change_Password_text1.setText("");
            Change_Password_pwd1.setText("");
            Change_Password_pwd2.setText("");  
            Change_Password_pwd3.setText(""); 
        }
           }
           }
          
          
     
        }
        
        catch ( SQLException err ) {
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
       
        
    }//GEN-LAST:event_Change_Password_btn1ActionPerformed

    private void Change_Password_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_btn2ActionPerformed
        Change_Password_text1.setText("");
        Change_Password_pwd1.setText("");
        Change_Password_pwd2.setText("");  
        Change_Password_pwd3.setText(""); 
    }//GEN-LAST:event_Change_Password_btn2ActionPerformed

    private void Change_Password_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_btn3ActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_Change_Password_btn3ActionPerformed

    private void Change_Password_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_btn4ActionPerformed
        
        this.setVisible(false);
       new Login().setVisible(true);
    }//GEN-LAST:event_Change_Password_btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Password_btn1;
    private javax.swing.JButton Change_Password_btn2;
    private javax.swing.JButton Change_Password_btn3;
    private javax.swing.JButton Change_Password_btn4;
    private javax.swing.JLabel Change_Password_lbl1;
    private javax.swing.JLabel Change_Password_lbl2;
    private javax.swing.JLabel Change_Password_lbl3;
    private javax.swing.JLabel Change_Password_lbl4;
    private javax.swing.JLabel Change_Password_lbl5;
    private javax.swing.JPasswordField Change_Password_pwd1;
    private javax.swing.JPasswordField Change_Password_pwd2;
    private javax.swing.JPasswordField Change_Password_pwd3;
    private javax.swing.JTextField Change_Password_text1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField2;
    // End of variables declaration//GEN-END:variables
}