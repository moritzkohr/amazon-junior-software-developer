module org.example.dynamicdisplay {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.dynamicdisplay to javafx.fxml;
    exports org.example.dynamicdisplay;
}