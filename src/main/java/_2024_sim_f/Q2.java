package _2024_sim_f;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;

public class Q2 {

    public static final int PORT = 12345;
    private static ArrayList<Employee> employeeList;

    public static void main() {
        startServer();
    }

    private static void startServer() {

        // fetch and store the list of employees for future use
        employeeList = Q1.loadList("jdbc:ucanaccess://dbSimF.accdb");

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            showMessage("Server started. Waiting for connections on port %d%n".formatted(PORT));

            while (true){

                Socket clientSocket = serverSocket.accept();
                showMessage("Client connected: %s, Port: %d%n".formatted(clientSocket.getInetAddress(), clientSocket.getPort()));

                // Handling client connection (using a dedicated thread)
                Thread connectedClientThread = new Thread(() -> handleClientConnection(clientSocket));
                connectedClientThread.setDaemon(true);
                connectedClientThread.start();

            }
        } catch (IOException e) {
            showMessage(String.valueOf(e));
        }
    }

    private static void handleClientConnection(Socket clientSocket) {

        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
            objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            while (true) {

                // receive action from the client
                System.out.println("Waiting to receive action from the client.");
                Actions commandFromClient = (Actions) objectInputStream.readObject();
                System.out.printf("Received action %s from the client.%n", commandFromClient.name());

                // perform the received action
                System.out.printf("Performing the action (%s): Started%n", commandFromClient);
                Object responseToClient = executeCommand(commandFromClient);
                System.out.printf("Performing the action (%s): Completed successfully%n", commandFromClient);

                // Respond to the client with the output of the action
                System.out.println("Sending the response: Started");
                objectOutputStream.writeObject(responseToClient);
                System.out.println("Sending the response: Completed successfully");

            }
        } catch (IOException e) {
            showMessage("Client disconnected: %s, Port: %d%n".formatted(clientSocket.getInetAddress(), clientSocket.getPort()));
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object executeCommand(Actions commandFromClient) throws SQLException, ClassNotFoundException {

        switch (commandFromClient) {
            case TOP_5 -> {
                return employeeList.stream().sorted((o1, o2) -> (int) (o2.getShiftHours() - o1.getShiftHours())).limit(5).toList();
            }
            case HIGH_PERFORMING -> {
                // assuming high-performing employees are those who have sold more than 50,000 items
                return Q1.getEmployees(employeeList, employee -> employee.getTotalItemsSold() > 50000).stream().toList();
            }
            case LIST_OF_PROVINCES -> {
                return Q1.getProvinceList(employeeList);
            }
        }

        return "Cannot recognize the command: %s".formatted(commandFromClient);
    }

    private static void showMessage(String message) {
        System.out.print(message);
    }
}
