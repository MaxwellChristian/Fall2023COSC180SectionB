package lo_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerDemo {

    public static void main(String []args) {

        // create the server socket to connect
        // requires a port at which the server will serve
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server started. Serving at port: " + 9000);

            while (true) {
                // wait for clients to connect
                System.out.println("Waiting for client to connect");

                Socket connectedClient = serverSocket.accept();
                System.out.println("Client connected: "
                        + connectedClient.getLocalAddress()
                        + "/"
                        + connectedClient.getPort() );

                // receive the request from the connected client
                DataInputStream inputStreamFromClient =
                        new DataInputStream(connectedClient.getInputStream());
                String messageFromClient = inputStreamFromClient.readUTF();
                System.out.println("Client says: " + messageFromClient);

                // send the response to the connected client
                DataOutputStream outputStreamToClient =
                        new DataOutputStream(connectedClient.getOutputStream());
                String messageToClient = "Hello" + new Date();
                System.out.println("Server responds: " + messageToClient);
                outputStreamToClient.writeUTF(messageToClient);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
