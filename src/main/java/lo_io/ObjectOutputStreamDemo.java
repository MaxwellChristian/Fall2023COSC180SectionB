package lo_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamDemo {

    public static void main(String []args) {

        try {
           ObjectOutputStream fOut = new ObjectOutputStream(new FileOutputStream("data_files/object_data1"));

//            fOut.writeUTF("Hello");
//            fOut.writeObject(new Date());

            Sem2Student s1 = new Sem2Student(1, "AA", new Date());
            Sem2Student s2 = new Sem2Student(2, "BB", new Date());
            Sem2Student s3 = new Sem2Student(3, "CCCC", new Date());

            fOut.writeObject(s1);
            fOut.writeObject(s2);
            fOut.writeObject(s3);

            fOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
