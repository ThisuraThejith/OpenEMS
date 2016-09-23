/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.commons;

import java.io.File;
import java.util.Calendar;

/**
 *
 * @author THISURA THEJITH
 */
public class Constants {

    public static String USER = "root";
    public static String PASSWORD = "123456";
    public static String FILE_LOCATION = "F:" + File.separator + "SLIIT" + File.separator + "2nd year" + File.separator + "2nd sem" + File.separator + "itp" + File.separator + "Reports";
    public static String REPORT_LOCATION = FILE_LOCATION + File.separator + Calendar.getInstance().get(Calendar.YEAR) + File.separator + (Calendar.getInstance().get(Calendar.MONTH) + 1);
    public static int SALARYDATE = 20;
}
