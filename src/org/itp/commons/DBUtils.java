/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author THISURA THEJITH
 */
public class DBUtils {
    public static void loadRoles(JComboBox combo){
        try{
            Connection connect=new DBConnect(Constants.USER,Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement=connect.prepareStatement(Queries.EMS.Select.GET_ROLES);
            ResultSet resultset=preparedStatement.executeQuery();
            
            while(resultset.next()){
                combo.addItem(resultset.getString("RoleName"));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    
    }
    
    public static String getRoleNameByID(int roleID){
        String roleName = "";
        try{
            Connection connect=new DBConnect(Constants.USER,Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement=connect.prepareStatement(Queries.EMS.Select.GET_ROLE_NAME_BY_ID);
            preparedStatement.setInt(1, roleID);
            ResultSet resultset=preparedStatement.executeQuery();
            while(resultset.next()){
                roleName=resultset.getString("RoleName");
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return roleName;
    }
}
