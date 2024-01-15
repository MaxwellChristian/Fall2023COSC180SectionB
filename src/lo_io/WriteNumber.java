package lo_io;

/*
 *
 * Write a program which can store int values to a file.
 * the int values should be provided using command line arguments
 * */

import java.io.*;
import java.util.Random;

public class WriteNumber {

    public static void main(String[] args) {

        // creating a file for random access
        try (RandomAccessFile raf = new RandomAccessFile("data_files/random_file", "rw")) {

            // move to the end of the file
            // so that we preserve the existing contents and
            // append the new contents
            raf.seek(raf.length());

            // display the size of the file [in bytes]
            System.out.println("Size in bytes: " + raf.length());

            // display the total int existing in the file
            System.out.println("Count of int(s): " + raf.length() / 4);

            // length of the file
            System.out.println("File Length : " + raf.length());

            // write the value provided as command line argument
            for (String token: args) {
                raf.writeInt(Integer.parseInt(token));
            }

            // append an int value to the file
            raf.writeInt(9090);

            // length of the file
            System.out.println("File Length : " + raf.length());

            // jump to the start of the file
            raf.seek(0);

            // read the int value from the file
            System.out.println("Int value at pos 0: " + raf.readInt());

            // display the 7th int value from the file
            raf.seek( 6 * 4);
            System.out.println("Int value at pos 7 (6*4): " + raf.readInt());

            // display the 3rd int value from the file
            raf.seek( 2 * 4);
            System.out.println("Int value at pos 3 (2*4): " + raf.readInt());

            // display all values from the file
            displayAll(raf);

            // display all the values at the odd position in the file
            displayAll(raf, 1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayAll(RandomAccessFile raf, int positionType) throws IOException {

        int counter = 1;

        // move to the start of the file
        raf.seek(0);

        // iterate till the end of the file
        while ( raf.getFilePointer() < raf.length() ) {

            // fetch the value
            int fetchedValue = raf.readInt();

            if( counter%2 == positionType ){
                // display the value
                System.out.println(fetchedValue);
            }

            counter++;


        }

    }

    private static void displayAll(RandomAccessFile raf) throws IOException {

        // move to the start of the file
        raf.seek(0);

        // iterate till the end of the file
        while ( raf.getFilePointer() < raf.length() ) {

            // fetch and display the value
            System.out.println(raf.readInt());
        }

    }

}
