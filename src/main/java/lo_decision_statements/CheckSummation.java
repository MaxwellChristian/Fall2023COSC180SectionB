package lo_decision_statements;

import java.util.Scanner;

/*
Write a program which prompts the user to enter two numbers and
the addition value of the two numbers. The program should
check whether the provided addition values is correct or not.
 */
public class CheckSummation {

    public static void main(String []args) {

        // declaration section
        int number1;
        int number2;
        int summationValue;

        boolean checkResult;
        // boolean data type is used to store 'true' or 'false'
        // it can store any ONE of that.
        // Cannot have BOTH.

        // e.g.: checkResult = true
        // e.g.: checkResult = false

        // input section
        Scanner inputLine = new Scanner(System.in);

        // prompt the user for first number
        System.out.print("Enter number 1: ");
        number1 = inputLine.nextInt();

        // prompt the user for second number
        System.out.print("Enter number 2: ");
        number2 = inputLine.nextInt();

        // prompt the user for addition value of number 1 and number 2
        System.out.print("What is the summation of " + number1 + " + " + number2 + " : ");
        summationValue = inputLine.nextInt();

        // expected output sample
        // assuming number 1 is 5 and number 2 is 3 and addition value is 8
        // output should be : addition of 5 and 3 = 8 is true

        // = : known as assignment operator
        // == : comparison operator

        // the following condition in if statement is used for comparing
        // the summation value with the addition of the numbers provided
        /*
        if( summationValue == (number1+number2) ){
            System.out.println("Addition of " + number1 + " + " + number2 + " = " + summationValue + " is true");
        }
        else {
            System.out.println("Addition of " + number1 + " + " + number2 + " = " + summationValue + " is false");
        }
         */

        // the following assignment will store either true or false in checkResult because
        // the condition has comparison operator
        checkResult = ( summationValue == (number1+number2) );
        System.out.println("Addition of " + number1 + " + " + number2 + " = " + summationValue + " is " + checkResult);
    }

}
