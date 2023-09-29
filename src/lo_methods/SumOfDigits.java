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
        int sumOfAllDigits = computeSumOfDigits(value);

        System.out.println(value + " : sum of digits : " + sumOfAllDigits);

        System.out.println(value + " : count of digits : " + countDigits(value)  );

        System.out.println(value + " : reversed : " + reverse(value)  );

    }

    static int reverse(int value){
        return 0;
    }

    private static int countDigits(int value) {
        int count;

//        for( count = 0 ; value >0 ; value/=10, count++ ){
//
//        }

        for( count = 0 ; value > 0 ; value/=10, count++ );
        {
            // this will be not a part of loop, as
            // the loop has semi-colon at the end
            // the code in curly-braces will be executed once after
            // the loop has completed
        }
        // observe the semi-colon at the end of the loop
        // it represents that the loop is empty

        return count;
    }

    private static int computeSumOfDigits(int value) {
        int sum = 0;
        while (value>0) {
            sum += ( value%10 );
            value /= 10;
        }
        return sum;
    }

}
