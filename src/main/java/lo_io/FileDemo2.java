package lo_io;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {

    public static void main(String []args) {

//        File fObj = new File("C:\\Users\\christianm\\OneDrive - Saskatchewan Polytechnic\\2024\\Semester-2\\COSC-190\\PPTs");
//        File fObj = new File(".");
//        File fObj = new File("..\\data_files");

//        Scanner inputLine = new Scanner(System.in);

//        System.out.print("Enter path");
//        String path = inputLine.next();

//        File fObj = new File(path);

        System.out.println(Arrays.toString(args));

        File fObj = new File(args[0]);

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
