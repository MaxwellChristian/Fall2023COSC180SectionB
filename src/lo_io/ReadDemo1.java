package lo_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDemo1 {

    public static void main(String []args) {

        String path = "data_files/test.txt";

        // create an object of file
        File fObj = new File(path);


        try {
            // read using a Scanner
            Scanner scanner = new Scanner(fObj);

            String token;

            while ( scanner.hasNext() ) {
                token = scanner.next();
                System.out.println(token);
            }

            // close the file
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println(path + ": No such file exists");
        }

    }

}
