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
            public static String EMPLOYEE="Insert into Employee values(default,?,?,?,?,?,?,?,?)";
            public static String ROLE="Insert into Role values(default,?,?)";
            public static String SALARY="Insert into Salary values(default,?,?,?,?,?)";
        }
        public static class Select{
            public static String GET_ROLE_ID_BY_NAME="Select RoleID from Role Where RoleName=?";
            public static String GET_ROLES="Select RoleID,RoleName from Role";
        }


    }
}
