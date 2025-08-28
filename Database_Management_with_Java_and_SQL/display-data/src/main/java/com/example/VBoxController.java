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

public class VBoxController {
    /*TODO 9: and paste the @FXML annotations copied in the previous step. Save the file.*/

/*TODO 14: Open VBoxController.java code.
Declare personData List object, to collect person records,
and an int variable currentIndex to store current record number. Set its initial value to 0*/

    /* TODO 21: define initialize() method that is called automatically.*/
    @FXML
    public void initialize() {
        /*TODO 22: call the fetchPersonData() method first*/
        personData = fetchPersonData();  // Fetch data from the database
        if (!personData.isEmpty()) {
/*TODO 23: call the displayRecord() to show the
contents of person at currentIndex on the application window*/
        }
    }


    /* TODO 15: Define fetchPersonData() method to read all records in person table in an ArrayList */

    private List<String[]> fetchPersonData() {
        List<String[]> data = new ArrayList<>();

/*TODO 16: Construct a SQL query string SQL Query
to select name, city, zipcode from person*/

        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Iterate through the result set and store each record
            while (resultSet.next()) {
/*TODO 17: store name, city and zipcode in string variables
with resultSet.getString() method*/
                data.add(new String[]{name, city, zipcode});
            }

        } catch (Exception e) {
            e.printStackTrace();  // Handle exception (log or show error message)
        }

        return data;
    }

    /*TODO 18: In VBoxController.java define displayRecord() method*/

    private void displayRecord(int index) {
    /*TODO 19: fetch information of person at current index
    from personData arraylist. Set nameLabel to the name field*/
        nameLabel.setText("Name: " + person[0]);
        /*TODO 20: similarly set cityLabel and zipcodeLabel*/
    }


    @FXML
    void nextRecord(ActionEvent event) {
        if (currentIndex < personData.size() - 1) {
/*TODO 24: Inside this method, increment currentIndex
and call displayRecord() method.*/
        }
    }

    @FXML
    void prevRecord(ActionEvent event) {
        System.out.println("hello");
    }

    @FXML
    void switchHScene(ActionEvent event) throws IOException{
        /*TODO 25: set the hboxscene.fxml as the root of application window*/

    }

}
