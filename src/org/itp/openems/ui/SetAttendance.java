/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.ui;

import java.awt.GridBagLayout;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.CellRendererPane;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.Queries;
import org.itp.commons.Validation;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author THISURA THEJITH
 */
public class SetAttendance extends javax.swing.JFrame {

    /**
     * Creates new form SetAttendance
     */
    public SetAttendance() {
        initComponents();
        tableLoad();
        Date date = new Date();
        workDateDc.setDate(date);

    }
   
    

    

    private void setAttendanceCombo() {
        TableColumn presenceColumn = attendanceTable.getColumnModel().getColumn(2);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Present");
        comboBox.addItem("Absent");
        comboBox.addItem("HalfDay");
        presenceColumn.setCellEditor(new DefaultCellEditor(comboBox));
        presenceColumn.setCellRenderer(new ComboRenderer(new String[]{"Present", "Absent", "HalfDay"}));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        workDateDc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Set Attendance");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.setName("backBtn"); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Employee Name", "Presence"
            }
        ));
        attendanceTable.setRowHeight(20);
        jScrollPane1.setViewportView(attendanceTable);

        jLabel1.setText("Work_Date");

        workDateDc.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(workDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(saveBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainInterface m1 = new MainInterface();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int rowCount = attendanceTable.getRowCount();
        
        if (((JTextField)workDateDc.getDateEditor().getUiComponent()).getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Work_Date cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            
            try {
                int EmpID=0;
                Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_WORK_DATE);
                preparedStatement.setString(1, ((JTextField) this.workDateDc.getDateEditor().getUiComponent()).getText());
                ResultSet resultset = preparedStatement.executeQuery();
                int count=0;
                while (resultset.next()) {
                    EmpID = resultset.getInt("EmpID");
                    count++;
                }
                if (count != 0) {
                    JOptionPane.showMessageDialog(null, "Attendance details of this work date has already been added", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                resultset.close();
                preparedStatement.close();
                for (int row = 0; row < rowCount; row++) {
                        
                        connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
                        preparedStatement = connect.prepareStatement(Queries.EMS.Insert.ATTENDANCE);
                        preparedStatement.setString(1, attendanceTable.getValueAt(row, 0).toString());
                        preparedStatement.setString(2, ((JTextField)this.workDateDc.getDateEditor().getUiComponent()).getText());
                        preparedStatement.setString(3, attendanceTable.getValueAt(row, 2).toString());

                        int affectedRows = preparedStatement.executeUpdate();
                        System.out.println("affected rows=" + affectedRows);
                        preparedStatement.close();

                    }
                    JOptionPane.showMessageDialog(null, "Added Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    MainInterface m2 = new MainInterface();
                    m2.setVisible(true);
                    this.dispose();
                
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    public void tableLoad() {
        Map<String, String> records = new HashMap<String, String>();

        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ATTENDANCE_LIST);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                records.put(resultset.getString("EmployeeID"), resultset.getString("EmployeeName"));
            }
            preparedStatement.close();
            Object[][] tableContent = new Object[records.size()][3];
            int index = 0;
            for (String key : records.keySet()) {
                tableContent[index][0] = key;
                tableContent[index][1] = records.get(key);
                tableContent[index][2] = "Present";
                index++;
            }
            attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
                    tableContent, new String[]{"EmployeeID", "Employee Name", "Presence"}));
            setAttendanceCombo();

        } catch (Exception e) {
            System.out.println(e);
        }

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
            java.util.logging.Logger.getLogger(SetAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    private com.toedter.calendar.JDateChooser workDateDc;
    // End of variables declaration//GEN-END:variables
}
