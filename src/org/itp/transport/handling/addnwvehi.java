/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.transport.handling;

import com.mysql.jdbc.PreparedStatement;
import com.sun.xml.internal.bind.v2.model.core.ID;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author LAKVI
 */
public class addnwvehi extends javax.swing.JFrame {
    
    Connection conn=null;
    PreparedStatement pst=null;
     
    ResultSet rs = null;
    
    

    /**
     * Creates new form addnwvehi
     */
    public addnwvehi() {
        initComponents();
        
        conn = dbcoonnect.connect();
        
        setSize(1500, 1000);
        
        tableload();
        
       // fillComco();
    }

    
    public void tableload() 
    {
        try {
            String sql = "SELECT * FROM vehivle";
         pst =(PreparedStatement) conn.prepareStatement(sql);
        
          rs=pst .executeQuery();
          
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    
        }
        catch (Exception e) 
        {
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typbox = new javax.swing.JTextField();
        mdlbox = new javax.swing.JTextField();
        rtbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        num1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Add New Vehicle");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 10, 340, 59);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Brand");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 240, 70, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Model");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 300, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Rate");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 340, 60, 17);
        getContentPane().add(typbox);
        typbox.setBounds(130, 240, 100, 30);
        getContentPane().add(mdlbox);
        mdlbox.setBounds(130, 290, 100, 30);
        getContentPane().add(rtbox);
        rtbox.setBounds(130, 330, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vehiclenum", "Type", "Model", "Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 170, 780, 300);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 470, 67, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("vehicle_num");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 190, 90, 17);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 470, 90, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 470, 100, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1140, 520, 90, 40);

        num1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                num1FocusLost(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(130, 190, 100, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(280, 410, 100, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(120, 410, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Brand");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 410, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String num=num1.getText();
        String type =typbox.getText();
        String model=mdlbox.getText();
        String rate =rtbox.getText();
        
        try{
            if(num==num1.getText()){
             String q = "INSERT INTO vehivle(Vehi_Num, Brand, Model, Rate) values ('"+num+"','"+type+"','"+model+"','"+ rate+"')";
        pst = (PreparedStatement) conn.prepareStatement(q);
        
        pst .execute();
        
        tableload();
            }
            else{
            JOptionPane.showMessageDialog(null, "Allredy You Enterd This Data");
            }
        }
        
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        
        String num=jTable1.getValueAt(r, 0).toString();
        String type=jTable1.getValueAt(r, 1).toString();
        String modle=jTable1.getValueAt(r, 2).toString();
        String rate=jTable1.getValueAt(r, 3).toString();
        
        num1.setText(num);
        typbox.setText(type);
        mdlbox.setText(modle);
        rtbox.setText(rate);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int x= JOptionPane.showConfirmDialog(null,"Do You Realy Want To Update");
       
       if(x==0)
       {
           String num = num1.getText();
           String type = typbox.getText();
           String modle = mdlbox.getText();
           String rate = rtbox.getText();
           
           String sql = "UPDATE vehivle SET Type = '"+type+"',Model = '"+modle+"',Rate = '"+rate+"' where Vehi_Num = '"+ num +"'";
           try {
               pst= (PreparedStatement)  conn.prepareStatement(sql);
               
               pst.execute();
               
               tableload();
           } 
           catch (Exception e) 
           {
           }
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null,"Do You Realy Want To Delete");
         if(x==0)
       {
           String num = num1.getText();
           
           String sql = "DELETE from  vehivle  where Vehi_Num = '"+ num +"'";
           try {
               pst= (PreparedStatement)  conn.prepareStatement(sql);
               
               pst.execute();
               
               tableload();
           } 
           catch (Exception e) 
           {
           }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        transportmain m1=new transportmain();
        m1 . setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void num1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_num1FocusLost
        // TODO add your handling code here:
        if(num1.getText() == "" || num1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "ID Field cannot be empty");
        }
    }//GEN-LAST:event_num1FocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String id = jTextField4.getText();

        String sql = "SELECT Vehi_Num,Brand,Model,Rate FROM vehivle where Brand Like '%"+id+"%' ";
        try {
            pst =(PreparedStatement) conn.prepareStatement(sql);

            rs =  pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(addnwvehi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnwvehi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnwvehi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnwvehi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnwvehi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField mdlbox;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField rtbox;
    private javax.swing.JTextField typbox;
    // End of variables declaration//GEN-END:variables
}