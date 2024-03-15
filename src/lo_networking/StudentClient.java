package lo_networking;


/*
* The client takes input of student data and then sends it to server
* [the data is shared using objects]
* */

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class StudentClient {

    public static void main(String ... args) {

        try {

            // collect the student data
            Student studentToSend = getStudentData();

            String serverAddress = args[0];
            int serverPort = Integer.parseInt(args[1]);

            Socket connectionToServer = new Socket(serverAddress, serverPort);
            System.out.println("Connected to server");

            // send the student data [as an object] to the server

            // get the output line to the connected server
            ObjectOutputStream outputStreamToServer = new ObjectOutputStream(connectionToServer.getOutputStream());
            outputStreamToServer.writeObject(studentToSend);

            // close the connection
            connectionToServer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Student getStudentData() {

        Scanner inputLine = new Scanner(System.in);

        Student student = new Student();

        // input first name
        System.out.print("Enter first name: ");
        student.setFirstName(inputLine.next());

        // input last name
        System.out.print("Enter last name: ");
        student.setLastName(inputLine.next());

        // input city
        System.out.print("Enter city name: ");
        student.setCity(inputLine.next());

        // input province
        System.out.print("Enter province name: ");
        student.setProvince(inputLine.next());

        // input country
        System.out.print("Enter country name: ");
        student.setCountry(inputLine.next());

        return student;
    }

}
