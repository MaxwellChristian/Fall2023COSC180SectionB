package lo_elementary_programming;
/*
Write a program to compute and display the
circumference of a circle as per the user provided radius
*/

// this is a single line comment
/* This is also a single line comment */

/* This is a
multi-line comment
 */

import java.util.Scanner;

public class CircumferenceOfCircle {

    // starting point
    public static void main(String []args) {

        // declaration section

        int radius; // radius can store only whole numbers
        float fRadius; // radius can now store values with decimals
        double dRadius; // radius can now store values with decimals (with more precision)

        int iCircumference;
        float fCircumference;
        double dCircumference;

        // the radius is to be provided by user
        radius = 7; // assignment of value 7 to variable radius
        fRadius = 7.25788978f; // assignment of value 7.2 to variable fRadius
        dRadius = 7.25788978; // assignment of value 7.2 to variable dRadius

        // processing section
        fCircumference = 2 * 3.14f * fRadius;
        dCircumference = 2 * 3.14 * dRadius;

        // input section

        // 1. define the input line
        Scanner inputLine = new Scanner(System.in);

        // 2. capture the input provided by user
            // 2.1 prompt the user for input
            System.out.println("Enter the radius: ");

            // 2.2 capture the user input
            dRadius = inputLine.nextDouble();

        // computing the circumference as per user provided radius
        dCircumference = 2 * 3.14 * dRadius;

        // output section
        // System.out.println("Circumference of circle with " + radius + " is " + (2*3.14*radius) );
        // System.out.println("Circumference of circle with " + fRadius + " is " + fCircumference );
        System.out.println("Circumference of circle with " + dRadius + " is " + dCircumference );

    }

}
