module com.mylibrary.librarysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;


    opens com.mylibrary to javafx.fxml;
    exports com.mylibrary;
}