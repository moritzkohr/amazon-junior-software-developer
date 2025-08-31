package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HBoxController {
    /*TODO 26: Paste the @FXML annotations from hboxscene.fxml */

    private List<String[]> personData;  // List to store fetched records
    private int currentIndex = 0;

    /*TODO 27: Copy the code of fetchPersonData(), displayRecord(), initialize() and nextRecord() methods
    from VBoxController.java code to HBoxController.java file*/




    @FXML
    void prevRecord(ActionEvent event) {

    }


    @FXML
    void switchGridScene(ActionEvent event) throws IOException {
        /*TODO 28: set the gridscene.fxml as the root of application window*/

    }

}
