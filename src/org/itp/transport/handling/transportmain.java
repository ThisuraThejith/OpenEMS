/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.transport.handling;

import org.itp.customer.management.CleanManagementSystem;

/**
 *
 * @author LAKVI
 */
public class transportmain extends javax.swing.JFrame {

    
    /**
     * Creates new form main
     */
    public transportmain() {
        initComponents();
         setSize(1500,1000);
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
        jButton2 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel1.setText("Transport");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 10, 231, 59);

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jButton2.setText("Check Items");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(580, 380, 280, 60);

        c1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type Add", "Add New Supplier", "Add New Vehicle" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1);
        c1.setBounds(340, 200, 310, 60);

        jComboBox1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Get Type", "Get Job", "Get Items" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(770, 190, 300, 60);

        jPanel1.setBackground(new java.awt.Color(204, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 200));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 640, 1550, 90);

        jPanel3.setBackground(new java.awt.Color(204, 0, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(2000, 200));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 60, 1950, 80);

        back.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(960, 513, 110, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
       int ta=c1.getSelectedIndex();
       if (ta==1)
       {
            addnwsupp ans=new addnwsupp();
            ans . setVisible(true);
            this.dispose();
       }
       else
           if(ta==2)
           {
            addnwvehi anv=new addnwvehi();
            anv . setVisible(true);
            this.dispose();
           }
       
        
    }//GEN-LAST:event_c1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int gt=jComboBox1.getSelectedIndex();
       if (gt==1)
       {
           
            Getjob gb=new Getjob();
            gb . setVisible(true);
            this.dispose();
       }
       else
           if(gt==2)
           {
             GetItem gi=new GetItem();
            gi . setVisible(true);
            this.dispose();
           }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            checkItems ci=new checkItems();
            ci . setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        CleanManagementSystem cmm=new CleanManagementSystem();
        cmm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(transportmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transportmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transportmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transportmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transportmain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox c1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}