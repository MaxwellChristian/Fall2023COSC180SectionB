package lo_networking;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class AreaOfCircle_Client extends Application {


    private static final int SERVER_PORT = 9090;
    Socket connectionSocket;
    DataOutputStream requestLine;
    DataInputStream responseLine;
    private Scene scene;
    private TextArea textArea;
    private Label lblPrompt;
    private TextField tfRadius;

    @Override
    public void init() throws Exception {
        super.init();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(getInputPane());
        borderPane.setCenter(getPaneForResponse());

        scene = new Scene(borderPane, 450, 200);

        primaryStage.setTitle("Area Calculator");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    private Node getPaneForResponse() {

        textArea = new TextArea();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textArea);

        BorderPane paneForResponse = new BorderPane();
        paneForResponse.setCenter(scrollPane);

        return paneForResponse;
    }

    private Node getInputPane() {

        lblPrompt = new Label("Enter radius of circle: ");
        tfRadius = new TextField();
        tfRadius.setAlignment(Pos.BOTTOM_RIGHT);

        tfRadius.setOnAction(actionEvent -> {
            try {
                double radius = Double.parseDouble(tfRadius.getText());

                tfRadius.clear();

                double area = calculateArea(radius);
                textArea.appendText("Radius: " + radius +" -> Area: " + area);
                textArea.appendText("\n");
            } catch (IOException e) {
                textArea.appendText(e + "\n");
            }
        });

        BorderPane paneForInput = new BorderPane();
        paneForInput.setPadding(new Insets(10, 10, 10, 10));

        paneForInput.setLeft(lblPrompt);
        paneForInput.setCenter(tfRadius);

        return paneForInput;
    }

    private double calculateArea(double radius) throws IOException {

        connectionSocket = new Socket("localhost", SERVER_PORT);

        requestLine = new DataOutputStream(connectionSocket.getOutputStream());
        responseLine = new DataInputStream(connectionSocket.getInputStream());

        requestLine.writeDouble(radius);
        requestLine.flush();

        double area = responseLine.readDouble();

        connectionSocket.close();

        return area;
    }
}
