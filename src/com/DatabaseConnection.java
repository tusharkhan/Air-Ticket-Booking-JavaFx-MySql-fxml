/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class for Database Connection
 * @author optima s
 */
public class DatabaseConnection 
{
    private static final  String DB_USER    = "root";
    private static final String DB_PASS    = "root";
    private static final String DB_CONNECT = "jdbc:mysql://localhost/test";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(DB_CONNECT, DB_USER, DB_PASS);
    }
}
