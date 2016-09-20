package org.itp.finance.management ;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnec {
            public static Connection connect()
            {
              Connection conn = null;
              
              try
              {
                  Class.forName("com.mysql.jdbc.Driver");
                   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull","root","123456");
                   if (conn!=null) {
                       System.out.println("Connected");
                  }
              }
              catch(Exception e)
              {
                 System.out.println(e); 
                  
              }
              return conn;
            }

   
}
                  
                  
                  
              
    
    
    

