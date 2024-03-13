package gui.animations;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeShape extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.setFill(Color.BLACK);
        circle.setStroke(Color.YELLOW);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.radiusProperty().bind((pane.widthProperty().doubleValue() < pane.heightProperty().doubleValue()) ? pane.widthProperty().multiply(0.2) : pane.heightProperty().multiply(0.2));

        pane.getChildren().add(circle);

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(5000), circle);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.1);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        circle.setOnMousePressed(mouseEvent -> fadeTransition.pause());
        circle.setOnMouseReleased(mouseEvent -> fadeTransition.play());

        Scene scene = new Scene(pane, 200, 150);
        primaryStage.setTitle("Fade Demo");
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
