package _2024_sim_f;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class Q3 extends Application {

    private BorderPane paneBorder;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    private Socket socket;

    private String serverAddress = "127.0.0.1";
    private int serverPort = 12345;

    @Override
    public void start(Stage stage) {

        paneBorder = new BorderPane();
        paneBorder.setTop(setupMenus());

        stage.setTitle("Employee Dashboard");
        stage.setScene(new Scene(paneBorder, 400, 400));
        stage.show();

        // a dedicated thread to handle connection with the server
        Platform.runLater(this::handleServerConnection);
    }

    public void handleServerConnection() {
        try {

            socket = new Socket(serverAddress, serverPort);

            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendToServer(Actions command) {

        try {
            System.out.printf("Sending command (%s) to server: Started%n", command);

            objectOutputStream.writeObject(command);
            objectOutputStream.flush();

            System.out.printf("Sending command (%s) to server: Completed successfully%n", command);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public MenuBar setupMenus() {

        MenuBar obBar = new MenuBar();
        obBar.getMenus().addAll(setupFileMenu(), setupActionMenu());

        return obBar;
    }

    public Menu setupFileMenu() {

        MenuItem miExit = new Menu("Exit");
        miExit.setOnAction(e -> Platform.exit());

        Menu obMenu = new Menu("File");
        obMenu.getItems().add(miExit);

        return obMenu;
    }

    public Menu setupActionMenu() {

        MenuItem miTop5 = new MenuItem("Top 5");
        MenuItem miHighPerforming = new MenuItem("High Performing");
        MenuItem miProvinces = new MenuItem("Provinces");

        Menu obMenu = new Menu("Manage");
        obMenu.getItems().addAll(miTop5, miHighPerforming, miProvinces);

        // configure the action to be performed for the menu item (Top 5)
        miTop5.setOnAction(e -> {
            try {
                fetchTOP5();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });

        // configure the action to be performed for the menu item (High Performing)
        miHighPerforming.setOnAction(e -> {
            try {
                fetchHighPerforming();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });

        // configure the action to be performed for the menu item (Provinces)
        miProvinces.setOnAction(e -> {
            try {
                fetchProvinces();
            } catch (IOException | ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });

        return obMenu;
    }

    public void fetchTOP5() throws IOException, ClassNotFoundException {

        // send the command to the server
        sendToServer(Actions.TOP_5);

        // await for the response from the server
        System.out.printf("Awaiting response from server for the action (%s): Started%n", Actions.TOP_5);
        Object receivedObject = objectInputStream.readObject();
        List<Employee> receivedEmployeeList = (List<Employee>) receivedObject;
        System.out.printf("Awaiting response from server for the action (%s): Completed successfully%n", Actions.TOP_5);

        // process the response
        GridPane pane = new GridPane();

        pane.setHgap(5);
        pane.setVgap(5);

        int rowIndex = 0;
        for (Employee employee : receivedEmployeeList) {
            Text text = new Text(employee.toString());
            pane.add(text, 0, rowIndex++);
        }

        paneBorder.setCenter(pane);
    }

    public void fetchHighPerforming() throws IOException, ClassNotFoundException {

        // send the command to the server
        sendToServer(Actions.HIGH_PERFORMING);

        // await for the response from the server
        System.out.printf("Awaiting response from server for the action (%s): Started%n", Actions.HIGH_PERFORMING);
        Object receivedObject = objectInputStream.readObject();
        List<Employee> receivedEmployeeList = (List<Employee>) receivedObject;
        System.out.printf("Awaiting response from server for the action (%s): Completed successfully%n", Actions.HIGH_PERFORMING);

        // process the response
        GridPane pane = new GridPane();

        pane.setHgap(5);
        pane.setVgap(5);

        int rowIndex = 0;
        for (Employee employee : receivedEmployeeList) {
            Text text = new Text(employee.toString());
            pane.add(text, 0, rowIndex++);
        }

        paneBorder.setCenter(pane);
    }

    public void fetchProvinces() throws IOException, ClassNotFoundException {

        // send the command to the server
        sendToServer(Actions.LIST_OF_PROVINCES);

        // await for the response from the server
        System.out.printf("Awaiting response from server for the action (%s): Started%n", Actions.LIST_OF_PROVINCES);
        Object receivedObject = objectInputStream.readObject();
        String[] provinceList = (String[]) receivedObject;
        System.out.printf("Awaiting response from server for the action (%s): Completed successfully%n", Actions.LIST_OF_PROVINCES);

        // process the response
        GridPane pane = new GridPane();

        pane.setHgap(5);
        pane.setVgap(5);

        int rowIndex = 0;
        for (String province : provinceList) {
            Text text = new Text(province);
            pane.add(text, 0, rowIndex++);
        }

        paneBorder.setCenter(pane);
    }

    public static void main(String[] args) {
        Application.launch(args);

    }

}
