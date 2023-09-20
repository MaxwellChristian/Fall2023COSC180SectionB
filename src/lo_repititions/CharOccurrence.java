package lo_repititions;

/*
* Write a program which takes input of words from the user and
* after that a character input.
* Then the program which display the count of the character from
* the given words.
* */

import java.util.Scanner;

public class CharOccurrence {

    public static void main(String []args) {

        // declaration
        String inputText;
        char charToCount;

        // input

        // input line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to input the line of text
        System.out.print("Enter a line of text: ");
        //inputText = inputLine.next();
        inputText = inputLine.nextLine();

        // prompt the user to input the char to count from the text
        System.out.print("Enter a character: ");
        charToCount = inputLine.next().charAt(0);

        int totalOccurences = 0;
        for( int counter = 0 ; counter < inputText.length() ; counter++ ){

            // compare the current character with the character to count
            if( inputText.charAt(counter) == charToCount ){
                totalOccurences++;
            }

        }

        System.out.printf("%c occurs %d times in '%s'\n", charToCount, totalOccurences, inputText);

    }

}
