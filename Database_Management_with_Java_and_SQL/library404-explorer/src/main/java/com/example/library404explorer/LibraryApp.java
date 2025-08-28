package com.example.library404explorer;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class LibraryApp extends Application {

    private static Scene libraryScene;

    @Override
    public void start(Stage libraryStage) {

        Label messageLabel = new Label();
        messageLabel.setTextFill(Color.RED);
        messageLabel.setFont(new Font(18));

        // TODO23: Define a TableView of Book objects named libraryTable and instantiate it

        // TODO24: Create a TableColumn for each field in the Book class

        // TODO25: Associate each TableColumn with the corresponding field in the Book class
        // a. Use setCellValueFactory() and PropertyValueFactory objects

        // TODO26: Add the columns individually to the TableView using the getColumns() and add() methods

        // TODO27: Create a Button named locateBooksButton with the label "Locate 404 Books"

        try {

            // Call the fetchBooks method from the DatabaseHandler class and assign the returned ObservableList to a variable named books
            ObservableList<Book> books = DatabaseHandler.fetchBooks();

            // TODO28: Create an EventHandler of type ActionEvent to handle the button click event
            EventHandler<ActionEvent> locateBooksButtonHandler = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // TODO29: Set the items of the libraryTable to the books observable list using the setItems() method

                }
            };

            // Check if the books list is not empty
            if (!books.isEmpty()) {
                // messageLabel displaying "Books found in the database"
                messageLabel.setText("Books found in the database");

                // TODO30: Add the locateBooksButtonHandler to the locateBooksButton using the setOnAction() method

            }
            else {
                // messageLabel displaying "No books found in the database"
                messageLabel.setText("No books found in the database");
            }
        }
        catch (SQLException exception) {
            // messageLabel displaying "An error occurred while fetching books" with the exception message
            messageLabel.setText("An error occurred while fetching books: " + exception.getMessage());
        }


        // VBox layout
        // TODO31: Add the locateBooksButton and libraryTable to the verticalBox after the messageLabel
        VBox verticalBox = new VBox(10, messageLabel); // 10px spacing between elements

        // Set up the scene and stage
        libraryScene = new Scene(verticalBox, 800, 600);
        libraryStage.setScene(libraryScene);
        libraryStage.setTitle("404 Library Explorer");
        libraryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}