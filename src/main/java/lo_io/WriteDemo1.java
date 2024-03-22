package lo_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDemo1 {

    public static void main(String []args){

        String path = "data_files/test.txt";

        // create an object of file
        File fObj = new File(path);


        try {
            // use a writer/output stream to save data in the file
            PrintWriter printWriter = new PrintWriter(fObj);

            // save/write the data using the writer
            printWriter.print("Welcome");
            printWriter.print(", ");

            printWriter.print(57);
            printWriter.print(", ");

            printWriter.print('A');
            printWriter.print(", ");

            printWriter.println(89.21);

            // close the file
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println( fObj.getName() + ": No such path exists");
        }

    }

}
