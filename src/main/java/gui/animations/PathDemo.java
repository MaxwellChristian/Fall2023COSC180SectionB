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

public class PathDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Rectangle rectangle = new Rectangle(0, 0, 25, 50);
        rectangle.setFill(Color.ORANGE);

        Circle circle = new Circle(125, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);

        PathTransition pt = new PathTransition();

        pt.setDuration(Duration.millis(2000));
        pt.setPath(circle);

        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

//        pt.setCycleCount(2);
        pt.setCycleCount(Timeline.INDEFINITE);

        pt.setAutoReverse(true);

        pt.play();

        circle.setOnMousePressed(mouseEvent -> pt.pause());
        circle.setOnMouseReleased(mouseEvent -> pt.play());

        Scene scene = new Scene(pane, 250, 200);
         primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
         primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show(); // Display the stage
    }
}
