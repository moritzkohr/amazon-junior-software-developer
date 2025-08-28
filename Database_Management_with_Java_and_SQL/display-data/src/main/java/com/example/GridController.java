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

public class GridController {
    /*TODO 29: Paste the @FXML annotations from gridscene.fxml */

    private List<String[]> personData;  // List to store fetched records
    private int currentIndex = 0;

    /** TODO 30: Copy the code of fetchPersonData(), displayRecord(), initialize() and
     nextRecord() methods from VBoxController.java**/

    @FXML
    void prevRecord(ActionEvent event) {

    }

    @FXML
    void switchVScene(ActionEvent event) throws IOException{
        /*TODO 31: set the vboxscene.fxml as the root of application window*/

    }

}
