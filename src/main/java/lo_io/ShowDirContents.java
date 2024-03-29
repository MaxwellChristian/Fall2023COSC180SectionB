package lo_io;

/*
* Input a directory name from user and list for all the files of the directory the following
*   D - if the file is a directory
*   F - if the file is a normal file
*   R - if the file is read-only
*   the absolute path of the file
*   the timestamp the file was last modified
* */

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class ShowDirContents {

    public static void main(String []args) {

        String dirPath;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter dir name: ");
        dirPath = inputLine.next();

        File fObj = new File(dirPath);

        File[] files = fObj.listFiles();
        for (File curFile: files){
            if( curFile.isDirectory() ){
                System.out.print("D");
            }
            else {
                if( curFile.isFile() ){
                    System.out.print("F");
                }
            }

            if( ! curFile.canWrite() ){
                System.out.print("R");
            }

            System.out.print(" " + curFile.getAbsolutePath() + " ");

            System.out.println( new Date(curFile.lastModified()));
        }
    }

}
