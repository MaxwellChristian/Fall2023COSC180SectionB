package lo_networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientDemo {

    public static void main(String []args) {

        // connect to a server using IP and port
        try {
//            Socket socket = new Socket("www.google.com", 9000);
//            Socket socket = new Socket("127.0.0.1", 9000);

            Socket socket = new Socket("localhost", 9000);

            // send "HELLO" to server
            DataOutputStream outputStreamToServer =
                    new DataOutputStream(socket.getOutputStream());
            outputStreamToServer.writeUTF("HELLO");

            // receive the response from the server
            DataInputStream inputStreamFromServer =
                    new DataInputStream(socket.getInputStream());
            String messageFromServer = inputStreamFromServer.readUTF();

            System.out.println("Server says: " + messageFromServer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
