package gui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ListDemo extends Application {

    String[] diceNames = {"One", "Two", "Three", "Four", "Five", "Six"};

    @Override
    public void start(Stage primaryStage) throws Exception {

        ListView<String> lstDices = new ListView<>(FXCollections.observableArrayList(diceNames));
        lstDices.setPrefSize(200,200);
        lstDices.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(lstDices);

        lstDices.getSelectionModel().selectedItemProperty().addListener(observable -> {
            System.out.println(lstDices.getSelectionModel().getSelectedIndices());
            System.out.println(lstDices.getSelectionModel().getSelectedItems());
        });


        Scene scene = new Scene(borderPane, 400, 200);

        primaryStage.setScene(scene);

        primaryStage.show();


    }
}
