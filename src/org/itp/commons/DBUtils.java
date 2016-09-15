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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.itp.openems.model.Salary;

/**
 *
 * @author THISURA THEJITH
 */
public class DBUtils {

    public static void loadRoles(JComboBox combo) {
        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLES);
            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
                combo.addItem(resultset.getString("RoleName"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static String getRoleNameByID(int roleID) {
        String roleName = "";
        try {
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_NAME_BY_ID);
            preparedStatement.setInt(1, roleID);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                roleName = resultset.getString("RoleName");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return roleName;
    }
    
    public static String getStatusByEmployeeID(int employeeID){
        String status="";
        try{
            Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
            PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_CSTATUS_BY_EMPLOYEE_ID);
            preparedStatement.setInt(1,employeeID);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                status = resultset.getString("Current_Status");
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
        return status;
    }

    public static Salary getSalaryForEmployeeID(int employeeID) throws SQLException {
        Salary salary = new Salary();
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_NO_OF_ABSENTS_FOR_EMPLOYEE);
        preparedStatement.setString(1, Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) + "01-01");
        preparedStatement.setDate(2, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        preparedStatement.setInt(3, employeeID);
        ResultSet resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            salary.setAbsentCount(resultset.getInt("COUNT"));
        }
        resultset.close();
        preparedStatement.close();

        preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_NO_OF_HALFDAYS_FOR_EMPLOYEE);
        preparedStatement.setString(1, Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) + "01-01");
        preparedStatement.setDate(2, new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        preparedStatement.setInt(3, employeeID);
        resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            salary.setHalfDayCount(resultset.getInt("COUNT"));
        }
        resultset.close();
        preparedStatement.close();

        preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_BONUS_BY_EMPLOYEE_ID);
        preparedStatement.setInt(1, employeeID);
        resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
           salary.setBonus(resultset.getDouble("Bonus"));
        }

        resultset.close();
        preparedStatement.close();
        preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_ROLE_ID_BY_EMPLOYEE_ID);
        preparedStatement.setInt(1, employeeID);
        resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            salary.setRoleID(resultset.getInt("RoleID"));
        }
        resultset.close();
        preparedStatement.close();
        preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_SALARY_BY_ROLE_ID);
        preparedStatement.setInt(1, salary.getRoleID());

        resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            salary.setBasicSalary(resultset.getDouble("BasicSalary"));
            salary.setEpf(resultset.getDouble("EPF"));
            salary.setEtf(resultset.getDouble("ETF"));
            salary.setMaxLeaves(resultset.getInt("No_of_Leaves_for_no_pay"));
        }
        resultset.close();
        preparedStatement.close();
        return salary;
    }
    
    public static List<Integer> getEmployeeIds() throws SQLException{
        List<Integer> eids = new ArrayList<>();
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE_IDS);
        ResultSet resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            eids.add(resultset.getInt("EmployeeID"));
        }
        resultset.close();
        preparedStatement.close();
        return eids;
    }
}
