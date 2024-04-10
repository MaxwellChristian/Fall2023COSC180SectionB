package lo_jdbc.student_demo;

import lo_jdbc.DBHelper;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentServer {

    private static int SERVER_PORT = 9090;

    public static void main(String[] args) {

        // start the server on a port [port to be fetched from command line]
        if (args.length == 1) {
            SERVER_PORT = Integer.parseInt(args[0]);
        }

        // wait for the client to connect
        startServer();

    }

    private static void startServer() {

        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            showMessage("Server started. Waiting for connections on port " + SERVER_PORT + "\n");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                showMessage("Client connected: "
                        + clientSocket.getInetAddress()
                        + ", Port: " + clientSocket.getPort()
                        + "\n");

                // Handle client connection in a separate thread
                Thread connectedClientThread =
                        new Thread(() -> handleClientConnection(clientSocket));
                connectedClientThread.setDaemon(true);
                connectedClientThread.start();
            }
        } catch (IOException e) {
            showMessage(String.valueOf(e));
        }
    }

    private static void handleClientConnection(Socket clientSocket) {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(clientSocket.getInputStream())) {
            while (true) {

                // fetch the command from the client
                String commandFromClient = inputStream.readUTF();

                // perform the operation
                Object responseToClient = executeCommand(commandFromClient);

                // send the result back to the client
                ObjectOutputStream objectOutputStream =
                        new ObjectOutputStream(clientSocket.getOutputStream());
                objectOutputStream.writeObject(responseToClient);
                objectOutputStream.close();
            }
        } catch (IOException e) {
            showMessage("Client disconnected: "
                    + clientSocket.getInetAddress()
                    + ", Port: " + clientSocket.getPort()
                    + "\n");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object executeCommand(String commandFromClient) throws SQLException, ClassNotFoundException {

        if (commandFromClient.equals("DB_FETCH_STUDENTS_SENIOR")) {
            // connect to database
            Connection connection =
                    DBHelper.connect(DBHelper.DB_TYPE.ACCESS, "Students.accdb");

            String query = "SELECT " +
                        "LastName as LN, FirstName AS FN " +
                    "FROM " +
                        "Students " ;

            ResultSet resultSet = DBHelper.execute(connection, query);

            ArrayList<Student> studentList = new ArrayList<>();

            while (resultSet.next()) {

                Student student = new Student();
                student.setFirstName(resultSet.getString("FN"));
                student.setLastName(resultSet.getString("LN"));

                studentList.add(student);
            }

            return studentList;
        }

        if (commandFromClient.equals("DB_FETCH_STUDENTS_ALL")) {

        }

        return "Output of command: " + commandFromClient;
    }

    private static void showMessage(String message) {
        System.out.println(message);
    }

}
