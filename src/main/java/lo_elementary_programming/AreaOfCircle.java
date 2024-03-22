package lo_elementary_programming;

// Write a program to
// find/compute/calculate and
// display the area of a circle with radius 35.2

import java.util.Scanner;

// after displaying the area of the circle,
// the program should take input of radius from user and display the computed area
public class AreaOfCircle {

    // starting point
    public static void main(String []args) {

        // input section

        // processing section

        // output section

        // the below mentioned two statements will
        // first print the name and then
        // println will move to the next line
//        System.out.print("Maxwell" + " " + "Christian");
//        System.out.println("");

        // or you can also use the below single statement
        System.out.println("Maxwell" + " " + "Christian");

        // the statement is concatenation of message with the result of the formula
        // System.out.print("Area of circle with radius 35.2 is " + 3.14*35.2*35.2);

        // this statement is a suggested way
        System.out.println("Area of circle with radius 35.2 is " + (3.14*35.2*35.2) );

        // the second part

        double dRadius;

        // input radius from user
        Scanner inputLine = new Scanner(System.in);

        // 2. capture the input provided by user
        // 2.1 prompt the user for input
        System.out.print("Enter the radius: ");

        // 2.2 capture the user input
        dRadius = inputLine.nextDouble();

        System.out.print("Area of circle with radius " + dRadius + " is " + (3.14 * dRadius * dRadius) );




    }

}
