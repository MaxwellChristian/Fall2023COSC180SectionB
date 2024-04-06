package _2024_sim_2;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class DiceGame extends Application {

    private static final int TOTAL_DICE_IMAGES = 6;
    private static final int TOTAL_DICE_IMAGES_TO_SHOW = 3;
    private static ImageView[] imageViewDice;
    private Label[] lblNumbers;
    private int equalNumberCounter = 0;

    @Override
    public void start(Stage stage) throws Exception {

        // set up the main game container
        BorderPane paneGameContainer = new BorderPane();

        paneGameContainer.setTop(paneForRandomNumbers());
        paneGameContainer.setBottom(paneForButtons());
        paneGameContainer.setCenter(paneForDice());

        stage.setScene(new Scene(paneGameContainer, 500, 300));
        stage.setTitle("Dice Game");
        stage.show();
    }

    private Pane paneForRandomNumbers() {

        HBox obBox = new HBox();
        obBox.setSpacing(15);
        obBox.setPadding(new Insets(20, 20, 20, 20));
        obBox.setAlignment(Pos.CENTER);

        lblNumbers = new Label[TOTAL_DICE_IMAGES_TO_SHOW];
        for (int i = 0; i < TOTAL_DICE_IMAGES_TO_SHOW; i++) {
            lblNumbers[i] = new Label();
        }
        obBox.getChildren().addAll(lblNumbers);

        return obBox;
    }


    private Pane paneForDice() {

        HBox obBox = new HBox();
        obBox.setSpacing(15);
        obBox.setPadding(new Insets(20, 20, 20, 20));
        obBox.setAlignment(Pos.CENTER);

        imageViewDice = new ImageView[TOTAL_DICE_IMAGES_TO_SHOW];
        for (int i = 0; i < TOTAL_DICE_IMAGES_TO_SHOW; i++) {

            imageViewDice[i] = new ImageView();
            imageViewDice[i].setFitHeight(50);
            imageViewDice[i].setFitWidth(50);

            obBox.getChildren().add(imageViewDice[i]);
        }

        return obBox;
    }

    public Pane paneForButtons() {

        HBox obBox = new HBox();
        obBox.setSpacing(15);
        obBox.setPadding(new Insets(20, 20, 20, 20));
        obBox.setAlignment(Pos.CENTER);

        Button obStart = new Button("Start");
        Button obAnimate = new Button("Animate");

        obBox.getChildren().add(obStart);
        obBox.getChildren().add(obAnimate);

        obStart.setOnAction(e -> showRandomNumbers());
        obAnimate.setOnAction(e -> rollDiceAnimation());

        return obBox;
    }

    private void rollDiceAnimation() {

        // Calculate the delay between each image change
        double totalDuration = 3000.0;
        double delay = totalDuration / (TOTAL_DICE_IMAGES * 2); // Total duration / number of images

        Random random = new Random();
        for (int i = 0; i < 3; i++) {

            int index = i;
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, e -> imageViewDice[index].setImage(new Image("file:images/dice/dice_" + random.nextInt(1, TOTAL_DICE_IMAGES + 1) + ".png"))),
                    new KeyFrame(Duration.millis(delay))
            );

            // Add an event handler to the timeline to check for completion
            timeline.setOnFinished(e -> showNumberImages());

            timeline.setCycleCount(TOTAL_DICE_IMAGES); // Repeat cycle for all images
            timeline.play();
        }

    }

    private void showNumberImages() {

        for (int i = 0; i < TOTAL_DICE_IMAGES_TO_SHOW; i++) {
            imageViewDice[i].setImage(new Image("file:images/dice/dice_" + lblNumbers[i].getText() + ".png"));
        }

    }

    private void showRandomNumbers() {

        Random random = new Random();

        int[] randomNumbers = new int[3];
        boolean allNumbersSame = false;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1, 7);
            if (i > 0) {
                allNumbersSame = randomNumbers[i] == randomNumbers[i - 1];
            }
        }

        if (allNumbersSame) {
            equalNumberCounter++;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            lblNumbers[i].setText("" + randomNumbers[i]);
        }

        // exitGame();

        if (equalNumberCounter == 3) {
            // exit the game
            exitGame();
        }

    }

    private void exitGame() {

        // display the alert with the message "Bye"
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Exit (Equal numbers)");
        alert.setHeaderText("Exit");
        alert.setContentText("Bye");

        alert.showAndWait();

        // exit the game
        System.exit(0);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
