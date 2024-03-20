package lo_networking.student_gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StudentClient extends Application {

    TextField tfLastName;
    TextField tfFirstName;
    TextField tfCity;
    TextField tfProvince;
    TextField tfPostalCode;

    Button btnSendToServer = new Button("Send");

    static String serverAddress;
    static int serverPort;

    public static void main(String ... args) {

        serverAddress = args[0];
        serverPort = Integer.parseInt(args[1]);

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane(20, 20);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        // set up the controls
        tfLastName = new TextField();
        tfFirstName = new TextField();
        tfCity = new TextField();
        tfProvince = new TextField();
        tfPostalCode = new TextField();

        // add to the pane
        gridPane.add(new Label("Enter last name: "), 0, 0);
        gridPane.add(tfLastName, 1, 0);

        gridPane.add(new Label("Enter first name: "), 0, 1);
        gridPane.add(tfFirstName, 1, 1);

        gridPane.add(new Label("Enter city: "), 0, 2);
        gridPane.add(tfCity, 1, 2);

        gridPane.add(new Label("Enter province: "), 0, 3);
        gridPane.add(tfProvince, 1, 3);

        gridPane.add(new Label("Enter postal code: "), 0, 4);
        gridPane.add(tfPostalCode, 1, 4);

        gridPane.add(btnSendToServer, 1, 5);
        btnSendToServer.setOnAction(actionEvent -> sendToServer(serverAddress, serverPort));

        // create a scene with the pane
        Scene scene = new Scene(gridPane, 400, 500);

        // add to stage
        primaryStage.setScene(scene);

        // show the stage
        primaryStage.show();

    }

    private void sendToServer(String serverAddress, int serverPort) {

        try {
            Student studentToSend = getStudent();

            Socket connectedServer = new Socket(serverAddress, serverPort);

            ObjectOutputStream outputStreamToServer =
                    new ObjectOutputStream(connectedServer.getOutputStream());
            outputStreamToServer.writeObject(studentToSend);

            connectedServer.close();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Send status");
            alert.setHeaderText("Send Student");
            alert.setContentText("Student data sent successfully to server");
            alert.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Student getStudent() {

        Student student = new Student();

        student.setLastName(tfLastName.getText());
        student.setFirstName(tfFirstName.getText());
        student.setCity(tfCity.getText());
        student.setProvince(tfProvince.getText());
        student.setPostalCode(tfPostalCode.getText());

        return student;
    }
}
