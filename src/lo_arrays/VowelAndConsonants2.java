package lo_arrays;

/*
* Write a program which takes an input of some words (a line of text) from
* the user and then display the list of vowels and consonants from the text.
* the vowels and consonants must be displayed on separate lines.
* The vowels must be displayed using SPACE.
* The consonants must be displayed using the COMMA.
*
* e.g.: HELLO WORLD
* Vowels : E O O
* Consonants : H,L,L,W,R,L,D
* */

import java.util.Scanner;

public class VowelAndConsonants2 {

    public static void main(String []args){

        String text;
        int counter;

        char []vowels;
        int vowelCounter = 0;

        char []consonants;
        int consonantCounter = 0;

        // input the text
        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter the text: ");
        text = inputLine.nextLine();

        vowels = new char[text.length()];
        consonants = new char[text.length()];

        // extract each character from the text and
        // check for vowel or consonant
        // try to ignore special characters, non-printable characters in check
        for (counter = 0 ; counter < text.length() ; counter++ ) {

            if( Character.isAlphabetic(text.charAt(counter)) ){

                if( "aeiouAEIOU".indexOf(text.charAt(counter)) != -1 ){
                    vowels[vowelCounter++] = text.charAt(counter);
                }
                else {
                    consonants[consonantCounter++] = text.charAt(counter);
                }

            }

        }

        // display all vowels
        System.out.print("Vowels : ");
        for (counter=0 ; counter < vowelCounter ; counter++){
            System.out.print(vowels[counter] + " ");
        }

        // an empty line
        System.out.println();

        // display all consonants
        System.out.print("Consonants : ");
        for (counter=0 ; counter < consonantCounter ; counter++){

            // counter < consonantCounter (4 < 5)
            // counter <= (consonantCounter-1) ( 4 <= (5-1) )

//            if(counter <= (consonantCounter-2)){
//                System.out.print(consonants[counter] + ",");
//            }
//            else {
//                System.out.print(consonants[counter] + "");
//            }

            System.out.print( consonants[counter] + ((counter <= consonantCounter-2) ? "," : "") );

        }

    }

}
