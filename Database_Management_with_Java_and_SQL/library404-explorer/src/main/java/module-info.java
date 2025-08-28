module org.example.library404explorer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;


    opens com.example.library404explorer to javafx.fxml;
    exports com.example.library404explorer;
}