package org.itp.finance.management;
import java.sql.Connection;
import java.sql.PreparedStatement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
    
   // public IssuePayment(){
       //    initComponents();
           
          // conn = dbconnec.connect();
    

   

public class IssuePayment extends javax.swing.JFrame {
Connection conn = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form finance2new
     */
    public IssuePayment() {
        initComponents();
         conn = dbconnec.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pd = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        am = new javax.swing.JLabel();
        bdap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bdapbx = new javax.swing.JTextArea();
        ambx = new javax.swing.JTextField();
        pdbx = new javax.swing.JTextField();
        subbtton = new javax.swing.JButton();
        rn = new javax.swing.JLabel();
        rnbx = new javax.swing.JTextField();
        bck = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pd.setText("Payment date.& time.");
        getContentPane().add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 81, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ISSUE PAYMENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 152, -1));

        am.setText("Amount(Rs).");
        getContentPane().add(am, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 208, 157, -1));

        bdap.setText("Brief description about payment.");
        getContentPane().add(bdap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, -1, -1));

        bdapbx.setColumns(20);
        bdapbx.setRows(5);
        jScrollPane1.setViewportView(bdapbx);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 243, 302, 105));

        ambx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambxActionPerformed(evt);
            }
        });
        getContentPane().add(ambx, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 205, 302, -1));
        getContentPane().add(pdbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 167, 302, -1));

        subbtton.setText("SUBMIT");
        subbtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbttonActionPerformed(evt);
            }
        });
        getContentPane().add(subbtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 377, 114, -1));

        rn.setText("Recievers name.");
        getContentPane().add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, 108, -1));
        getContentPane().add(rnbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 129, 302, -1));

        bck.setText("<back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });
        getContentPane().add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 377, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 25, 477, 66));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/b2.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ambxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ambxActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
         //   MainFinance mainfinance= new MainFinance();
        MainFinance mainfinance= new MainFinance();
        mainfinance.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_bckActionPerformed

    private void subbttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbttonActionPerformed
     String rno = rnbx.getText();
      String pda = pdbx.getText();
     // String pnom = pnobx.getText();
      String amnt = ambx.getText();
      String bdapa = bdapbx.getText();
      
       try   {
      
       String e = "INSERT INTO issuepaymnet (rname,pd,pn,amount,bdap) values ('"+rno+"','"+pda+"',null,'"+amnt+"','"+bdapa+"')";
      pst = conn.prepareStatement(e);
      pst.execute();
    }catch (Exception e) {
        System.out.println(e);
    }
       rnbx.setText("");
        pdbx.setText("");
        ambx.setText("");
        
        bdapbx.setText("");
        
   
       
       
       
       
      
    }//GEN-LAST:event_subbttonActionPerformed

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
//            java.util.logging.Logger.getLogger(finance2new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//            java.util.logging.Logger.getLogger(finance2new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            java.util.logging.Logger.getLogger(finance2new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            java.util.logging.Logger.getLogger(finance2new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IssuePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel am;
    private javax.swing.JTextField ambx;
    private javax.swing.JButton bck;
    private javax.swing.JLabel bdap;
    private javax.swing.JTextArea bdapbx;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pd;
    private javax.swing.JTextField pdbx;
    private javax.swing.JLabel rn;
    private javax.swing.JTextField rnbx;
    private javax.swing.JButton subbtton;
    // End of variables declaration//GEN-END:variables
}
