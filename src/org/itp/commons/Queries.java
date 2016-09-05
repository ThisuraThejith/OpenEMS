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
            public static String APPRAISALS="Insert into Appraisals values(default,?,?,?,?)";
            public static String ATTENDANCE="Insert into Attendance values(default,?,?,?)";
            public static String EMPLOYEE="Insert into Employee values(default,?,?,?,?,default,?)";
            public static String ROLE="Insert into Role values(default,?,?)";
            public static String SALARY="Insert into Salary values(default,?,?,?,?,?)";
        }
        public static class Select{
            public static String GET_ROLE_ID_BY_NAME="Select RoleID from Role Where RoleName=?";
            public static String GET_ROLES="Select RoleID,RoleName from Role";
            public static String GET_SALARY_ID_BY_ROLE_ID="Select SalaryID from Salary Where RoleID=?";
            public static String GET_EMPLOYEE_BY_EMPLOYEE_ID="Select EmployeeName,Address,Date_of_Birth,NIC_No,Current_Status,RoleID from Employee where EmployeeID=?";
            public static String GET_EMPLOYEE_BY_NIC_NO="Select EmployeeID,EmployeeName,Address,Date_of_Birth,Current_Status,RoleID from Employee where NIC_No=?";
            public static String GET_ROLE_NAME_BY_ID="Select RoleName from Role Where RoleID=?";
            public static String GET_APPRAISAL_BY_EMPLOYEE_ID="Select Grading,Bonus,Reviews from Appraisals where EmpID=?";
            public static String GET_ROLE_ID_BY_EMPLOYEE_ID="Select RoleID from Employee where EmployeeID=?";
            public static String GET_BONUS_BY_EMPLOYEE_ID="Select Bonus from Appraisals where EmpID=?";
            public static String GET_SALARY_BY_ROLE_ID="Select BasicSalary,EPF,ETF,No_of_Leaves_for_no_pay from Salary where RoleID=?";
            public static String GET_ATTENDANCE_LIST="Select EmployeeID,EmployeeName from Employee where Current_Status='Working'";
            public static String GET_NO_OF_ABSENTS_FOR_EMPLOYEE="SELECT COUNT(*) AS COUNT FROM openems.attendance WHERE (Work_Date BETWEEN ? AND ?) AND EmpID = ? AND Presence='Absent'";
            public static String GET_NO_OF_HALFDAYS_FOR_EMPLOYEE="SELECT COUNT(*) AS COUNT FROM openems.attendance WHERE (Work_Date BETWEEN ? AND ?) AND EmpID = ? AND Presence='Half_Day'";
            public static String GET_EMPLOYEE_IDS="SELECT EmployeeID FROM Employee";
            public static String GET_EMPLOYEE_ID_BY_NIC="Select EmployeeID from Employee where NIC_No=?";
            public static String GET_WORK_DATE="Select EmpID from Attendance where Work_Date=?";
            public static String GET_APPRAISAL_ID_BY_EMPLOYEE_ID="Select AppraisalID from Appraisals where EmpID=?";
        }
        public static class Update{
            public static String EMPLOYEE="Update Employee Set EmployeeName=?,Address=?,Date_of_Birth=?,EmployeeID=?,Current_Status=?,RoleID=? Where NIC_No=?";
            public static String APPRAISAL="Update Appraisals Set Grading=?,Bonus=?,Reviews=? Where EmpID=?";
            public static String SALARY="Update Salary Set BasicSalary=?,EPF=?,ETF=?,No_of_Leaves_for_no_pay=? Where RoleID=?";
        }


    }
}
