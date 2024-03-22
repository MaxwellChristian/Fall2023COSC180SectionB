package lo_io;

import java.io.File;

public class FileDemo {

    public static void main(String []args) {

//        File fObj = new File("C:\\Users\\christianm\\OneDrive - Saskatchewan Polytechnic\\2024\\Semester-2\\COSC-190\\PPTs");
//        File fObj = new File(".");
//        File fObj = new File("..\\data_files");
        File fObj = new File("data_files");

        // check if the file exists
        if( fObj.exists() ){
            System.out.println(fObj);

            // absolute path
            System.out.println(fObj.getAbsolutePath());

            // name of the file
            System.out.print(fObj.getName());
        }
        else {
            System.out.println("No such file exists");
        }





    }

}
