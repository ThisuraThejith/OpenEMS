/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.itp.commons.Constants;
import org.itp.commons.DBConnect;
import org.itp.commons.Queries;
import org.itp.openems.model.Attendance;

/**
 *
 * @author THISURA THEJITH
 */
public class ViewAttendance extends javax.swing.JFrame {

    /**
     * Creates new form ViewAttendance
     */
    public ViewAttendance() {
        initComponents();
        loadTableforAttendance();
    }
    
    private void setAttendanceCombo() {
        TableColumn presenceColumn = attendanceTable.getColumnModel().getColumn(3);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Present");
        comboBox.addItem("Absent");
        comboBox.addItem("HalfDay");
        presenceColumn.setCellEditor(new DefaultCellEditor(comboBox));
        presenceColumn.setCellRenderer(new ComboRenderer(new String[]{"Present", "Absent", "HalfDay"}));
    }
    
    public void loadTableforAttendance() {
        Map<String, String> records = new HashMap<String, String>();

        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ACTIVE_EMPLOYEES_LIST);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                records.put(resultset.getString("EmployeeID"), resultset.getString("First_Name") + " " + resultset.getString("Last_Name"));
                
            }
            
            preparedStatement.close();
            Object[][] tableContent = new Object[records.size()][4];
            int index = 0;
            for (String key : records.keySet()) {
                tableContent[index][0] = key;
                tableContent[index][1] = records.get(key);
                tableContent[index][2] = ((JTextField) this.workDateDc.getDateEditor().getUiComponent()).getText();
                tableContent[index][3] = "Present";
                index++;
            }
            attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
                    tableContent, new String[]{"EmployeeID", "Employee Name", "Work Date", "Presence"}));
            DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
            model.setRowCount(0);
            setAttendanceCombo();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void searchTableLoad(String sqlQuery) {
        List<Attendance> records = new ArrayList<Attendance>();
        //Map<String,String> attendance = new HashMap<String, String>();

        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(sqlQuery);

            preparedStatement.setString(1, ((JTextField) this.workDateDc.getDateEditor().getUiComponent()).getText());
            String keyword = searchTxt.getText();
            if ("".equals(keyword)) {
                keyword = "&*(";

            }
            preparedStatement.setString(2, "%" + keyword + "%");
            preparedStatement.setString(3, "%" + keyword + "%");
            preparedStatement.setString(4, "%" + keyword + "%");
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                Attendance attendance = new Attendance();
                attendance.setEmployeeID(resultset.getInt("EmpID"));
                attendance.setFirstName(resultset.getString("First_Name"));
                attendance.setLastName(resultset.getString("Last_Name"));
                attendance.setWorkDate(resultset.getString("Work_Date"));
                attendance.setPresence(resultset.getString("Presence"));
                records.add(attendance);
            }
            preparedStatement.close();
            Object[][] tableContent = new Object[records.size()][4];
            int index = 0;
            for (Attendance attendance : records) {
                tableContent[index][0] = attendance.getEmployeeID();
                tableContent[index][1] = attendance.getFirstName() + " " + attendance.getLastName();
                tableContent[index][2] = attendance.getWorkDate();
                tableContent[index][3] = attendance.getPresence();
                index++;
            }
            attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
                    tableContent, new String[]{"EmployeeID", "Employee Name", "Work Date", "Presence"}));
            setAttendanceCombo();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        workDateDc = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itp/image/log.png"))); // NOI18N

        workDateDc.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("Work Date");

        searchBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        attendanceTable.setRowHeight(20);
        jScrollPane1.setViewportView(attendanceTable);

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");

        backBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(workDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(workDateDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) attendanceTable.getModel();
        model.setRowCount(0);
        if (((JTextField) this.workDateDc.getDateEditor().getUiComponent()).getText().isEmpty() && searchTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set a keyword to search", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!((JTextField) this.workDateDc.getDateEditor().getUiComponent()).getText().isEmpty() && !searchTxt.getText().isEmpty()) {
            searchTableLoad(Queries.EMS.Select.SEARCH_ATTENDANCE_TOGETHER);
        } else {
            searchTableLoad(Queries.EMS.Select.SEARCH_ATTENDANCE_SEPERATE);

        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton updateBtn;
    private com.toedter.calendar.JDateChooser workDateDc;
    // End of variables declaration//GEN-END:variables
}
