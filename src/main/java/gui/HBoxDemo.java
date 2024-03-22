package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class HBoxDemo extends Application {

    public static void main(String ... args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        // set up the controls to use
        ImageView imgDice1 = new ImageView(new Image("file:images/dice/dice_1.png"));

        // label with an image
        Label lblDice1 = new Label("Dice 1", imgDice1);
        lblDice1.setStyle("-fx-border-color: geeen; -fx-border-width: 2;");
        lblDice1.setContentDisplay(ContentDisplay.BOTTOM);
        lblDice1.setTextFill(Color.BLUE);

        // label with a shape (circle)
        Label lblCircle = new Label("Circle", new Circle(50, 50, 25));
        lblCircle.setContentDisplay(ContentDisplay.TOP);
        lblCircle.setTextFill(Color.RED);

        // label over a shape (ellipse)
        Ellipse ellipse = new Ellipse(50, 50, 50, 25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.WHITE);
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(ellipse, new Label("JAVAFX"));
        Label lblPaneInsideLabel = new Label("Pane inside label", stackPane);
        lblPaneInsideLabel.setContentDisplay(ContentDisplay.LEFT);

        // add all controls to a HBox
        HBox pane = new HBox(20);
        pane.getChildren().addAll(lblDice1, lblCircle, lblPaneInsideLabel);

        // add the pane to the scene
        Scene scene = new Scene(pane, 450, 150);

        // add the scene to the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("HBox Demo");

        // show the stage
        stage.show();
    }
}
