module com.example.displayingdata {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;


    opens com.example to javafx.fxml;
    exports com.example;
}