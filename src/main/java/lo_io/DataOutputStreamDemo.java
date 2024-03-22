package lo_io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

    public static void main(String []args) {

        try {
//            DataOutputStream fOut = new DataOutputStream("data_files/bin_file1");
            DataOutputStream fOut = new DataOutputStream(new FileOutputStream("data_files/data_file1"));

            fOut.writeInt(1987);
            fOut.writeDouble(57.89);
            fOut.writeBoolean(true);
            fOut.writeUTF("Hello");

            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
