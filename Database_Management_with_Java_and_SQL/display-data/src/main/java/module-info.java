module org.example.displaydata {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example to javafx.fxml;
    exports com.example;
}