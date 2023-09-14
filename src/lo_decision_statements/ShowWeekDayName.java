package lo_decision_statements;

import java.util.Scanner;

public class ShowWeekDayName {

    public static void main(String []args) {

        int dayNumber;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter day number [1-7]: ");
        dayNumber = inputLine.nextInt();

        /*
        if( dayNumber == 1 ){
            System.out.println("Sunday");
        }
        else {
            if( dayNumber == 2 ){
                System.out.println("Monday");
            }
        }
        */

        // alternate approach
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                // break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Expected day numbers between 1 and 7");
                 break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        System.out.println("After all cases [out of switch]");

    }

}
