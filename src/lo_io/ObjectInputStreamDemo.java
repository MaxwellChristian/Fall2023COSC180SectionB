package lo_io;

import java.io.*;
import java.util.Date;

public class ObjectInputStreamDemo {

    public static void main(String []args) {

        try {
           ObjectInputStream fOut = new ObjectInputStream(new FileInputStream("data_files/object_data1"));

//            fOut.writeUTF("Hello");
//            fOut.writeObject(new Date());

//            System.out.println(fOut.readUTF());
//            System.out.println(((Date) fOut.readObject()));

            System.out.println(((Sem2Student) fOut.readObject()));
            System.out.println(((Sem2Student) fOut.readObject()));
            System.out.println(((Sem2Student) fOut.readObject()));

            Sem2Student student = (Sem2Student) fOut.readObject();

            fOut.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
