/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.customer.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CHATHURAAKSHA
 */
public class DBconnect {
public static Connection connect()
    {
        Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull","root","123456");
            System.out.println("Db connection success");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
            System.out.println("db connection error");
        }
        return conn;
    }
    
    
}
