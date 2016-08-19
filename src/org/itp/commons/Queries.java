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
            public static String APPRAISALS="Insert into Appraisals values(default,?,?,?,?,?)";
            public static String ATTENDANCE="Insert into Attendance values(default,?,?,?,?)";
            public static String EMPLOYEE="Insert into Employee values(default,?,?,?,?,default,?,?)";
            public static String ROLE="Insert into Role values(default,?,?)";
            public static String SALARY="Insert into Salary values(default,?,?,?,?,?)";
        }
        public static class Select{
            public static String GET_ROLE_ID_BY_NAME="Select RoleID from Role Where RoleName=?";
            public static String GET_ROLES="Select RoleID,RoleName from Role";
            public static String GET_SALARY_ID_BY_ROLE_ID="Select SalaryID from Salary Where RoleID=?";
            public static String GET_EMPLOYEE_BY_EMPLOYEE_ID="Select EmployeeName,Address,Date_of_Birth,NIC_No,Current_Status,RoleID from Employee where EmployeeID=?";
            public static String GET_ROLE_NAME_BY_ID="Select RoleName from Role Where RoleID=?";
        }


    }
}
