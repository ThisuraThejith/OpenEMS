/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.service.scheduling;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

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
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("db connection error");
        }
        return conn;
    }
    
}