package com.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BookStoreDBManager {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // establish the connection to MySQL
            conn = getDatabaseConnection();

            // create the database and the table
            createDatabase(conn);
            // create the books table inside the database
            createTable(conn);
            // add 'genre' column
            addGenreColumn(conn);
            // modify 'price' column precision
            modifyPricePrecision(conn);
            // add 'published_date' column
            addPublishedDateColumn(conn);
            // drop 'author' column
            dropAuthorColumn(conn);

        } catch (Exception e) {

        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Main method SQLException : "+e.getMessage());
            } catch(Exception e){
                System.err.println("Main method"+ e.getMessage());
            }
        }
    }

    // 1. Establishing Connection:
    private static Connection getDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "password";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
    // 2. Creating the Database:
    public static void createDatabase(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            // createDatabase method creates a new database called 'BookstoreDB' if it doesn’t already exist
            String sqlCreateDB = "CREATE DATABASE IF NOT EXISTS BookstoreDB";
            // executes the query to create the database
            stmt.executeUpdate(sqlCreateDB);
            System.out.println("Database 'BookstoreDB' created successfully.");
        } catch (SQLException sqlException) {
            System.out.println("createDatabase SQLException :"+sqlException.getMessage());
        } catch (Exception e) {
            System.out.println("createDatabase Exception :"+e.getMessage());
        }
    }

    // 3. Creating the Table:
    public static void createTable(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            // First, switch to the 'BookstoreDB' database
            stmt.executeUpdate("USE BookstoreDB");

            // Now, we create the 'books' table with the following columns:
            String sqlCreateTable = "CREATE TABLE IF NOT EXISTS books (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "title VARCHAR(100), " +
                    "author VARCHAR(100), " +
                    "price DECIMAL(10, 2))";

            stmt.executeUpdate(sqlCreateTable);  // This creates the 'books' table
            System.out.println("Table 'books' created successfully.");
        } catch (SQLException sqlException) {
            System.out.println("addGenreColumn SQLException :"+sqlException.getMessage());
        } catch (Exception e) {
            System.out.println(" addGenreColumn Exception :"+e.getMessage());
        }
    }

    // Task 1: Adding a New Column to Store Genre
    public static void addGenreColumn(Connection conn) {
        try {
            Statement stmt = conn.createStatement();

            /*TODO 1: write an SQL query to add a 'genre' column to the 'books' table */

            /*TODO 2: execute the SQL query using stmt.executeUpdate() to modify the table */

            /* TODO 3: print a success message once the column has been added */
        } catch (SQLException sqlException) {
            System.out.println("addGenreColumn SQLException :"+sqlException.getMessage());
        } catch (Exception e) {
            System.out.println(" addGenreColumn Exception :"+e.getMessage());
        }
    }

    // Task 2: Modifying the Precision of the Price Column
    public static void modifyPricePrecision(Connection conn) {
        try {
            Statement stmt = conn.createStatement();

            /* TODO 4: write an SQL query to modify the 'price' column precision to DECIMAL(8, 2) */

            /* TODO 5: execute the SQL query using stmt.executeUpdate() to modify the column structure */

            /* TODO 6:print a success message once the 'price' column has been modified */
        } catch (SQLException sqlException) {
            System.out.println("modifyPricePrecision SQLException :"+sqlException.getMessage());
        } catch (Exception e) {
            System.out.println("modifyPricePrecision Exception :"+e.getMessage());
        }
    }

    // Task 3: Adding a Published Date Column
    public static void addPublishedDateColumn(Connection conn) {
        try {
            Statement stmt = conn.createStatement();

            /* TODO 7: write the SQL query to add the 'published_date' column to the 'books' table */

            /* TODO 8: execute the SQL query using stmt.executeUpdate() to modify the table structure */
            System.out.println("Column 'published_date' added successfully.");

            /* TODO 9: insert a book data using stmt.executeUpdate() with the title, author, price, and published date */
            System.out.println("A book 'The Great Gatsby' added successfully.");

        } catch (SQLException sqlException) {
            System.err.println("addPublishedDateColumn SQLException: "+sqlException.getMessage());
        }catch (Exception e) {
            System.err.println("addPublishedDateColumn Exception: "+e.getMessage());
        }
    }


    // Task 4: Dropping the Author Column
    public static void dropAuthorColumn(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            /*TODO 10: write the SQL query to drop the 'author' column from the 'books' table */
            /*TODO 11: execute the SQL query using stmt.executeUpdate() to remove the column */
            /*TODO 12: print a confirmation message once the column has been dropped */
        } catch (SQLException sqlException) {
            System.err.println("SQLException :"+sqlException.getMessage());
        } catch (Exception e) {
            System.err.println("Exception :"+e.getMessage());
        }
    }
}