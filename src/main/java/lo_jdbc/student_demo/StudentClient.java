package lo_jdbc.student_demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class StudentClient {

    static String serverAddress = "localhost";
    static int serverPort = 9090;

    public static void main(String[] args) {

        try {
            // connect to the server at an address and port
            // address and port of the server is to be captured from the command line
            if( args.length == 1 ){
                serverAddress = args[0];
            } else {
                if( args.length == 2 ){
                    serverPort = Integer.parseInt(args[1]);
                }
            }
            Socket connectionSocket = new Socket(serverAddress, serverPort);

            // once connected, send a command to the server
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(connectionSocket.getOutputStream());
            objectOutputStream.writeUTF("DB_FETCH_STUDENTS_SENIOR");
            objectOutputStream.flush();

            // once the response is received, display it on the screen
            ObjectInputStream objectInputStream = new ObjectInputStream(connectionSocket.getInputStream());
            ArrayList<Student> alStudents = (ArrayList<Student>) objectInputStream.readObject();
            connectionSocket.close();

            // System.out.println("Server response: " + responseFromServer);
            alStudents.forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
