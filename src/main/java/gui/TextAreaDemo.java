package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // create controls

        ImageView imageView = new ImageView(new Image("file:images/dice/dice_5.png"));

        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(5);
        textArea.setPrefColumnCount(30);
        textArea.setWrapText(true);
        textArea.setText("welcome to the display of text area");

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(imageView, textArea);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox);

        // arrange the controls in a container (pane)
        BorderPane borderPane = new BorderPane();
//        borderPane.setCenter(textArea);
//        borderPane.setRight(vBox);
        borderPane.setRight(scrollPane);

        // create the scene
        Scene scene = new Scene(borderPane, 400, 200);

        // set the scene on the stage
        stage.setScene(scene);

        // set the properties of the stage
        stage.setTitle("Text Area Demo");

        // show the stage
        stage.show();

    }
}
