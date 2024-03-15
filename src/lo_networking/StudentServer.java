package lo_networking;


/*
* The server waits for a client to send student data and then the server
* stores that student data to a file
* [student data is shared using objects]
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class StudentServer {

    public static void main(String ... args) {

        int serverPort = Integer.parseInt(args[0]);
        ObjectOutputStream objectOutputStreamToFile = null;

        try {
            objectOutputStreamToFile = new ObjectOutputStream(new FileOutputStream("data_files/student_data.txt", true));

            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server started at " + new Date());
            System.out.println("Server providing service at port: " + serverPort);

            while (true) {
                System.out.println("Waiting for client");

                Socket connectedClient = serverSocket.accept();

                System.out.println("Client connected: "
                        + connectedClient.getInetAddress()
                        + "/"
                        + connectedClient.getPort());

                // get the input line of the connected client
                ObjectInputStream inputStreamFromClient = new ObjectInputStream(connectedClient.getInputStream());

                // fetch the student object from the input line
                Student studentReceived = (Student) inputStreamFromClient.readObject();

                // display the student object received
                System.out.println("Student received: " + studentReceived);

                // store the student object to a file
                // [the name/path of the file is assumed to be fixed]
                // data_files/student_data.txt

                objectOutputStreamToFile.writeObject(studentReceived);
                System.out.print("Student data stored to file");

                ObjectOutputStream outputStreamToClient =
                        new ObjectOutputStream(connectedClient.getOutputStream());
                outputStreamToClient.writeObject(new String("Student data stored successfully"));

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStreamToFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
