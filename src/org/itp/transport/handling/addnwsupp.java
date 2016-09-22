/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.transport.handling;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LAKVI
 */
public class addnwsupp extends javax.swing.JFrame {
    
    Connection conn=null;
    PreparedStatement pst=null;
     
    ResultSet rs = null;


    /**
     * Creates new form addnwsupp
     */
    public addnwsupp() {
        initComponents();
        
        conn = dbcoonnect.connect();
        
        setSize(1500, 1000);
        
        tableload();
    }
    
    public void tableload() 
    {
        try {
            String sql = "SELECT Supplier_ID,Name,Address,Con_Num  FROM supplier";
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        addbox = new javax.swing.JTextField();
        cnbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Add New Supplier");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 357, 59);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(680, 160, 630, 390);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 180, 20, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 240, 50, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 280, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contact_number");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 320, 110, 17);
        getContentPane().add(namebox);
        namebox.setBounds(260, 220, 260, 30);
        getContentPane().add(addbox);
        addbox.setBounds(260, 260, 270, 30);

        cnbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnboxActionPerformed(evt);
            }
        });
        getContentPane().add(cnbox);
        cnbox.setBounds(260, 310, 90, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 520, 90, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 520, 67, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1250, 600, 61, 25);

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 170, 120, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(430, 520, 71, 25);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(390, 440, 100, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(230, 440, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 440, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnboxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = jTextField1.getText();
        String name=namebox.getText();
        String add=addbox.getText();
        String cnum =cnbox.getText();
        
        try{
            String q = "INSERT INTO supplier(Supplier_ID,Name,Address,Con_Num) values ('"+id+"','"+name+"','"+add+"','"+cnum+"')";
        pst = (PreparedStatement) conn.prepareStatement(q);
        
        pst .execute();
        
        tableload();
                 
            
        }
            
        
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int r = jTable1.getSelectedRow();
        
        String id=jTable1.getValueAt(r, 0).toString();
        String name=jTable1.getValueAt(r, 1).toString();
        String add=jTable1.getValueAt(r, 2).toString();
        String cnum=jTable1.getValueAt(r, 3).toString();
        
        jTextField1.setText(id);
        namebox.setText(name);
        addbox.setText(add);
        cnbox.setText(cnum);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null,"Do You Realy Want To Update");
       
       if(x==0)
       {
        String id = jTextField1.getText();
        String name=namebox.getText();
        String add=addbox.getText();
        String cnum =cnbox.getText();
           
           String sql = "UPDATE supplier SET Supplier_ID ='"+id+"', Name = '"+name+"',Address= '"+add+"',Con_Num = '"+cnum+"' where Supplier_ID = '"+id+"'";
           try {
               pst= (PreparedStatement)  conn.prepareStatement(sql);
               
               pst.execute();
               
               tableload();
           } 
           catch (Exception e) 
           {
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null,"Do You Realy Want To Delete");
         if(x==0)
       {
           String id = jTextField1.getText();
           
           String sql = "DELETE from  supplier  where Supplier_ID = '"+ id +"'";
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

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText() == "" || jTextField1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "ID Field cannot be empty");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name = jTextField4.getText();

        String sql = "SELECT * FROM supplier where Name Like '%"+name+"%' ";
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
            java.util.logging.Logger.getLogger(addnwsupp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addnwsupp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addnwsupp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addnwsupp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addnwsupp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addbox;
    private javax.swing.JTextField cnbox;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField namebox;
    // End of variables declaration//GEN-END:variables
}
