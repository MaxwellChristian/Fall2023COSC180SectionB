package lo_io;

/*
* Write a program which take multiple paths as command line arguments and
*   displays the size if the path refers to a file or
*   displays the count of files and sub - dirs if the path refers to a dir
* */

import java.io.File;

public class PathStats {

    public static void main(String []args) {

        // iterate over each command line argument
        for (String curArg: args) {
//            System.out.println(curArg);

            // create a file object referring to the path as per current parameter
            File fObj = new File(curArg);

            if( fObj.exists() ){
                if( fObj.isFile() ){
                    System.out.println("F: " + fObj.getName() + " : " + fObj.length());
                } else {
                    if( fObj.isDirectory() ){
                        // System.out.println("D: " + fObj.getName() + " : " + fObj.length());

                        // display count of total files and total sub-dirs
                        int totalFiles = 0;
                        int totalDirs = 0;
                        for( File f: fObj.listFiles()){
                            if( f.isFile() ){
                                totalFiles++;
                            } else {
                                if(f.isDirectory()){
                                    totalDirs++;
                                }
                            }
                        }

                        System.out.print(fObj.getName() + " -> ");
                        System.out.println("Total files: " + totalFiles + ", Total dirs: " + totalDirs);
                    }
                }
            } else {
                System.out.println(curArg + " : No such file exists");
            }


        }

    }

}
