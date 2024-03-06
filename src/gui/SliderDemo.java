package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SliderDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // create the controls
        Slider slider1 = new Slider();
        slider1.setMin(10);
        slider1.setMax(100);
//        slider1.setShowTickMarks(true);
//        slider1.setShowTickLabels(true);
        slider1.setValue(40);

        slider1.valueProperty().addListener((observableValue, oldValue, newValue) ->
                System.out.println("Value: " + newValue) );

        // add to pane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(slider1);

        // create a scne
        Scene scene = new Scene(stackPane, 400, 200);

        // add the scene to the stage
        primaryStage.setScene(scene);

        //  set the title of the stage
        primaryStage.setTitle("Slider Demo");

        // show the stage
        primaryStage.show();


    }
}
