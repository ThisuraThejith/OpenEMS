/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.itp.commons.DBConnect;
import org.itp.commons.Queries;
import org.itp.customer.management.CleanManagementSystem;
import org.itp.customer.management.Login;
import org.itp.openems.ui.EmployeeMainInterface;


/**
 *
 * @author THISURA THEJITH
 */
public class EmployeeManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login l1=new Login();
        l1.setVisible(true);
            
        // TODO code application logic here
//        try{
//        Connection connect = new DBConnect("root", "123456").getConnection();
//        
//        PreparedStatement prep = connect.prepareStatement(Queries.EMS.Insert.APPRAISALS);
//        PreparedStatement prep1 = connect.prepareStatement(Queries.EMS.Insert.ATTENDANCE);
//        PreparedStatement prep2 = connect.prepareStatement(Queries.EMS.Insert.EMPLOYEE);
//        
//        
//        
//        
//                }catch(SQLException e){}
    }
    
}
