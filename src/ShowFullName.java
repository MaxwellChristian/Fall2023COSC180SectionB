
// Input first and last name from the user and display
// the full name as last name followed by first name

import java.util.Scanner;

public class ShowFullName {

    public static void main(String []args) {

        // declaration section
        String firstName;
        String lastName;

        // input section

        // set up the scanner to capture the input
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to enter first name
        System.out.print("Enter first name: ");
        firstName = inputLine.next();
        // next() can capture ONLY a single word
        // [will terminate either on input of ENTER or SPACE]

        // prompt the user to enter last name
        System.out.print("Enter last name: ");
        lastName = inputLine.next();

        // output section
        System.out.println(lastName + " " + firstName);

    }

}
