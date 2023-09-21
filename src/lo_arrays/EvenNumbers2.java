package lo_arrays;

import java.util.Scanner;

/*
* Write a program which lets the user to enter a number and then
* asks the user's choice to continue. 1 for yes and 0 for no.
* Repeat the input till the user enters 1.
* After all the inputs i.e., user enters 0 for choice, the program
* should display a list of all even numbers on the same line separated by space.
*
* Restrict the user to enter not more than 50 numbers.
* */
public class EvenNumbers2 {

    public static void main(String []args){

        final int MAX_VALUES_ALLOWED = 50;

        int [] values = new int[MAX_VALUES_ALLOWED];
        int valueIndex = 0;

        int [] evenValues = new int[MAX_VALUES_ALLOWED];
        int evenValueIndex = 0;

        Scanner input = new Scanner(System.in);

        int choiceToContinue;
        do {

            System.out.print("Enter a number: ");
            values[valueIndex] = input.nextInt();
//            valueIndex++;
//
//            if(values[valueIndex-1]%2 == 0){
//                evenValues[evenValueIndex] = values[valueIndex-1];
//                evenValueIndex++;
//            }

            if(values[valueIndex]%2 == 0){
                evenValues[evenValueIndex] = values[valueIndex];
                evenValueIndex++;
            }
            valueIndex++;

            System.out.println("Continue [1: yes / 0: no] : ");
            choiceToContinue = input.nextInt();

        } while (choiceToContinue == 1);

        // display all even values
        for( int index = 0 ; index < evenValueIndex ; index++ ){
            System.out.print( evenValues[index] + " " );
        }
        System.out.println();

    }

}
