package lo_decision_statements;

// Write a program to
// find/compute/calculate and
// display the area of a circle with radius provided by user

// ensure that the user has entered appropriate value of radius

import java.util.Scanner;

public class AreaOfCircle {

    // starting point
    public static void main(String []args) {

        // declaration section
        double dRadius;
        double dArea;

        // input section

        // input radius from user
        Scanner inputLine = new Scanner(System.in);

        // 2. capture the input provided by user
        // 2.1 prompt the user for input
        System.out.print("Enter the radius: ");

        // 2.2 capture the user input
        dRadius = inputLine.nextDouble();

        // processing section

        // check whether the radius is positive

        System.out.println("Before checking");

        if ( dRadius > 0 ) {
            // true part

            System.out.println("Condition is TRUE");

            dArea = 3.14 * dRadius * dRadius;

            // output section
            System.out.println("Area of circle with radius " + dRadius + " is " + dArea );
        }
        /*
        else {
            // false part

            System.out.println("Condition is FALSE");

            // if not positive, provide an appropriate message to the user
            System.out.println("That radius needs to be positive");
        }
        */

        System.out.println("After IF-ELSE checking");

    }

}
