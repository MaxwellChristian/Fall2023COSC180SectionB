package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class LabelDemo2 extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // create the controls to use
        Circle circle = new Circle(20, 20, 50);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.YELLOW);

        Label label = new Label("JAVAFX Demos");

        // arrange the controls in a pane
        Pane pane = new StackPane();
        pane.getChildren().add(circle);
        pane.getChildren().add(label);

        // add the pane to scene
        Scene scene = new Scene(pane);

        // add the scene to the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("Text over Circle");

        // show the stage
        stage.show();
    }
}
