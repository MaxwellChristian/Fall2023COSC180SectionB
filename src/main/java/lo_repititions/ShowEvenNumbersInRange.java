package lo_repititions;

import java.util.Scanner;

public class ShowEvenNumbersInRange {

    public static void main(String []args){

        int rangeStart;
        int rangeEnd;
        int counter ;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        rangeStart = inputLine.nextInt();

        System.out.println("Enter end   of range: ");
        rangeEnd = inputLine.nextInt();

        if( rangeStart <= rangeEnd ){

            // achieving the solution using do - while
            // do-while : is an exit controlled loop
            // so do-while will have at least one cycle of execution

            counter = rangeStart;   // start point
            do {

                // check whether the current number is even or not
                // display only if it is even
                if( counter%2 == 0 ){
                    System.out.println(counter);
                }

                counter++;  // the change point

            } while ( counter <= rangeEnd ) ;   // the end point

        }
        else {
            System.out.println("Start must be less than end");
        }



    }

}
