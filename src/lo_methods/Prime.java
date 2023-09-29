package lo_methods;

import java.util.Scanner;

/*
* Write a program which takes input of two numbers and
* displays all the prime numbers between those two numbers.
*
* the program should work even if the start number is larger than end number.
* The output should still be in sequence from start to end

* * All the prime numbers must be displayed on the same line as space separated.
* Make sure that there are no more than 10 numbers on each line.
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

        if( startNumber > endNumber ){
            int temp;
            temp = startNumber;
            startNumber = endNumber;
            endNumber = temp;
        }

        int lineCounter = 1;

        // smaller = Math.min(startNumber, endNumber);
        // larger = Math.max(startNumber, endNumber);
        for(
                int s = Math.min(startNumber, endNumber) ;
                s <= Math.max(startNumber, endNumber) ;
                s++ ){
            if( isPrime(s) ){
                // System.out.println(s + " : Prime");
                if( lineCounter++%10 != 0 ){
                    // the condition means
                    // lineCounter%10 != 0
                    // then lineCounter++
                    System.out.print(s + " ");
                }
                else {
                    System.out.println(s);
                }


            }
        }

        /*
        for( int n = startNumber ; n <= endNumber ; n++ ){

            /*
            boolean result = isPrime(n);

            if( result ){
                System.out.println(n + " : Prime");
            }

            if( isPrime(n) ){
                System.out.println(n + " : Prime");
            }

        }

         */


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
