package lo_arrays;

import java.util.Random;
import java.util.Scanner;

/*
* Write a program which takes input of 2 numbers from user.
* Both the numbers must  be different.
* Create two different arrays as per the two input numbers.
* Then the program generates random numbers and stores them
* in the two arrays.
* The program should then create a 3rd array and
* store the values from array1 followed by array2 in array3
*
* Ex:
* num1 : 5
* num2 : 7
* arr1 : 10, 78, 32, 45, 11
* arr2 : 100, 78, 75, 11, 11, 78, 75
* arr3 : 10, 78, 32, 45, 11, 100, 78, 75, 11, 11, 78, 75
* */
public class CombineArrays {

    public static void main(String []args) {

        // declare sizes
        int size1;
        int size2;

        Scanner inputLine = new Scanner(System.in);

        System.out.print("Enter size 1 : ");
        size1 = inputLine.nextInt();

        System.out.print("Enter size 2 : ");
        size2 = inputLine.nextInt();

        // create arrays
        int []arr1 = new int[size1];
        int []arr2 = new int[size2];
        int []arr3 = new int[size1 + size2];

        // fill values in arrays
        int pos1;
        int pos2;
        int pos3;

        for( pos1 = 0 ; pos1 < arr1.length ; pos1++ ){
            arr1[pos1] = new Random().nextInt(100);
        }

        for( pos2 = 0 ; pos2 < arr2.length ; pos2++ ){
            arr2[pos2] = new Random().nextInt(100);
        }

        // combine the two arrays to third array

        // copy values from arr1 to arr3
        pos3 = 0 ;
        for( pos1 = 0 ; pos1 < arr1.length ; pos1++ ){
            arr3[pos3++] = arr1[pos1];
        }

        // append values from arr2 to arr3
        for( pos2 = 0 ; pos2 < arr2.length ; pos2++ ){
            arr3[pos3++] = arr2[pos2];
        }

        // display all arrays

        // display arr 1
        for (int value: arr1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // display arr 1
        for (int value: arr2) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value: arr3) {
            System.out.print(value + " ");
        }
        System.out.println();

        // display arr 3

    }

}
