package lo_repititions;

// Capture an int number from the user ,
// and check if it is even or odd.
// Let the user input 5 times.

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {

        int num;
        int counter;

        // input
        Scanner inputLine = new Scanner(System.in);

        counter = 1;     // start point
        // start point must always be outside/before the repetition

        do {
            // all the statements between do { } while
            // will be executed till the condition is true

            // prompt the user

            System.out.print("Enter an int number: ");
            num = inputLine.nextInt();

            // check and display even or odd
            if (num % 2 == 0) {
                System.out.println(num + " : Even");
            } else {
                System.out.println(num + " : Odd");
            }

            counter++;  // step/move point
            // step/move point should always be inside the repetition

            // the expected logic ends here,
            // then it should go back to the input prompt

        } while (counter <= 5); // end point

        // another example
        // display all alternate numbers between 5 and 500 in reverse order

        counter = 500;
        do {

            System.out.print(counter + " ");

            counter-=2;


        } while ( counter >= 5 );

        // reminder note:

        // every loop should have the following:
        // 1. a start point [usually before the loop]
        // 2. a change point [always inside the loop]
        // 3. a stop point [to terminate the loop]

    }

}
