package org.itp.service.scheduling;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Calendar;
//import org.jdatepicker.impl.*;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
//import java.sql.Date;
/*
            "search customr" eken customer va search karala, customer id eka return venawa
            "check availabilty" eken acrive employees gana return venawa
 */

/**
 *
 * @author Kavinda
 */
public class jobaddnew extends javax.swing.JFrame {

    Connection con2 = DBconnect.connect();
    PreparedStatement pst, pst2;
    String sqlq, sql2, sql3;
    ResultSet rs1;
    String datee;
    double gpr, spr = 800;
    int eTotavil=0, assign=0, eAva=0;
    DecimalFormat df = new DecimalFormat("#.00");

    /**
     * Creates new form jobschedulemain
     */
    public jobaddnew() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public jobaddnew(int cus) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        int customerID = cus;

        jTextField1.setText(Integer.toString(customerID));
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
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnChk = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnSearcCus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();

        jFrame1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jFrame1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("details of added job");
        jLabel1.setToolTipText("");

        jLabel2.setText("job ID");
        jLabel2.setToolTipText("");

        jLabel3.setText("gross price");
        jLabel3.setToolTipText("");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setToolTipText("");
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setEnabled(false);

        jButton1.setText("Back");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnChk.setText("Check availability");
        btnChk.setEnabled(false);
        btnChk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChkMouseClicked(evt);
            }
        });
        btnChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkActionPerformed(evt);
            }
        });

        btnAdd.setText("Add job");
        btnAdd.setEnabled(false);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer ID");
        jLabel4.setToolTipText("");

        jTextField3.setForeground(new java.awt.Color(224, 215, 215));
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField3.setEnabled(false);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel5.setText("job details");
        jLabel5.setToolTipText("");

        jLabel6.setText("Date");
        jLabel6.setToolTipText("");

        jLabel7.setText("place");
        jLabel7.setToolTipText("");

        jLabel8.setText("No. of employees needed");
        jLabel8.setToolTipText("");

        jLabel9.setText("No. of employees available");
        jLabel9.setToolTipText("");

        jTextField7.setToolTipText("");
        jTextField7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField7.setEnabled(false);

        btnSearcCus.setText("Search customer");
        btnSearcCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearcCusMouseClicked(evt);
            }
        });
        btnSearcCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearcCusActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Gross price");

        jTextField8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField8.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addContainerGap(495, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearcCus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel5))
                                                        .addGap(89, 89, 89))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(15, 15, 15)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                    .addComponent(jTextField4)
                                                    .addComponent(jTextField5))
                                                .addGap(106, 106, 106))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnChk)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jTextField8))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSearcCus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(4, 4, 4)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1))))
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5))
                .addGap(28, 28, 28)
                .addComponent(btnChk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        jobschedulemain sh1 = new jobschedulemain();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSearcCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearcCusMouseClicked
        // search customer form open

    }//GEN-LAST:event_btnSearcCusMouseClicked

    private void btnChkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChkMouseClicked


    }//GEN-LAST:event_btnChkMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked

    }//GEN-LAST:event_btnAddMouseClicked

    private void btnSearcCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearcCusActionPerformed
        // TODO add your handling code here:
        jobSearchCus search1 = new jobSearchCus();
        this.setEnabled(false);
        this.dispose();

    }//GEN-LAST:event_btnSearcCusActionPerformed

    private void jFrame1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame1ComponentShown
        // TODO add your handling code here:
        Calendar c1 = new GregorianCalendar();
        //c1.se
    }//GEN-LAST:event_jFrame1ComponentShown

    private void btnChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChkActionPerformed
        String datee = jTextField4.getText();
        //employees assigned in other jobs  at that date
        //sqlq= "SELECT count(e.empid) as ta FROM empjobs e INNER JOIN jobs j ON e.jobid = j.jobid where j.date='"+datee+"'";
        sqlq = "SELECT sum(empass) as ta FROM empassigned where jdate='" + datee + "'";

        //employees in leave in that date
        sql2 = "SELECT count(l.empid) as tl FROM leavek l where l.date='" + datee + "'";

        //total employees working
        String sql3 = "select count(*) as tot from employee where Current_Status='working'";
        try {
            //total employees working
            pst = con2.prepareStatement(sql3);
            rs1 = pst.executeQuery(sql3);
            //int eTotavil = 0;
            if (rs1.next()) {
                eTotavil = rs1.getInt("tot");
                System.out.println(eTotavil);
            }

            //employees assigned in other jobs  at that date
            pst = con2.prepareStatement(sqlq);
            rs1 = pst.executeQuery(sqlq);
            int eAssignedOther = 0;
            if (rs1.next()) {
                eAssignedOther = rs1.getInt("ta");
                System.out.println(eAssignedOther);
            }

            //employees in leave in that date
            pst = con2.prepareStatement(sql2);
            rs1 = pst.executeQuery(sql2);
            int eLeave = 0;
            if (rs1.next()) {
                eLeave = rs1.getInt("tl");
                System.out.println(eLeave);
            }

            //Final available employees
            eAva=eTotavil - eLeave - eAssignedOther;
            if(eAva<0)
                eAva=0;
            
            System.out.println(eAva);
            jTextField3.setText(Integer.toString(eAva));

            //System.out.println(sqlq);
        } catch (Exception e) {
            System.err.print(e);
            return;
        }

        //availabity confirm nm vitharak
        gpr = spr * Double.parseDouble(jTextField5.getText()) * 1.15;
        String tmp = df.format(gpr);
        jTextField8.setText(tmp);
        btnAdd.setEnabled(true);
    }//GEN-LAST:event_btnChkActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        btnAdd.setEnabled(false);
        for (int i = 0; i < jTextField5.getText().length(); i++) {
            if (!(Character.isDigit(jTextField5.getText().charAt(i)))) {
                jTextField5.setForeground(Color.red);
                //jButton2.setEnabled(false);
                //jButton4.setEnabled(false);
                //jLabel4.setVisible(true);
                jOptionPane1.showMessageDialog(rootPane, "Enter only digits in this field", "error", JOptionPane.WARNING_MESSAGE);
                jTextField5.setText("");
                jTextField5.setForeground(Color.BLACK);
                return;
            }
        }
        btnChk.setEnabled(true);
        //jLabel4.setVisible(false);

        boolean tb4 = !(jTextField4.getText().isEmpty()); //true if empty
        boolean tb6 = !(jTextField6.getText().isEmpty());
        boolean tb5 = !(jTextField5.getText().isEmpty());
        boolean tb1 = !(jTextField1.getText().isEmpty());

        if (tb5 && tb6 && tb4 && tb1) {
            btnChk.setEnabled(true);
        } else {
            btnChk.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        btnAdd.setEnabled(false);
        for (int i = 0; i < jTextField1.getText().length(); i++) {
            if (!(Character.isDigit(jTextField1.getText().charAt(i)))) {
                jTextField1.setForeground(Color.red);
                //jButton2.setEnabled(false);
                //jButton4.setEnabled(false);
                //jLabel4.setVisible(true);
                jOptionPane1.showMessageDialog(rootPane, "Enter only digits in this field", "error", JOptionPane.WARNING_MESSAGE);
                jTextField1.setText("");
                jTextField1.setForeground(Color.BLACK);
                return;
            }
        }
        btnChk.setEnabled(true);
        //jLabel4.setVisible(false);

        boolean tb4 = !(jTextField4.getText().isEmpty()); //true if empty
        boolean tb6 = !(jTextField6.getText().isEmpty());
        boolean tb5 = !(jTextField5.getText().isEmpty());
        boolean tb1 = !(jTextField1.getText().isEmpty());

        if (tb5 && tb6 && tb4 && tb1) {
            btnChk.setEnabled(true);
        } else {
            btnChk.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        btnAdd.setEnabled(false);
        btnChk.setEnabled(true);
        //jLabel4.setVisible(false);

        boolean tb4 = !(jTextField4.getText().isEmpty()); //true if empty
        boolean tb6 = !(jTextField6.getText().isEmpty());
        boolean tb5 = !(jTextField5.getText().isEmpty());
        boolean tb1 = !(jTextField1.getText().isEmpty());

        if (tb5 && tb6 && tb4 && tb1) {
            btnChk.setEnabled(true);
        } else {
            btnChk.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String cid = jTextField1.getText();
        String dtt = jTextField4.getText();
        String plc = jTextField6.getText();
        String eneed = jTextField5.getText();

        System.out.println(eneed);
        gpr = Double.parseDouble(eneed) * spr * 1.15;
        System.out.println(gpr);

         //insert the job
        sqlq = "insert into jobs values(null," + cid + ",'" + plc + "','" + dtt + "'," + eneed + ", " + gpr + ");";
        
        //select last added job; that means this job
        sql2 = "select max(jobid) from jobs";
        int lastjob = 0;

        try {
            
                
            pst = con2.prepareStatement(sqlq);
            pst.execute(sqlq);
            
            
            jOptionPane1.showMessageDialog(rootPane, "Job added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.err.print(e);
            jOptionPane1.showMessageDialog(rootPane, "Job insertion failed", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //getting jobid
        try {
            pst = con2.prepareStatement(sql2);
            rs1 = pst.executeQuery(sql2);

            if (rs1.next()) {
                lastjob = rs1.getInt(1);
            }
            System.out.println(lastjob);
            
            //employees assigned in this job(if there are enough workers)
            if(Integer.parseInt(eneed)<=eAva)
                sql3 = "insert into empassigned values("+lastjob+",'" + dtt + "',"+eneed+");";
            else
                sql3 = "insert into empassigned values("+lastjob+",'" + dtt + "',"+eAva+");";
            System.out.println("EmpAss: "+sql3);
            
            pst = con2.prepareStatement(sql3);
            pst.execute(sql3);

            //display new job details
            //sqlq="select jobid, gprice from jobs where jobid="+lastjob;
            sqlq = "select * from jobs where jobid=" + lastjob;

            pst = con2.prepareStatement(sqlq);
            rs1 = pst.executeQuery(sqlq);

            if (rs1.next()) {
                jTextField2.setText(rs1.getString("jobid"));
                jTextField7.setText(rs1.getString("gprice"));
            }

            

        } catch (Exception e) {
            jOptionPane1.showMessageDialog(rootPane, "Getting the new job ID failed", "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println(e);
            return;
        }
        /*      */
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        clearAll();
        btnChk.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void curDate() {
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        datee = year + "-" + month + "-" + day;

        System.out.println(datee);
    }

    public void clearAll() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        //String iw="3"; jTextField

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChk;
    private javax.swing.JButton btnSearcCus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
