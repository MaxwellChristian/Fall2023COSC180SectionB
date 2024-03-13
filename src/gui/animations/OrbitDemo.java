package gui.animations;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class OrbitDemo extends Application {

    boolean isAnimationPlaying = true;

    @Override
    public void start(Stage primaryStage) throws Exception {


        Circle circleSatellite = new Circle();
        circleSatellite.setRadius(25);
        circleSatellite.setFill(Color.BLACK);
        circleSatellite.setStroke(Color.YELLOW);

        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(circleSatellite);

        PathTransition pt = new PathTransition();

        pt.setDuration(Duration.millis(2000));
        pt.setPath(circle);

        pt.setNode(circleSatellite);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

//        pt.setCycleCount(2);
        pt.setCycleCount(Timeline.INDEFINITE);

//        pt.setAutoReverse(true);

        pt.play();

        circle.setOnMouseClicked(mouseEvent -> {
            switch (mouseEvent.getButton()) {
                case PRIMARY:
                    if( isAnimationPlaying ){
                        pt.pause();
                        isAnimationPlaying = false;
                    }
                    else {
                        pt.play();
                        isAnimationPlaying = true;
                    }
                    break;

                case SECONDARY:
                    circleSatellite.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    break;
            }
        });

        Scene scene = new Scene(pane, 400, 400);
         primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
    }
}
