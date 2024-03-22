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

            switch (fileType) {
                case CREATE_FILE:

                    try {
                        createFile(path + File.separator + fileName);
                        System.out.println("File created");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case CREATE_DIR:

                    try {
                        createDirectory(path + File.separator + fileName);
                        System.out.println("File created");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
            }

        } catch (InputMismatchException immEx) {
            System.out.println("Please provide the name as single word and then a valid int for the file type");
        }


    }

    private static void createDirectory(String filePath) throws IOException {

        File fileObj = new File(filePath);

        if( ! fileObj.exists() ){
            if( ! new File(filePath).mkdir() ){
                throw new IOException("Directory creation failed");
            }
        } else {
            throw new IOException("Directory already exists");
        }

    }

    private static void createFile(String filePath) throws IOException {

        File fileObj = new File(filePath);

        if( ! fileObj.exists() ){
            if( ! new File(filePath).createNewFile() ){
                throw new IOException("File creation failed");
            }
        } else {
            throw new IOException("File already exists");
        }

    }

}
