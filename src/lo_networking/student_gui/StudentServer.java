package lo_networking.student_gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class StudentServer extends Application {

    static int serverPort;
    private static String filePath;

    TextArea textArea;

    public static void main(String ... args) {

        serverPort = Integer.parseInt(args[0]);
        filePath = args[1];

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(textArea = new TextArea());

        Scene scene = new Scene(borderPane, 450, 200);

        primaryStage.setTitle("Area Server");
        primaryStage.setScene(scene);

        primaryStage.show();

        Thread serverThread = new Thread(() -> startServer(serverPort));
        serverThread.setDaemon(true);
        serverThread.start();

    }

    private void startServer(int serverPort) {
        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            Platform.runLater(() -> showMessage("Server started. Waiting for connections on port " + serverPort + "\n"));

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
        try (ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream())) {
            while (true) {

                Student receivedStudent = (Student) inputStream.readObject();
                // save the received object to a file
                ObjectOutputStream outputStreamToFile =
                        new ObjectOutputStream(new FileOutputStream(filePath, true));
                outputStreamToFile.writeObject(receivedStudent);

                DataOutputStream outputStreamToClient =
                        new DataOutputStream(clientSocket.getOutputStream());
                outputStreamToClient.writeBoolean(true);

                Platform.runLater(() -> {
                    showMessage("Received student: " + receivedStudent + "\n");
                });

            }
        } catch (IOException e) {

            try {
                DataOutputStream outputStreamToClient =
                        new DataOutputStream(clientSocket.getOutputStream());
                outputStreamToClient.writeBoolean(false);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            Platform.runLater(() -> showMessage("Client disconnected: "
                    + clientSocket.getInetAddress()
                    + ", Port" + clientSocket.getPort()
                    + "\n"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void showMessage(String message) {
        textArea.appendText(message);
    }

}
