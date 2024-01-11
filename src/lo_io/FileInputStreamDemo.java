package lo_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String []args) {

        try {
            FileInputStream fOut = new FileInputStream("data_files/bin_file1");

            int byteRead = fOut.read();
            while ( byteRead != -1 ){
                System.out.println(byteRead);
                byteRead = fOut.read();
            }


            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
