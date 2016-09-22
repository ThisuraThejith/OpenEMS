/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.inventory.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DbConnect {
        static Connection con = null;
  /*  public DbConnect() throws SQLException{
        this.connect();
    }*/
    public static Connection connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull","root","123456");
        } catch (Exception e) {
            System.out.println(e);
          }
        return con;
    }
   
}
