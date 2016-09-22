/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.transport.handling;

import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.regexp.internal.StreamCharacterIterator;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LAKVI
 */
public class GetItem extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
     
    ResultSet rs = null;
    /**
     * Creates new form GetItem
     */
    public GetItem() {
        initComponents();
        
        conn = dbcoonnect.connect();
        
        setSize(1500, 1000);
        
        tableload();
    }
    
    public void tableload() 
    {
        try {
            String sql = "SELECT Product_Id,Product_Name,Quantity FROM sales";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RQt = new javax.swing.JTextField();
        IQt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Qt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Get Items");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 170, 59);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 210, 800, 330);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(130, 660, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(620, 90, 100, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(460, 90, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 90, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Product_Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 210, 90, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 210, 150, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 270, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 520, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 270, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Return Quntity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 400, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Issue Quntity");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 450, 100, 30);

        RQt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RQtActionPerformed(evt);
            }
        });
        getContentPane().add(RQt);
        RQt.setBounds(170, 400, 90, 30);
        getContentPane().add(IQt);
        IQt.setBounds(170, 450, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quntity");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 324, 70, 40);

        Qt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtActionPerformed(evt);
            }
        });
        getContentPane().add(Qt);
        Qt.setBounds(170, 330, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        transportmain m1=new transportmain();
            m1 . setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        
        String id=jTable1.getValueAt(r, 0).toString();
        String name=jTable1.getValueAt(r, 1).toString();
        String qt=jTable1.getValueAt(r, 2).toString();
        
        
         jTextField1.setText(id);
        jTextField2.setText(name);
        Qt.setText(qt);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = jTextField4.getText();
        
        String sql = "SELECT Product_Id,Product_Name,Quantity FROM product_details where Product_Name Like '%"+name+"%' ";
        try {
            pst =(PreparedStatement) conn.prepareStatement(sql);
        
        rs =  pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jTextField1.getText();
        String name=jTextField2.getText();
        String Qunt=Qt.getText();
        String RQunt=RQt.getText();
        String IQunt=IQt.getText();       
        
      
        
        try{
           
            String q = "INSERT INTO check_items(Product_Id,Product_Name,Return_Qunty,Issue_Qunty) values ('"+id+"','"+name+"','"+RQunt+"','"+IQunt+"')";
            pst = (PreparedStatement) conn.prepareStatement(q);
            
        
        
        pst .execute();
        
        }
        
       catch(Exception e)
        {
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void RQtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RQtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RQtActionPerformed

    private void QtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtActionPerformed

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
            java.util.logging.Logger.getLogger(GetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetItem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IQt;
    private javax.swing.JTextField Qt;
    private javax.swing.JTextField RQt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
