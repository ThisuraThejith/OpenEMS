/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tranceport;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LAKVI
 */
public class dbcoonnect {
    
    
    
    public static Connection connect()
    {
        Connection conn = null;
        
            try {
                   Class.forName("com.mysql.jdbc.Driver");
                   
                   conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newtransport","root","");           
            } 
            catch (Exception e) 
            { 
                System.out.println(e);
            }
        
        return conn;
    }
    
}
