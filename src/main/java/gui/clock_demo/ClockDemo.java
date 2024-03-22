package gui.clock_demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClockDemo extends Application {

    Label lblCurrentTime = new Label("");

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Create a clock and a label
        ClockPane clock = new ClockPane();

        String timeString = clock.getHour() + ":" + clock.getMinutes()
                + ":" + clock.getSeconds();
        lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("DisplayClock"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        Thread th1 = new Thread(() -> {
            while (true) {

                Platform.runLater(() -> {
                    lblCurrentTime.setText(clock.getCurrentTime());
                    clock.layoutChildren();
                });

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th1.setDaemon(true);
        th1.start();

    }
}
