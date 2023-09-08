package lo_decision_statements;

// Write a program which takes a whole number from user and checks if it is EVEN or ODD.
// Even : numbers divisible by 2
// Odd  : numbers not divisible by 2

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String []args){

        // declaration section
        int number;

        // input section
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to enter a whole number
        System.out.print("Enter any whole number: ");
        number = inputLine.nextInt();

        // ch// eck if the number is EVEN or ODD
        // Even: division by 2 returns remainder as ZERO
        // Odd : division by 2 returns remainder as NON-ZERO

        if ( (number%2) == 0 ){
            System.out.println(number + " : Even");
        }
         else {
             System.out.println(number + " : Odd");
         }

         // can also be achieved in following manner
//        if ( (number%2) != 0 ){
//            System.out.println(number + " : Odd");
//        }
//        else {
//            System.out.println(number + " : Even");
//        }

         // can also be done using a variable
        // int iResult = number % 2;
        // if ( iResult == 0 ) {
        // }

    }

}
