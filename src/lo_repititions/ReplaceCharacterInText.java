package lo_repititions;

/*
* Write a program which takes input of words from the user and
* after that a replaces a particular character with a different character.
* Then the program which display the new replaced string.
* */

import java.util.Scanner;

public class ReplaceCharacterInText {

    public static void main(String []args) {

        // declaration
        String inputText;
        char charToCount;
        char charToReplace;
        char replacingChar;

        // input

        // input line
        Scanner inputLine = new Scanner(System.in);

        // prompt the user to input the line of text
        System.out.print("Enter a line of text: ");
        //inputText = inputLine.next();
        inputText = inputLine.nextLine();

        // prompt the user to input the char to replace
        System.out.print("Enter the character to replace: ");
        charToReplace = inputLine.next().charAt(0);

        // prompt the user to input the replacing char
        System.out.print("Enter the new replacing character: ");
        replacingChar = inputLine.next().charAt(0);

        String replacedString = "";
        // String replacedString = new String();
        // String replacedString = new String("");


        int totalOccurences = 0;
        for( int counter = 0 ; counter < inputText.length() ; counter++ ){

            // compare the current character with the character to count
            if( inputText.charAt(counter) == charToReplace ){
                replacedString = replacedString + replacingChar;
                totalOccurences++;
            }
            else {
                replacedString = replacedString + inputText.charAt(counter);
            }

        }

//        System.out.printf("%c occurs %d times in '%s'\n", charToCount, totalOccurences, inputText);
        System.out.println("Replaced text: " + replacedString);

    }

}
