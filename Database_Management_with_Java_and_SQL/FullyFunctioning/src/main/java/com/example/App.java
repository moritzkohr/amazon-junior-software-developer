package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainscene.fxml"));
        Parent root = loader.load();
        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args)  {
        try {
            /*TODO 1: Open App.java code.
            Call Database.getConnection() method in main() method, before calling launch().
            Make sure to put this call inside the try block and handle the SQLException*/
            Database.getConnection();
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("not connected");
            e.printStackTrace();
        }

        launch();
    }

}