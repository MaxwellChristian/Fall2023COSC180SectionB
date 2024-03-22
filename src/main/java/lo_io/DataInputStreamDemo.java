package lo_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {

    public static void main(String []args) {

        try {
            DataInputStream fOut = new DataInputStream(new FileInputStream("data_files/data_file1"));

//            fOut.writeInt(1987);
//            fOut.writeDouble(57.89);
//            fOut.writeBoolean(true);
//            fOut.writeUTF("Hello");

            System.out.println(fOut.readInt());
            System.out.println(fOut.readDouble());
            System.out.println(fOut.readBoolean());
            System.out.println(fOut.readUTF());

            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
