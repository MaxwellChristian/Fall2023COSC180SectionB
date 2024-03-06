package gui;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ScrollBarDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("JAVAFX Programming");

        ScrollBar sbHorizontal = new ScrollBar();
        sbHorizontal.setOrientation(Orientation.HORIZONTAL);
        sbHorizontal.setMin(20);
        sbHorizontal.setMax(200);
        sbHorizontal.setUnitIncrement(10);
        sbHorizontal.setBlockIncrement(30);

        sbHorizontal.valueProperty().addListener(observable -> {
            System.out.println(sbHorizontal.getValue());

            if (label.getTranslateX() + label.getWidth() + sbHorizontal.getValue() < primaryStage.getWidth()) {
                label.setTranslateX(sbHorizontal.getValue());
            }


        });

        ScrollBar sbVertical = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);
        sbVertical.setMin(label.getFont().getSize());
        sbVertical.setMax(80);
        sbVertical.setUnitIncrement(5);
        sbVertical.setBlockIncrement(10);

        // sbVertical.setVisible(false);

        sbVertical.valueProperty().addListener(observable -> {
            label.setFont(Font.font(sbVertical.getValue()));
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(label);
        borderPane.setBottom(sbHorizontal);
        borderPane.setRight(sbVertical);

        Scene scene = new Scene(borderPane, 400, 200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
