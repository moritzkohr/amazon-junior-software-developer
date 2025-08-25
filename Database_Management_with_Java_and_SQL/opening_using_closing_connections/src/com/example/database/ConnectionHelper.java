package com.example.database;

import org.mariadb.jdbc.*;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.SQLException;

public class ConnectionHelper {

    // an instance to the MysqlDataSource is already created, you only need to initialize its properties to connect to the MySQL database
    private MariaDbDataSource mysqlDatabase;

    public MariaDbDataSource getDataSource() {
        return this.mysqlDatabase;
    }

    // complete the connect() method to connect to the MySQL database
    public void connect(String databaseURL, String username, String password) throws SQLException {
        // TODO 2: initialize the mysqlDatbase field using the MySQLDataSource class's no-args constructor
        mysqlDatabase = new MariaDbDataSource();

        // TODO 3: set the URL for the MySQL database by calling the setURL() method on the mysqlDatabase field
        mysqlDatabase.setUrl(databaseURL);
        // TODO 4: set the username for database authentication by calling the setUser() method on the mysqlDatabase field
        mysqlDatabase.setUser(username);

        // TODO 5: set the password for database authentication by calling the setPassword() method on the mysqlDatabase field
        // The password should be 'password'
        mysqlDatabase.setPassword(password);

    }
}
