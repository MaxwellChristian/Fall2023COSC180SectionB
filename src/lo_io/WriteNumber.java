package lo_io;

/*
 *
 * Write a program which can store 10 random int values to a file
 * */

import java.io.*;
import java.util.Random;

public class WriteNumber {

    public static void main(String[] args) {

        // creating a file for random access
        try (RandomAccessFile raf = new RandomAccessFile("data_files/random_file", "rw")) {

            // length of the file
            System.out.println("File Length : " + raf.length());

            // write an int to the file
            raf.writeInt(57);

            // length of the file
            System.out.println("File Length : " + raf.length());

            // add 9 int values to the file
            for( int i = 1 ; i <= 8 ; i++ ){
                raf.writeInt(new Random().nextInt(1000));
            }

            // length of the file
            System.out.println("File Length : " + raf.length());

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


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
