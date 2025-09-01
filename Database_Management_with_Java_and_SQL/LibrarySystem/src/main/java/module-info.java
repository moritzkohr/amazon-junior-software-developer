module com.mylibrary.librarysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mylibrary to javafx.fxml;
    exports com.mylibrary;
}