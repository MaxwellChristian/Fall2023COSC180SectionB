package lo_io;

/*
 * Input the name of the file from the user and
 * an int representing FILE or DIR and then
 * create the file/dir, if it does not exist
 * */

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileCreationDemo {

    private static final int CREATE_FILE = 1;
    private static final int CREATE_DIR = 2;

    public static void main(String[] args) {

        String path = "data_files";

        Scanner inputLine = new Scanner(System.in);

        try {

            System.out.println("Enter file name: ");
            String fileName = inputLine.next();

            System.out.print("Create File[1] or Directory[2]: ");
            int fileType = inputLine.nextInt();

            File fObj = new File(path + "/" + fileName);

            switch (fileType) {
                case CREATE_FILE:

                    if( fObj.exists() ){
                        System.out.println("File already exists");
                    }
                    else {
                        try {
                            if (fObj.createNewFile()) {
                                System.out.println("File created");
                            } else {
                                System.out.println("File creation failed");
                            }
                        } catch (IOException e) {
                            System.out.println("Oops. Something went wrong when creating the file");
                        }
                    }
                    break;
                case CREATE_DIR:

                    if( fObj.exists() ){
                        System.out.println("Directory already exists");
                    }
                    else {
                        if (fObj.mkdir()) {
                            System.out.println("Directory created");
                        } else {
                            System.out.println("Directory creation failed");
                        }
                    }

                    break;
            }

        } catch (InputMismatchException immEx) {
            System.out.println("Please provide the name as single word and then a valid int for the file type");
        }


    }

}
