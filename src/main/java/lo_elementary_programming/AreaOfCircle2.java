package lo_elementary_programming;

// Write a program to
// find/compute/calculate and
// display the area of a circle with radius provided by user

import java.util.Scanner;

// after displaying the area of the circle,
// the program should take input of radius from user and display the computed area
public class AreaOfCircle2 {

    // starting point
    public static void main(String []args) {

        double dRadius;
        double dArea;

        // input radius from user
        Scanner inputLine = new Scanner(System.in);

        // 2. capture the input provided by user
        // 2.1 prompt the user for input
        System.out.print("Enter the radius: ");

        // 2.2 capture the user input
        dRadius = inputLine.nextDouble();

        // dArea = 3.14 * dRadius * dRadius;

        final double PI = 3.1428;   // final variables, once assigned a value cannot change
        // final variables should normally be named in all capital
        dArea = PI * dRadius * dRadius;

        // another way
        // dArea = Math.PI * dRadius * dRadius;

        // System.out.print("Area of circle with radius " + dRadius + " is " + dArea );
        System.out.printf("Area of circle with radius %.2f is %.2f\n", dRadius, dArea );




    }

}
