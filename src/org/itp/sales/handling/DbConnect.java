
package org.itp.sales.handling;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DbConnect {
    
    public static Connection connect(){
       
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","12345");
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        return con;
    }
    
}
