import java.util.Scanner;

/*
Write a program which let user provide the current year and
the year of birth and displays the user's age in years
 */
public class ComputeAge1 {

    public static void main(String []args) {

        // declaration section

        int currentYear; // for the current year

        // for the year of birth
        int yearOfBirth;

        // input section

        // configure the input line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to input the current year
        System.out.print("Enter current year: ");
        // capture the current year
        currentYear = inputLine.nextInt();

        // prompt the user to input the year of birth
        System.out.print("Enter birth year: ");
        // capture the birth year
        yearOfBirth = inputLine.nextInt();

        // processing section

        // compute the age in years
        int ageInYears;
        ageInYears = currentYear - yearOfBirth ;

        // output section
        System.out.println("Age in years: " + ageInYears);
    }

}
