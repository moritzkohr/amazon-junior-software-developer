package com.example;

import org.mariadb.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    /**TODO 12: Declare URL, USER and PASSWORD variables.
     Define a static method getConnection() that returns MySQL Connection object.**/
    private static final String URL = "jdbc:mariadb://localhost:3306/mynewdatabase";
    private static final String USER = "jdbc_coursera"; // Your MySQL username
    private static final String PASSWORD = ""; // Your MySQL password


    @SuppressWarnings("exports")
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
