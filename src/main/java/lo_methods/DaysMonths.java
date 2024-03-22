package lo_methods;

import java.util.Calendar;
import java.util.Scanner;

public class DaysMonths {

    public static void main(String []args){

        int year;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = inputLine.nextInt();

        int daysInYear = numberOfDaysInYear(year);

        System.out.println(year + " has " + daysInYear + " days");

    }

    private static int numberOfDaysInYear(int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);

        return cal.getActualMaximum(Calendar.DAY_OF_YEAR);

    }

}
