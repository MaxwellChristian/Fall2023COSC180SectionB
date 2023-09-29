package lo_methods;

// Write a program which takes input of a number and then
// prints the sum of all digits of that number

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String []args) {

        // input line
        Scanner inputLine= new Scanner(System.in);

        // variable to input the number
        int value ;

        // prompt the user
        System.out.println("Enter a number: ");
        value = inputLine.nextInt();

        // logic to calculate the sum of all digits
        int sumOfAllDigits = computeSumOfDigitis(value);

        System.out.println(value + " : sum of digits : " + sumOfAllDigits);

    }

}
