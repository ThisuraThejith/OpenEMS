/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JRDesignViewer.*;
import net.sf.jasperreports.view.JRViewer;



/**
 *
 * @author ChathuRaaksha
 */
public class ViewIReport extends JFrame{
    
    public ViewIReport(String fileName){
        this(fileName,null);
    }
    
    public ViewIReport(String fileName,HashMap parameter){
        super("View Report");
    
    
    
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull","root","123456");


                JasperPrint print = JasperFillManager.fillReport(fileName, parameter, con);
                JRViewer viewer = new JRViewer(print);

                Container c = getContentPane();
                c.add(viewer);
            }
            catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
            }
            catch(SQLException sqle){
            sqle.printStackTrace();
            }
            catch(JRException jre){
            jre.printStackTrace();
            }
            catch(Exception e){
            e.printStackTrace();
            }
            setBounds(10, 10, 1200, 700);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    
    
    public static void CusReport(int CusID){
        HashMap param = new HashMap();
        param.put("CusID", CusID);
        ViewIReport viewer = new ViewIReport("./reports/customer_report.jasper",param);
        viewer.setVisible(true);
    }
    
    public static void EmpReport(int EmpID){
        HashMap param = new HashMap();
        param.put("EmployeeID", EmpID);
        ViewIReport viewer = new ViewIReport("./reports/employeeReport.jasper",param);
        viewer.setVisible(true);
    }

}
/**
 *
 * @author CHATHURAAKSHA
 */
