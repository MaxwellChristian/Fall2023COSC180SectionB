package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ControlsDemo extends Application {
    private Label lblMessage;

    @Override
    public void start(Stage stage) throws Exception {

        // set up the scene
        Scene scene = setupControlsScene();

        // set up the stage
        stage.setScene(scene);

        // show the stage
        stage.setTitle("Controls Demo Again");
        stage.show();

    }

    private Scene setupControlsScene() {

        BorderPane pane = (BorderPane) setupControls();

        Scene scene = new Scene(pane, 400, 200);

        return scene;
    }

    private Pane setupControls() {

        BorderPane pane = new BorderPane();

        pane.setTop(setTopOfPane());
        pane.setBottom(setBottomOfPane());
        pane.setLeft(setLeftOfPane());
        pane.setRight(setRightOfPane());

        this.lblMessage = new Label("Your message goes here");
        pane.setCenter(lblMessage);


        return pane;
    }

    private Node setRightOfPane() {
        CheckBox cbBold = new CheckBox("Bold");
        CheckBox cbItalic = new CheckBox("Italic");

        VBox boxFontStyle = new VBox(10);
        boxFontStyle.getChildren().addAll(cbBold, cbItalic);

        // handle font style selection
        EventHandler<ActionEvent> actionHandler = actionEvent -> {
            if (cbBold.isSelected() && cbItalic.isSelected()) {
                // set font to both bold and italics
                setFontStyle(lblMessage, FontWeight.BOLD, FontPosture.ITALIC);
            } else {
                if (cbBold.isSelected()) {
                    // set the font to bold
                    setFontStyle(lblMessage, FontWeight.BOLD, FontPosture.REGULAR);
                } else {
                    if (cbItalic.isSelected()) {
                        // set the font to italics
                        setFontStyle(lblMessage, FontWeight.NORMAL, FontPosture.ITALIC);
                    } else {
                        // set the font to normal
                        setFontStyle(lblMessage, FontWeight.NORMAL, FontPosture.REGULAR);
                    }
                }
            }
        };
        cbBold.setOnAction(actionHandler);
        cbItalic.setOnAction(actionHandler);

        return boxFontStyle;
    }

    private void setFontStyle(Label lblMessage, FontWeight fontWeight, FontPosture fontPosture) {
        lblMessage.setFont(Font.font(lblMessage.getFont().getName(), fontWeight, fontPosture, lblMessage.getFont().getSize()));
    }

    private Node setLeftOfPane() {
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");

        ToggleGroup grpColors = new ToggleGroup();
        rbRed.setToggleGroup(grpColors);
        rbGreen.setToggleGroup(grpColors);
        rbBlue.setToggleGroup(grpColors);

        VBox boxColors = new VBox(10);
        boxColors.getChildren().addAll(rbRed, rbGreen, rbBlue);

        // handle color selection
        rbRed.setOnAction(actionEvent -> lblMessage.setTextFill(Color.RED));
        rbGreen.setOnAction(actionEvent -> lblMessage.setTextFill(Color.GREEN));
        rbBlue.setOnAction(actionEvent -> lblMessage.setTextFill(Color.BLUE));

        return boxColors;
    }

    private Node setBottomOfPane() {

        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        btnLeft.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() - 10));
        btnRight.setOnAction(actionEvent -> lblMessage.setTranslateX(lblMessage.getTranslateX() + 10));

        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);

        hBox.getChildren().addAll(btnLeft, btnRight);

        return hBox;
    }

    private Node setTopOfPane() {

// create the controls to use
        Label lblPrompt = new Label("Enter you message: ");
        TextField tfMessage = new TextField();

        // event handling
        tfMessage.setOnAction(actionEvent -> this.lblMessage.setText(tfMessage.getText()));

        // put in an appropriate container (pane)
        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);

        hBox.getChildren().addAll(lblPrompt, tfMessage);

        return hBox;
    }
}
