package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // create a pane
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        // create a text
        Text message1 = new Text(20, 20, "Welcome to programming");
        message1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 15));

        // create another text
        Text message2 = new Text(100, 100, "Sometimes it is\nnot fun");
        message2.setFill(Color.RED);
        message2.setUnderline(true);
        message2.setStrikethrough(true);

        // add the text to the pane
        pane.getChildren().add(message1);
        pane.getChildren().add(message2);

        // create a scene
        Scene scene = new Scene(pane);

        // set the properties of the stage
        stage.setTitle("Text Demo");

        // add the scene to the stage
        stage.setScene(scene);

        // show the stage
        stage.show();

    }
}
