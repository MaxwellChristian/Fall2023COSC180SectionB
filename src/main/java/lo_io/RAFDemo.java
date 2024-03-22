package lo_io;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class RAFDemo {

    public static void main(String[] args) {

        try (RandomAccessFile rafFile = new RandomAccessFile("data_files/raf_file", "rw")) {

            // write 10 random int to the file
            for (int counter = 1; counter <= 10; counter++) {
                rafFile.writeInt(new Random().nextInt(1000));
            }

            // display the current length of the file
            System.out.println("File length: " + rafFile.length());

            // read all int values from the file
            rafFile.seek(0);
            do {
                System.out.println(rafFile.readInt());
            } while (rafFile.getFilePointer() != rafFile.length());

            // display the first int
            rafFile.seek(0);
            System.out.println("First number: " + rafFile.readInt());

            // display the last int
            rafFile.seek(rafFile.length() - (Integer.SIZE / 8));
            System.out.println("Last number: " + rafFile.readInt());

            // modify the last int
            rafFile.seek(rafFile.length() - (Integer.SIZE / 8));
            rafFile.writeInt(99);
            // display the last int
            rafFile.seek(rafFile.length() - (Integer.SIZE / 8));
            System.out.println("Last number: " + rafFile.readInt());

            // append a new number
            rafFile.seek(rafFile.length());
            rafFile.writeInt(99099);

            // display the new length of the file
            System.out.println("New length of the file: " + rafFile.length());

            // retrieve the new appended number
            rafFile.seek(rafFile.length() - (Integer.SIZE / 8));
            System.out.println("Last number: " + rafFile.readInt());


        } catch (EOFException ex) {
            System.out.println("End of file reached");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
