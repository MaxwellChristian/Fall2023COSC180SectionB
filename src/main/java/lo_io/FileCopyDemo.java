package lo_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String []args) {

        try {
            FileInputStream fIn = new FileInputStream("data_files/test.txt");
            FileOutputStream fOut = new FileOutputStream("data_files/testCopy");

            int byteRead = fIn.read();
            while ( byteRead != -1 ){

                // write to dest file
                fOut.write(byteRead);

                byteRead = fIn.read();
            }

            fOut.close();
            fIn.close();

            System.out.println("Copied");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
