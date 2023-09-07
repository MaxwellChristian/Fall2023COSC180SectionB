package lo_decision_statements;

// Write a program to find the larger of two numbers provided by user

import java.util.Scanner;

public class LargerOfTwo {

    public static void main(String []args) {

        // declaration section
        int num1;
        int num2;

        // input section

        Scanner inputLine = new Scanner(System.in);

        // input number 1
        System.out.print("Enter num 1: ");
        num1 = inputLine.nextInt();

        // input number 2
        System.out.print("Enter num 2: ");
        num2 = inputLine.nextInt();

        // check for larger value
        if( num1 > num2 ){
            System.out.println(num1 + " is larger");
        }
        else {
            System.out.println("In FALSE");
            System.out.println(num2 + " is larger");
        }

        System.out.println("Done");

    }

}
