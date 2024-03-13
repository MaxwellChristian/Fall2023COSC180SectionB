package gui.animations;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DiceMove extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        ImageView imageView = new ImageView("file:images/dice/dice_5.png");
        pane.getChildren().add(imageView);

        PathTransition pathTransition = new PathTransition(Duration.millis(10000),
                new Line(100, 200, 100, 0),
                imageView);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.play();

        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setTitle("Dice Moving Animation");
        primaryStage.setScene(scene);

        scene.setOnMouseClicked(mouseEvent -> {

            switch (mouseEvent.getButton()) {
                case PRIMARY -> pathTransition.setRate(pathTransition.getRate()+0.5);
                case SECONDARY -> pathTransition.setRate(pathTransition.getRate() > 0 ? pathTransition.getRate()-0.5 : 0);
            }
        });

        primaryStage.show();

    }
}
