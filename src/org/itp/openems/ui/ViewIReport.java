/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package org.itp.openems.ui;



import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JRDesignViewer.*;
import net.sf.jasperreports.view.JRViewer;
import org.itp.commons.DBUtils;
import org.itp.openems.model.Employee;
import org.itp.openems.model.Salary;
import org.itp.openems.model.Appraisals;



/**
 *
 * @author THISURA THEJITH
 */
public class ViewIReport extends JFrame{
    
    public ViewIReport(String fileName){
        this(fileName,null);
    }
    
    public ViewIReport(String fileName, HashMap parameters) {
        super("View Report");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull", "root", "123456");
            JasperPrint print = JasperFillManager.fillReport(fileName, parameters, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);
        }catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (JRException jre) {
            jre.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setBounds(10, 10, 1200, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void SalReport(int empID) throws SQLException {
        ViewIReport viewer = new ViewIReport("./reports/salaryreport.jasper", getParameterMapForSalaryReport(empID));
        viewer.setVisible(true);
    }

    public static void EmpReport(int empID) throws SQLException {
        HashMap param = new HashMap();
        Employee employee1 = DBUtils.getEmployee(empID);
        Employee employee2=DBUtils.getEmployeeNICStatus(empID);
        Appraisals appraisal=DBUtils.getAppraisal(empID);
        param.put("EmployeeID", empID);
        param.put("FirstName", employee1.getFirstName());
        param.put("LastName", employee1.getLastName());
        param.put("NICNo", employee2.getNIC());
        param.put("CurrentStatus", employee2.getCstatus());
        param.put("Post", employee1.getRoleName());
        param.put("Reviews",appraisal.getReviews());
        ViewIReport viewer = new ViewIReport("./reports/employeeReport.jasper", param);
        viewer.setVisible(true);
    }

    public static void scheduleReport() {
        HashMap param = new HashMap();
        ViewIReport viewer = new ViewIReport("./reports/jobReport.jasper", param);
        viewer.setVisible(true);
    }
    
    public static void inventoryReport() {
        HashMap param = new HashMap();
        ViewIReport viewer = new ViewIReport("./reports/innentoryreport.jasper", param);
        viewer.setVisible(true);
    }
    
    public static void supplierReport() {
        HashMap param = new HashMap();
        ViewIReport viewer = new ViewIReport("./reports/supplierreport.jasper", param);
        viewer.setVisible(true);
    }
    
    public static void salesReport() {
        HashMap param = new HashMap();
        ViewIReport viewer = new ViewIReport("./reports/salesreport.jasper", param);
        viewer.setVisible(true);
    }

    public static HashMap getParameterMapForSalaryReport(int empID) throws SQLException {
        HashMap param = new HashMap();
        Salary salary = DBUtils.getSalaryForEmployeeID(empID);
        if (salary.getAbsentCount() + (salary.getHalfDayCount() / 2) > salary.getMaxLeaves()) {
            Employee employee = DBUtils.getEmployee(empID);
            param.put("EmployeeID", empID);
            param.put("FirstName", employee.getFirstName());
            param.put("LastName", employee.getLastName());
            param.put("Post", employee.getRoleName());
            param.put("BasicSalary", salary.getBasicSalary());
            param.put("EPF", 0);
            param.put("ETF", 0);
            param.put("Bonus", 0);
            param.put("TotalSalary", 0);
        } else {
            Employee employee = DBUtils.getEmployee(empID);
            param.put("EmployeeID", empID);
            param.put("FirstName", employee.getFirstName());
            param.put("LastName", employee.getLastName());
            param.put("Post", employee.getRoleName());
            param.put("BasicSalary", salary.getBasicSalary());
            param.put("EPF", salary.getEpf());
            param.put("ETF", salary.getEtf());
            param.put("Bonus", salary.getBonus());
            param.put("TotalSalary", salary.calculateSalary());
        }

        return param;
    }
    
}
