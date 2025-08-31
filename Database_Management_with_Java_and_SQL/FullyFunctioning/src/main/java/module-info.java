module com.example.fullyfunctioning {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;
    requires transitive javafx.base;


    opens com.example to javafx.fxml;
    exports com.example;
}