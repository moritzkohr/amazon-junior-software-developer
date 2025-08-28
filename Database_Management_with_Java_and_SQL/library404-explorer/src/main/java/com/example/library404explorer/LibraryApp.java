package com.example.library404explorer;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
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

        // TODO 23: Define a TableView of Book objects named libraryTable and instantiate it
        TableView<Book> libraryTable = new TableView<>();

        // TODO 24: Create a TableColumn for each field in the Book class
        TableColumn<Book, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Book, String> titleColumn = new TableColumn<>("Title");
        TableColumn<Book, String> authorColumn = new TableColumn<>("Author");
        TableColumn<Book, Integer> publicationYearColumn = new TableColumn<>("Publication Year");
        TableColumn<Book, String> genreColumn = new TableColumn<>("Genre");

        // TODO 25: Associate each TableColumn with the corresponding field in the Book class
        // a. Use setCellValueFactory() and PropertyValueFactory objects
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        publicationYearColumn.setCellValueFactory(new PropertyValueFactory<>("publicationYear"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));

        // TODO 26: Add the columns individually to the TableView using the getColumns() and add() methods
        libraryTable.getColumns().addAll(idColumn);
        libraryTable.getColumns().addAll(titleColumn);
        libraryTable.getColumns().addAll(authorColumn);
        libraryTable.getColumns().addAll(publicationYearColumn);
        libraryTable.getColumns().addAll(genreColumn);

        // TODO 27: Create a Button named locateBooksButton with the label "Locate 404 Books"
        Button locateBooksButton = new Button("Locate 404 Books");

        try {

            // Call the fetchBooks method from the DatabaseHandler class and assign the returned ObservableList to a variable named books
            ObservableList<Book> books = DatabaseHandler.fetchBooks();

            // TODO 28: Create an EventHandler of type ActionEvent to handle the button click event ANNOTATION: why is this a TODO when it's already given?
            EventHandler<ActionEvent> locateBooksButtonHandler = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // TODO 29: Set the items of the libraryTable to the books observable list using the setItems() method
                    libraryTable.setItems(books);
                }
            };

            // Check if the books list is not empty
            if (!books.isEmpty()) {
                // messageLabel displaying "Books found in the database"
                messageLabel.setText("Books found in the database");

                // TODO 30: Add the locateBooksButtonHandler to the locateBooksButton using the setOnAction() method
                locateBooksButton.setOnAction(locateBooksButtonHandler);

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
        // TODO 31: Add the locateBooksButton and libraryTable to the verticalBox after the messageLabel
        VBox verticalBox = new VBox(10, messageLabel, locateBooksButton, libraryTable); // 10px spacing between elements

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