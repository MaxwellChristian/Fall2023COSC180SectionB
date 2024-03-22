package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipses extends Application {

//    public static void main(String... args) {
//        Application.launch(args);
//    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // create a scene with custom pane
        EllipsePane ellipsePane = new EllipsePane();
        Scene scene = new Scene(ellipsePane, 300, 200);

        // add the scene to the stage
        primaryStage.setScene(scene);

        // set the title of the stage
        primaryStage.setTitle("Ellipse Demo");

        //
        primaryStage.widthProperty().addListener((observableValue, oldValue, newValue) -> System.out.println("Width : " + newValue) );
        primaryStage.heightProperty().addListener((observableValue, oldValue, newValue) -> System.out.println("Height : " + newValue) );

        // show the stage
        primaryStage.show();

        System.out.println("Width: " + primaryStage.getWidth());
        System.out.println("Height: " + primaryStage.getHeight());
    }
}

class EllipsePane extends Pane {

    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        getChildren().clear();
        for (int index = 0; index < 16; index++) {
            Ellipse ellipse = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 4, getHeight() / 4);
            ellipse.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            ellipse.setFill(Color.WHITE);
            ellipse.setRotate(index * 180/16);

            getChildren().add(ellipse);
        }
    }

    public EllipsePane() {

    }

    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setHeight(double height) {
        super.setHeight(height);
    }

}
