package lo_arrays;

/*
* Write a program which takes an input of some words (a line of text) from
* the user and then display the count of
* digits, alphabets, special characters, lower case and upper case.
*
* e.g.: Hello World !! Today is 2023-09-22
* Alphabets : 17
* Digits : 8
* Special characters : 4
* Upper case : 3
* Lower case : 14
* */

import java.util.Scanner;

public class TextStatistics {

    public static void main(String []args){

        String text;
        int counter;

        int alphabets = 0;
        int digits = 0;
        int specials = 0;
        int lower = 0;
        int upper = 0;

        // input the text
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter the text: ");
        text = inputLine.nextLine();

        char ch;
        for (counter = 0 ; counter < text.length() ; counter++ ) {

            ch = text.charAt(counter);

            if( Character.isDigit(ch) ){
                digits++;
            }
            else {
                if( Character.isAlphabetic(ch) ){

                    if( Character.isLowerCase(ch) ){
                        lower++;
                    }
                    else {
                        upper++;
                    }

                }
                else {
                    specials++;
                }
            }

        }

        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Lower case: " + lower);
        System.out.println("Upper case: " + upper);
        System.out.println("Special symbols: " + specials);

    }

}
