/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;
import java.sql.Connection;
import java.awt.List;
import java.io.Closeable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
/**
 *
 * @author THISURA THEJITH
 */


public class DBConnect {
	
	private static Connection connection = null;
	private String user= null;
	private String password = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private final long INSERTION_FAILED_ID = -1;
	
	public DBConnect(String user, String password){
		this.user = user;
		this.password = password;	
		this.setConnection();
                this.read("SELECT * FROM openems.appraisals");
                
	}
	private  void setConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/openems?"+ "user="+this.user+"&password="+this.password);
		} catch (Exception e) {
			System.out.println("Error setting connection. \n");
			System.out.println("Error while opening connection. \n"+e.toString());
			System.out.println("Error end");
		}
		
	} 
	
        public Connection getConnection(){
            return this.connection;
        }
        
        /**
	 * SELECT queries can be run here. 
	 * */
	public ResultSet read(String query){
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				System.out.println("The grading = "+resultSet.getString("Grading")+" Bonus = "+resultSet.getString("Bonus"));
			}
			return resultSet;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("The read query can\'t be executed. The error is \n "+e.toString());
			return null;
		}finally{
			this.close();
		}
		
	}
        private void close(){
		try{
			if (resultSet!=null){resultSet.close();}
			if(statement!=null){statement.close();}
			
		}catch(Exception e){
			System.out.println("Error while closing connection.");
		}
	}
}