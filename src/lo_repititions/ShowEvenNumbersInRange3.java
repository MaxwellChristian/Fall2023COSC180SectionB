package lo_repititions;

import java.util.Scanner;

public class ShowEvenNumbersInRange3 {

    public static void main(String[] args) {

        int rangeStart;
        int rangeEnd;
        int counter;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        rangeStart = inputLine.nextInt();

        System.out.println("Enter end   of range: ");
        rangeEnd = inputLine.nextInt();


        // achieving the solution using for
        // for : is an entry controlled loop
        // so while may or may not have cycle of execution [depending on entry condition]

        // for has the syntax as
        // for( start point ; condition/end-point ; change point ) {
        // }

        /*
        counter = rangeStart;   // start point
        // only done once before the loop start

        while (counter <= rangeEnd) { // the entry condition, checked every time the loop works

            // check whether the current number is even or not
            // display only if it is even
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter++;  // the change point, performed every time the loop works
            // i.e., incrementing the step by 1 which can be written as
            // counter = counter + 1
            // or counter += 1
            // or counter++ [only when incrementing by 1]
            // or ++counter [only when incrementing by 1]

        } // the end point
        */


        for ( counter = rangeStart; counter <= rangeEnd ; counter++ ) { // the entry condition

            // check whether the current number is even or not
            // display only if it is even
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            // i.e., incrementing the step by 1 which can be written as
            // counter = counter + 1
            // or counter += 1
            // or counter++ [only when incrementing by 1]
            // or ++counter [only when incrementing by 1]

        } // the end point


    }

}
