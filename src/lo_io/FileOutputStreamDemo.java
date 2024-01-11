package lo_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String []args) {

        try {
            FileOutputStream fOut = new FileOutputStream("data_files/bin_file1");

            fOut.write(1987);

            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
