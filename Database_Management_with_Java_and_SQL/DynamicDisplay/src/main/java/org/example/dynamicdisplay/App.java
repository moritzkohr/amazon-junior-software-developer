package org.example.dynamicdisplay;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    private String[] trainDetails = { /*TODO 1 intialize 5 unique train names*/ "ICE 111", "ICE 222", "ICE 333", "ICE 444", "ICE 555"};
    private int currentIndex = 0; //TODO 2 To track which train is currently displayed


    @Override
    public void start(Stage primaryStage) {
        //TODO 4 Clear all the code from the start method
        //TODO 5 A Label will act as the notice board, displaying the next arriving train.
        //TODO 6 A VBox (Vertical Box) will stack the Label vertically within the window. You’ll want to add some vertical spacing between the components.
        //TODO 7 Create a Scene using the VBox layout and set it on the primary Stage.
        /* TODO 8: Use JavaFX’s Timeline or AnimationTimer to create a repeating task. This task will update the Label with the next train’s details every 5 seconds. */
        Label noticeBoard = new Label();
        noticeBoard.setText("Next train: " + trainDetails[currentIndex]);
        VBox layout = new VBox(noticeBoard);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), e -> {currentIndex = (currentIndex +1)%trainDetails.length; noticeBoard.setText("Next train: " + trainDetails[currentIndex]);}));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        /* TODO 9: In the repeating task, you’ll update the Label with the next train’s details from the array.
            After displaying the last train, cycle back to the first one.
        */


    }

    public static void main(String[] args) {
        /* TODO 10: call the launch method */
        launch(args);
    }
}
