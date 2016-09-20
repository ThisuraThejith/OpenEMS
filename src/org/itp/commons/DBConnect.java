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
    private String user = null;
    private String password = null;
    private final long INSERTION_FAILED_ID = -1;

    public DBConnect(String user, String password) throws SQLException {
        this.user = user;
        this.password = password;
        this.setConnection();
    }

    private void setConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cleanmaster?zeroDateTimeBehavior=convertToNull" + "&user=" + this.user + "&password=" + this.password);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() throws SQLException {

        if (this.connection.isClosed()) {
            this.setConnection();
        }

        return this.connection;
    }
}