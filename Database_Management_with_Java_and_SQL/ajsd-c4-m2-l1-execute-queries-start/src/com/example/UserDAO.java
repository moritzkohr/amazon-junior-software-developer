package com.example;

import org.mariadb.jdbc.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    /* TODO 7: Define the database URL in a private static final String variable named ‘URL’. Intitialize it with the database url */
    private static final String URL = "jdbc:mariadb://localhost:3306/clicknbuy";
    /* TODO 8: Define the database username in a private static final String variable named ‘USERNAME’. Initialize it with the user name ‘root’ for database connection */
    /* TODO 9: Define the database password in a private static final String variable named ‘PASSWORD’. Initialize it with the password ‘password’ for database connection */
    private static final String USERNAME = "moritz";
    private static final String PASSWORD = "";

    /* TODO 10: Define the public addUser method, which returns an integer, and accepts one parameter User newUser */
    public int addUser(User newUser) throws ClassNotFoundException, SQLException {
        /* TODO 11: Declare a variable Connection clickNBuyConnection and initialize it by calling the getDbConnection method of the DatabaseUtility class and passing url, userName, and password (import java.sql.Connection) */
        Connection clickNBuyConnection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        /* TODO 12: Add ‘throws ClassNotFoundException and SQLException’ to the method signature to forward the exception to the calling method (import java.sql.SQLException). */
        /* TODO 13: Declare a variable sqlQuery of type String and initialize it, with the parameterized insert query. */
        String sqlQuery = "INSERT INTO clicknbuy.user (user_name, user_email, first_name, last_name, phone_number, reward_points) VALUES (?,?,?,?,?,?)";
        /* TODO 14: Declare a variable insertPreparedStatement of type PreparedStatement and initialize it by calling the method prepareStatement using the clickNBuyConnection reference and pass the sqlQuery (import java.sql.PreparedStatement) */
        /* TODO 15: Use the insertPreparedStatement to set all the parameters of sqlQuery, by using the corresponding set methods of PareparedStatement and set the values using the newUser parameter. */
        PreparedStatement insertPreparedStatement = clickNBuyConnection.prepareStatement(sqlQuery);
        insertPreparedStatement.setString(1, newUser.getUserName());
        insertPreparedStatement.setString(2, newUser.getUserEmail());
        insertPreparedStatement.setString(3, newUser.getFirstName());
        insertPreparedStatement.setString(4, newUser.getLastName());
        insertPreparedStatement.setString(5, newUser.getPhoneNumber());
        insertPreparedStatement.setInt(6, newUser.getRewardPoints());
        /* TODO 16: Declare a variable int rowsUpdated and intialize it by calling executeUpdate method using the insertPreparedStatement. */
        /* TODO 17: Return the rowsUpdated variable. */
        int rowsUpdated = insertPreparedStatement.executeUpdate();
        return rowsUpdated;
    }
}