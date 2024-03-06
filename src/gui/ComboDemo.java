package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboDemo extends Application {
    private ImageView imgDice;

    String[] imageUrls = {
            "file:images/dice/dice_1.png",
            "file:images/dice/dice_2.png",
            "file:images/dice/dice_3.png"
    };

    String[] diceNames = {"One", "Two", "Three"};

    @Override
    public void start(Stage primaryStage) throws Exception {


        imgDice = new ImageView();


        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(diceNames);

        // comboBox.setPromptText("Select a dice");

        comboBox.setValue(diceNames[1]);
        displayItem(1);

        comboBox.setOnAction(actionEvent -> displayItem(comboBox.getSelectionModel().getSelectedIndex()));
        comboBox.getSelectionModel().select(1);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(new Label("Select a dice: "));
        borderPane.setTop(comboBox);
        borderPane.setCenter(imgDice);

//        displayItem(0);

        Scene scene = new Scene( borderPane, 400, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public void displayItem(int index){
        imgDice.setImage(new Image(imageUrls[index]));
    }
}
