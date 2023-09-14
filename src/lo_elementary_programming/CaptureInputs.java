package lo_elementary_programming;

import java.util.Scanner;

public class CaptureInputs {

    public static void main(String []args){

        int x;
        int y;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter x : ");
        x = inputLine.nextInt();

        System.out.print("Enter y : ");
        y = inputLine.nextInt();

        System.out.println("x : " + x + ", y : " + y);

    }

}
