package lo_io;

/*
* Input the name of the file from the user and
* an int representing FILE or DIR and then
* create the file/dir, if it does not exist
* */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationDemo {

    public static void main(String []args) {

        String path = "data_files";

        Scanner inputLine = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = inputLine.next();

        System.out.print("Create File[1] or Directory[2]: ");
        int fileType = inputLine.nextInt();

        switch (fileType){
            case 1:
                File fObj = new File(path + "\\" + fileName);
                try {
                    if(fObj.createNewFile()){
                        System.out.println("File created");
                    }
                    else {
                        System.out.println("File creation failed");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                File fObj2 = new File(path + "\\" + fileName);
                 if(fObj2.mkdir()){
                     System.out.println("Directory created");
                 }
                 else {
                     System.out.println("Directory creation failed");
                 }
                break;
        }

    }

}
