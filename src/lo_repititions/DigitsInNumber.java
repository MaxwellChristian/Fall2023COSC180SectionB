package lo_repititions;

import java.util.Scanner;

public class DigitsInNumber {

    public static void main(String []y57yt54) {

        int number ;
        int numberToDisplay ;

        int countOfDigits = 0;
        int sumOfDigits = 0 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
//        number = input.nextInt();
//        numberToDisplay = number;

        numberToDisplay = number = input.nextInt();
//        numberToDisplay = number;

//        number = numberToDisplay = input.nextInt();

        while (number > 0){
            sumOfDigits += (number%10);
            countOfDigits++;
            number /= 10;
        }

        System.out.println("Total digits in " + numberToDisplay + " : " + countOfDigits);
        System.out.println("Sum of digits " + numberToDisplay + " : " + sumOfDigits);

    }

}
