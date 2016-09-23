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
import org.itp.openems.model.Appraisals;
import org.itp.openems.model.Employee;
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
        preparedStatement.setString(1, Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) + "-01-01");
        Calendar today = Calendar.getInstance();
        preparedStatement.setString(2, Integer.toString(today.get(Calendar.YEAR)) + "-" + Integer.toString(today.get(Calendar.MONTH) + 1)+ "-" + today.get(Calendar.DATE));
        preparedStatement.setInt(3, employeeID);
        ResultSet resultset = preparedStatement.executeQuery();
        while (resultset.next()) {
            salary.setAbsentCount(resultset.getInt("COUNT"));
        }
        resultset.close();
        preparedStatement.close();

        preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_NO_OF_HALFDAYS_FOR_EMPLOYEE);
        preparedStatement.setString(1, Integer.toString(Calendar.getInstance().get(Calendar.YEAR)) + "01-01");
        preparedStatement.setString(2, Integer.toString(today.get(Calendar.YEAR)) + Integer.toString(today.get(Calendar.MONTH) + 1)+ today.get(Calendar.DATE));
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
            salary.setEpfRate(resultset.getDouble("EPF"));
            salary.setEtfRate(resultset.getDouble("ETF"));
            salary.setMaxLeaves(resultset.getInt("No_of_Leaves_for_no_pay"));
        }
        resultset.close();
        preparedStatement.close();
        return salary;
    }
    
    public static Employee getEmployee(int employeeID) throws SQLException{
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_EMPLOYEE);
        preparedStatement.setInt(1, employeeID);
        ResultSet resultset = preparedStatement.executeQuery();
        Employee employee = new Employee();
        while (resultset.next()) {
            employee.setEmpID(employeeID);
            employee.setFirstName(resultset.getString("First_Name"));
            employee.setLastName(resultset.getString("Last_Name"));
            employee.setRoleName(resultset.getString("RoleName"));
        }
        resultset.close();
        preparedStatement.close();
        return employee;
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
    
    public static Appraisals getAppraisal(int employeeID) throws SQLException{
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_REVIEWS);
        preparedStatement.setInt(1, employeeID);
        ResultSet resultset = preparedStatement.executeQuery();
        Appraisals appraisal = new Appraisals();
        while (resultset.next()) {
            appraisal.setReviews(resultset.getString("Reviews"));
        }
        resultset.close();
        preparedStatement.close();
        return appraisal;
    }
    
    public static Employee getEmployeeNICStatus(int employeeID) throws SQLException{
        Connection connect = new DBConnect(Constants.USER, Constants.PASSWORD).getConnection();
        PreparedStatement preparedStatement = connect.prepareStatement(Queries.EMS.Select.GET_NIC_STATUS);
        preparedStatement.setInt(1, employeeID);
        ResultSet resultset = preparedStatement.executeQuery();
        Employee employee = new Employee();
        while (resultset.next()) {
            employee.setNIC(resultset.getString("NIC_No"));
            employee.setCstatus(resultset.getString("Current_Status"));
        }
        resultset.close();
        preparedStatement.close();
        return employee;
    }
}
