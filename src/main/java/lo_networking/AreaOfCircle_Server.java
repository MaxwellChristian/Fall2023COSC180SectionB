package lo_networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AreaOfCircle_Server extends Application {
    private static final int SERVER_PORT = 9090;
    private TextArea textArea;
    private ServerSocket serverSocket;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(textArea = new TextArea());

        Scene scene = new Scene(borderPane, 450, 200);

        primaryStage.setTitle("Area Server");
        primaryStage.setScene(scene);

        primaryStage.show();

        Thread serverThread = new Thread(this::startServer);
        serverThread.setDaemon(true);
        serverThread.start();
    }

    private void startServer() {

        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            Platform.runLater(() -> showMessage("Server started. Waiting for connections on port " + SERVER_PORT + "\n"));

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Platform.runLater(() -> showMessage("Client connected: " + clientSocket.getInetAddress() + "\n"));

                // Handle client connection in a separate thread
                Thread connectedClientThread = new Thread(() -> handleClientConnection(clientSocket));
                connectedClientThread.setDaemon(true);
                connectedClientThread.start();
            }
        } catch (IOException e) {
            Platform.runLater(() -> showMessage(String.valueOf(e)));
        }
    }

    private void handleClientConnection(Socket clientSocket) {
        try (DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream())) {
            while (true) {
                double radius = inputStream.readDouble();
                double area = Math.PI * radius * radius;

                Platform.runLater(() -> {
                    showMessage("Received value: " + radius + "\n");
                    showMessage("Sending area: " + area + "\n");
                });

                DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
                outputStream.writeDouble(area);
                outputStream.flush();
            }
        } catch (IOException e) {
            Platform.runLater(() -> showMessage("Client disconnected: "
                    + clientSocket.getInetAddress()
                    + ", Port" + clientSocket.getPort()
                    + "\n"));
        }
    }

    private void showMessage(String message) {
        textArea.appendText(message);
    }

}
