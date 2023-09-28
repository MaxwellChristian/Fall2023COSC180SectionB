package lo_methods;

import java.util.Scanner;

/*
* Write a program which takes input of two numbers and
* displays all the prime numbers between those two numbers.
*
* Prime numbers are divisible ONLY by 1 and itself.
* i.e., it does not have any factors other than 1 and itself.
* */
public class Prime {

    public static void main(String  []args){

        int startNumber;
        int endNumber;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter start number: ");
        startNumber = inputLine.nextInt();

        System.out.print("Enter end number: ");
        endNumber = inputLine.nextInt();

        for( int n = startNumber ; n <= endNumber ; n++ ){

            /*
            boolean result = isPrime(n);

            if( result ){
                System.out.println(n + " : Prime");
            }
*/
            if( isPrime(n) ){
                System.out.println(n + " : Prime");
            }

        }


    }

    private static boolean isPrime(int value) {

        for( int divisor = 2 ; divisor < value ; divisor++ ){
            if( value % divisor == 0 ){
                return false;
            }
        }

        return true;
    }

}
