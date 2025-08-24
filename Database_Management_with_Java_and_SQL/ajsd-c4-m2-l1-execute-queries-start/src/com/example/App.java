package com.example;

import org.mariadb.jdbc.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        /* TODO 18: Declare a variable newUser of type User and initialize it by calling the constructor and passing the values as arguments betty.george, betty.george@email.com, Betty, George, +11536549870, 15000. */
        User newUser = new User("betty.george", "betty.georg@email.com", "Betty", "George", "+11536549870", 15000);

        /* TODO 19: Declare a variable userDAO of type UserDAO, initialize it by calling the constructor. */
        UserDAO userDAO = new UserDAO();

        /* TODO 20: Call the addUser method using the userDAO and passing the newUser as argument. Store the result in rowsUpdated variable of int type. */
        /* TODO 21: Surround the addUser method call with try-catch block and handle the ClassNotFoundException and SQLException. */
        /* TODO 22: Inside the try block, Use if-else statement to check rowsUpdated variable for value equal to 1.  */
        /* TODO 23: Inside if block, display the message “New user added successfully”. */
        /* TODO 24: Inside else block, display the message “Cannot add user” */
        try {
            int rowsUpdated = userDAO.addUser(newUser);
            if (rowsUpdated == 1) {
                System.out.println("New user added successfully");
            } else {
                System.out.println("Cannot add user");
            }
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
