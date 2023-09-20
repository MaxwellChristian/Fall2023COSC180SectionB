package lo_repititions;

/*
 * Write a program which displays all multiples of 5 between
 * the range provided by user
 * */

import java.util.Scanner;

public class MultiplesOf5 {

    public static void main(String[] args) {

        // input line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user for the start value
        System.out.print("Enter the start value: ");
        int startValue = inputLine.nextInt();

        // prompt the user for the start value
        System.out.print("Enter the end value: ");
        int endValue = inputLine.nextInt();

        // logic as per requirement
        // starting value
        int counter = startValue;

        // check condition
        while (counter <= endValue) {

            // check if the current value is a multiple of 5
            if (counter != 0 && counter % 5 == 0) {
                System.out.println(counter);
            }

            // change part
            counter += 1;
        }

        if( counter == startValue ){
            System.out.println("Double check your range values.");
        }



    }

}
