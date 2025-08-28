module org.example.library404explorer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.library404explorer to javafx.fxml;
    exports com.example.library404explorer;
}