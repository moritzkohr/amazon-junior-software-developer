package com.example;

import org.mariadb.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {


    @SuppressWarnings("exports")
    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mariadb://localhost:3306/clicknbuy";
        String USER = "jdbc_coursera"; // Your MySQL username
        String PASSWORD = ""; // Your MySQL password
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }



}
