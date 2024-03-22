package gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextControls2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // create the controls to use
        Label lblPrompt = new Label("Enter you message: ");
        TextField tfMessage = new TextField();

        // event handling
        tfMessage.setOnAction(actionEvent -> lblPrompt.setText(tfMessage.getText()));

        // put in an appropriate container (pane)
        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);

        hBox.getChildren().addAll(lblPrompt, tfMessage);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);

        // create a scene with the pane
        Scene scene = new Scene(borderPane, 400, 200);

        // set the scene on the stage
        stage.setScene(scene);

        // display the stage
            // set the properties of the stage
        stage.setTitle("Text Controls");
            // show the stage
        stage.show();

    }
}
