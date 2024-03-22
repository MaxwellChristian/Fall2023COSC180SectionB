package gui;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridDemo extends Application {

    public static void main(String []args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // create label and associated text fields
        Label lblFirstName = new Label("Your first name: ");
        TextField tfFirstName = new TextField();

        Label lblMiddleName = new Label("Your middle name: ");
        TextField tfMiddleName = new TextField();

        Label lblLastName = new Label("Your last name: ");
        TextField tfLastName = new TextField();

        Button btnSave = new Button("Save");


        // create the grid pane to hold all controls
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5.0);
        gridPane.setVgap(5.0);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // add controls to grid pane

        // add to specific column followed by the row [column and row index starts at zero]
        gridPane.add(lblFirstName, 0, 0);
        gridPane.add(tfFirstName, 1, 0);

        gridPane.add(lblMiddleName, 0, 1);
        gridPane.add(tfMiddleName, 1, 1);

        gridPane.add(lblLastName, 0, 2);
        gridPane.add(tfLastName, 1, 2);

        gridPane.add(btnSave, 1, 3);
        GridPane.setHalignment(btnSave, HPos.RIGHT);

        // add the pane to the Scene
        Scene scene = new Scene(gridPane, 400, 200);

        // set the scene on the stage
        primaryStage.setScene(scene);

        // set the title of the stage
        primaryStage.setTitle("Grid Demo");

        // show the stage
        primaryStage.show();
    }
}
