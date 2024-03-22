package lo_arrays;

import java.util.Random;

/*
* Write a program which generates 200 random numbers and
* then after generating all numbers it will
* display the list of all numbers divisible by 5
* and also the numbers which are not divisible by 5
* */
public class CheckForMultiplesOf5 {

    public static void main(String []args) {

        final int TOTAL_NUMBERS = 200;
        int generatedRandomNumber;

        int []arrEven = new int[TOTAL_NUMBERS];
        int evenCounter = 0;

        int []arrOdd = new int[TOTAL_NUMBERS];
        int oddCounter = 0;

        // logic to generate 100 random numbers
        int counter;
        for(counter = 1 ; counter <= TOTAL_NUMBERS ; counter++){

            // generatedRandomNumber = (int) (Math.random()*100);

            // another approach to generate a single random number
            // the following version will return a number between 0 and 99
            // generatedRandomNumber = new Random().nextInt(100);

            // another approach to generate a single random number
            // the following version will return a number between 100 and 199
            generatedRandomNumber = new Random().nextInt(100, 200);

            if( generatedRandomNumber%5 == 0 ){
                // store to the list of multiples of 5
                // increment the list for next position [for 5]

                arrEven[evenCounter++] = generatedRandomNumber;
            }
            else {
                // store to the list of non-multiples of 5
                // increment the list for next position [for non-5]

                arrOdd[oddCounter++] = generatedRandomNumber;
            }

        }

        // print all multiples of 5
        System.out.print("Multiples of 5: ");
        for(int value: arrEven) {
            System.out.print(value + " ");
        }
        System.out.println();

        // print all non-multiples of 5
        System.out.print("Non-Multiples of 5: ");
        for(int value: arrOdd) {
            System.out.print(value + " ");
        }
        System.out.println();

        // printing using usual for loop

        // print all multiples of 5
        System.out.print("Multiples of 5: ");
        for(counter = 0 ; counter < evenCounter ; counter++) {
            System.out.print(arrEven[counter] + " ");
        }
        System.out.println();

        // print all non-multiples of 5
        System.out.print("Non-Multiples of 5: ");
        for(counter = 0 ; counter < oddCounter ; counter++) {
            System.out.print(arrOdd[counter] + " ");
        }
        System.out.println();
    }

}
