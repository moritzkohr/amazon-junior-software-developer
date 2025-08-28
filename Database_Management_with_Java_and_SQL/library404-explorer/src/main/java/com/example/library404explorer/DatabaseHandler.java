package com.example.library404explorer;

import org.mariadb.jdbc.*;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import javafx.collections.ObservableList;

public class DatabaseHandler {
    //    TODO 1: Inside the class, define the database URL in a private static final String variable named url.
//    TODO 2: Define the database username in a private static final String variable named username.
//    TODO 3:Define the database password in a private static final String variable named password.
    private final static String DB_URL = "jdbc:mariadb://localhost:3306/404booksnotfoundlibrary";
    private final static String USERNAME = "jdbc_coursera";
    private static final String PASSWORD = "";

    //    TODO 4: Define a public static method named getDatabaseConnection that returns a Connection object (import java.sql.Connection).
//    TODO 5: Use the DriverManager.getConnection method to establish a connection to the database (import java.sql.DriverManager).
//        Pass the url, username, and password variables as arguments to the getConnection method.
//        Add the return keyword to return the Connection object.
//    TODO 6: Add throws SQLException to the method signature to forward exceptions (import java.sql.SQLException).
    public static Connection getDatabaseConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }

    /*TODO 7: Define a public static method named fetchBooks that returns an ObservableList of Book objects (import javafx.collections.ObservableList).
    TODO 8: Define an ObservableList of Book objects named books and initialize it with FXCollections.observableArrayList() (import javafx.collections.FXCollections).
    TODO 9: Define a String variable named query and assign it the SQL query to select all columns from the book table.
    TODO 10: Call the getDatabaseConnection method and assign the returned Connection object to a variable named libraryConnection.
    TODO 11: Add throws SQLException to the method signature.
    TODO 12: Call the createStatement() method on the libraryConnection and assign the returned Statement object to a variable named queryStatement (import java.sql.Statement).
    TODO 13: Call the executeQuery() method on queryStatement, passing the query, and assign the returned ResultSet to a variable named booksResultSet (import java.sql.ResultSet).
    TODO 14: Use a while loop to iterate through the booksResultSet.
    TODO 15: Store the value of the id column in the resultSet in an int variable named id
    TODO 16-19: Retrieve and store the values for title, author, publicationYear, and genre columns from the resultSet.
    TODO 20: Create a new Book object with the id, title, author, publicationYear, and genre variables as arguments
    TODO 21-22: Add the book object to the books list and return it.*/

    public static ObservableList<Book> fetchBooks() throws SQLException {
        ObservableList<Book> books = javafx.collections.FXCollections.observableArrayList();
        String query = "SELECT * FROM book";
        Connection libraryConnection = getDatabaseConnection();
        Statement queryStatement = libraryConnection.createStatement();
        ResultSet booksResultSet = queryStatement.executeQuery(query);
        while (booksResultSet.next()) {
            int id = booksResultSet.getInt("id");
            String title = booksResultSet.getString("title");
            String author = booksResultSet.getString("author");
            int publicationYear = booksResultSet.getInt("publication_year");
            String genre = booksResultSet.getString("genre");
            Book book = new Book(id, title, author, publicationYear, genre);
            books.add(book);
        }
        return books;
    }
}
