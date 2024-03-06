package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorMixer extends Application {

    Rectangle rectangle;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(rectangle = getRectangle());
        borderPane.setBottom(getColorSliders());

        Scene scene = new Scene(borderPane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Color Mixer");

        primaryStage.show();

    }

    private Rectangle getRectangle() {

        rectangle = new Rectangle();

        rectangle.setWidth(100);
        rectangle.setHeight(50);

        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);

        return rectangle;
    }

    private Pane getColorSliders() {

        Slider slRed = new Slider();
        slRed.setMin(0);
        slRed.setMax(255);

        Slider slGreen = new Slider();
        slRed.setMin(0);
        slGreen.setMax(255);

        Slider slBlue = new Slider();
        slRed.setMin(0);
        slBlue.setMax(255);

        slRed.valueProperty().addListener(observable ->
                rectangle.setFill(Color.color(slRed.getValue() / 255, slGreen.getValue() / 255, slBlue.getValue() / 255))
        );
        slGreen.valueProperty().addListener(observable -> rectangle.setFill(Color.color(slRed.getValue() / 255, slGreen.getValue() / 255, slBlue.getValue() / 255)));
        slBlue.valueProperty().addListener(observable -> rectangle.setFill(Color.color(slRed.getValue() / 255, slGreen.getValue() / 255, slBlue.getValue() / 255)));

        GridPane gridPane = new GridPane(5, 5);

        // add the red slider
        gridPane.add(new Label("R: "), 0, 0);
        gridPane.add(slRed, 1, 0);

        // add the green slider
        gridPane.add(new Label("G: "), 0, 1);
        gridPane.add(slGreen, 1, 1);

        // add the blue slider
        gridPane.add(new Label("B: "), 0, 2);
        gridPane.add(slBlue, 1, 2);

        GridPane.setFillWidth(slRed, true);

        return gridPane;
    }
}
