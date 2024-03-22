package lo_methods;

/*
* Write a program which generates random characters as per user entered number.
*
* ex: user enter 8
* output : AoumWFxx
* */

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomCharacters {

    public static void main(String []args) {
        int number;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = inputLine.nextInt();

        int counter;

        for (counter = 1; counter <= 100 ; counter++){
            if(counter%50 != 0){
                System.out.print((char)generateRandom('A', 'Z') + " ");
            }
            else {
                System.out.println((char)generateRandom('A', 'Z'));
            }

        }

        System.out.println();

        for (counter = 1; counter <= 100 ; counter++){
            if(counter%50 != 0) {
                System.out.print((char) generateRandom('0', '9') + " ");
            }
            else {
                System.out.println((char) generateRandom('0', '9'));
            }
        }
    }

    static int generateRandom( int start, int end ){
        return new Random().nextInt(start, end+1);
    }

}
