package lo_decision_statements;

/*
Write a program which takes input of a number from the user and
displays whether the number is positive or negative
 */

import java.util.Scanner;

public class PositiveNegativeCheck {

    public static void main(String []args) {

        // declaration section
        double number;

        // input section
        Scanner inputLine = new Scanner(System.in);

        // prompt the user for input of a number
        System.out.print("Enter any number: ");
        number = inputLine.nextDouble();

        // check and display whether the number is positive or negative
        if (number > 0) {
            System.out.println(number + " : positive");
        }
        else {
            System.out.println(number + " : negative");
        }

        // below is a list of relational operators
        // > : greater than
        // < : less than
        // == : comparison
        // >= : greater than or equals to
        // <= : less than or equals to
        // != : not equals to

    }

}
