package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonDemo2 extends Application {

    public static void main(String... args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        // create controls to use
        Button btnRight = new Button("Move Right");
        Button btnLeft = new Button("Move Left");

        Label lblMessage = new Label("This text moves");

        // event handling section
        btnRight.setOnAction(actionEvent ->
                lblMessage.setTranslateX(lblMessage.getTranslateX() + 5)
        );
        btnLeft.setOnAction(actionEvent -> moveLeft(lblMessage, 10));

        // arrange the controls (in a pane)
        Pane pane = new HBox();
        pane.getChildren().addAll(btnLeft, btnRight, lblMessage);

        // add the pane to a scene
        Scene scene = new Scene(pane);

        // add the scene to stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("Button Demo");

        // show the stage
        stage.show();

    }

    private void moveLeft(Label lbl, int pos) {
        lbl.setTranslateX(lbl.getTranslateX() - pos);
    }
}
