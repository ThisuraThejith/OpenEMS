/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;

/**
 *
 * @author THISURA THEJITH
 */
public class Queries {
    public static class EMS{
        public static class Insert{
            public static String APPRAISALS="Insert into Appraisals values(default,?,?,?)";
            public static String ATTENDANCE="Insert into Attendance values(default,?,?,?)";
            public static String EMPLOYEE="Insert into Employee values(default,?,?,?,?,?,?,?,?,?,?,default,?)";
            public static String ROLE="Insert into Role values(default,?,?,default)";
            public static String SALARY="Insert into Salary values(default,?,?,?,?,?)";
        }
        public static class Select{
            public static String GET_ROLE_ID_BY_NAME="Select RoleID from Role Where RoleName=?";
            public static String GET_ROLES="Select RoleID,RoleName from Role where role_status='Active'";
            public static String GET_SALARY_ID_BY_ROLE_ID="Select SalaryID from Salary Where RoleID=?";
            public static String GET_EMPLOYEE_BY_EMPLOYEE_ID="Select EmployeeName,Address,Date_of_Birth,NIC_No,Current_Status,RoleID from Employee where EmployeeID=?";
            public static String GET_EMPLOYEE_BY_NIC_NO="Select EmployeeID,EmployeeName,Address,Date_of_Birth,Current_Status,RoleID from Employee where NIC_No=?";
            public static String GET_ROLE_NAME_BY_ID="Select RoleName from Role Where RoleID=?";
            public static String GET_APPRAISAL_BY_EMPLOYEE_ID="Select Bonus,Reviews from Appraisals where EmpID=?";
            public static String GET_ROLE_ID_BY_EMPLOYEE_ID="Select RoleID from Employee where EmployeeID=?";
            public static String GET_BONUS_BY_EMPLOYEE_ID="Select Bonus from Appraisals where EmpID=?";
            public static String GET_SALARY_BY_ROLE_ID="Select BasicSalary,EPF,ETF,No_of_Leaves_for_no_pay from Salary where RoleID=?";
            public static String GET_ACTIVE_EMPLOYEES_LIST="Select EmployeeID,First_Name,Last_Name from Employee where Current_Status='Working'";
            public static String GET_NO_OF_ABSENTS_FOR_EMPLOYEE="SELECT COUNT(*) AS COUNT FROM openems.attendance WHERE (Work_Date BETWEEN ? AND ?) AND EmpID = ? AND Presence='Absent'";
            public static String GET_NO_OF_HALFDAYS_FOR_EMPLOYEE="SELECT COUNT(*) AS COUNT FROM openems.attendance WHERE (Work_Date BETWEEN ? AND ?) AND EmpID = ? AND Presence='Half_Day'";
            public static String GET_EMPLOYEE_IDS="SELECT EmployeeID FROM Employee";
            public static String GET_EMPLOYEE_ID_BY_NIC="Select EmployeeID from Employee where NIC_No=?";
            public static String GET_WORK_DATE="Select EmpID from Attendance where Work_Date=?";
            public static String GET_APPRAISAL_ID_BY_EMPLOYEE_ID="Select AppraisalID from Appraisals where EmpID=?";
            public static String GET_EMPLOYEE_TABLE="Select * from Employee";
            public static String GET_APPRAISAL_TABLE="Select EmployeeID,First_Name AS \"First Name\",Last_Name AS \"Last Name\",NIC_No,AppraisalID,Bonus,Reviews from Employee e,Appraisals a where a.EmpID=e.EmployeeID";
            public static String SEARCH_EMPLOYEE="select * from Employee where First_Name like ? or Last_Name like ? or Address like ? or Date_of_Birth like ? or NIC_No like ? or Gender like ? or Marital_Status like ? or Mobile_No like ? or Home_No like ? or Email like ?or Current_Status like ?or RoleID like ?";
            public static String SEARCH_ATTENDANCE_TOGETHER="select EmpID,First_Name,Last_Name,Work_Date,Presence from Employee e,Attendance a where e.EmployeeID=a.EmpID and (Work_Date=? and (EmpID like ? or First_Name like ? or Last_Name like ?))";
            public static String SEARCH_ATTENDANCE_SEPERATE="select EmpID,First_Name,Last_Name,Work_Date,Presence from Employee e,Attendance a where e.EmployeeID=a.EmpID and (Work_Date=? or (EmpID like ? or First_Name like ? or Last_Name like ?))";
            public static String SEARCH_ATTENDANCE_SEPERATE_KEY="select EmpID,First_Name,Last_Name,Work_Date,Presence from Employee e,Attendance a where e.EmployeeID=a.EmpID and (EmpID like ? or First_Name like ? or Last_Name like ?)";
            public static String GET_ATTENDANCE_FOR_DATE = "select EmpID,First_Name,Last_Name,Work_Date,Presence from Employee e,Attendance a where e.EmployeeID=a.EmpID and Work_Date=?";
            public static String GET_CSTATUS_BY_EMPLOYEE_ID="Select Current_Status from Employee where EmployeeID=?";
            public static String SEARCH_APPRAISALS="Select EmployeeID,First_Name,Last_Name,NIC_No,AppraisalID,Bonus,Reviews from Employee e,Appraisals a where a.EmpID=e.EmployeeID AND (First_Name like ? or Last_Name like ? or NIC_No like ? or Bonus like ? or Reviews like ?)";
            public static String GET_ROLE_TABLE="Select RoleID,RoleName,Description from Role where role_status='Active'";
        }
        public static class Update{
            public static String EMPLOYEE="Update Employee Set First_Name=?,Last_Name=?,Address=?,Date_of_Birth=?,NIC_No=?,Gender=?,Marital_Status=?,Mobile_No=?,Home_No=?,Email=?,Current_Status=?,RoleID=? Where EmployeeID=?";
            public static String APPRAISAL="Update Appraisals Set Bonus=?,Reviews=? Where EmpID=?";
            public static String SALARY="Update Salary Set BasicSalary=?,EPF=?,ETF=?,No_of_Leaves_for_no_pay=? Where RoleID=?";
            public static String ROLE="Update Role Set RoleName=?,Description=? Where RoleID=?";
            public static String ATTENDANCE="Update Attendance set Work_Date=?,Presence=? where EmpID=?";
            public static String ROLE_DELETE="Update Role Set role_status='Deactive' Where RoleID=?";
        }


    }
}
