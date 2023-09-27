package lo_arrays;

import java.util.Arrays;
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
* sort the combined values and then display
*
* Ex:
* num1 : 5
* num2 : 7
* arr1 : [10, 78, 32]
* arr2 : [100, 78, 75, 11]
* arr3 : (10, 11, 32, 75, 78, 78, 100)
* */
public class CombineArrays3 {

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

        pos3 = 0;
        for( pos1 = 0 ; pos1 < arr1.length ; pos1++ ){
            arr3[pos3++] = arr1[pos1] = new Random().nextInt(100);
        }

        for( pos2 = 0 ; pos2 < arr2.length ; pos2++ ){
            arr3[pos3++] = arr2[pos2] = new Random().nextInt(100);
        }

        // combine the two arrays to third array
        // already copied while generating values

        // sort the values
        /*int first;
        int second;
        for( first = 0 ; first < arr3.length ; first++ ){

            for( second = first+1 ; second < arr3.length ; second++ ){

                // compare the values
                if( arr3[first] > arr3[second] ){

                    // swap the values
                    int temp;
                    temp = arr3[first];
                    arr3[first] = arr3[second];
                    arr3[second] = temp;

                }

            }

        }*/

        Arrays.sort(arr3);


        // display all arrays

        // display arr 1
        System.out.print("[");
        for (int value: arr1) {
            System.out.print(value + ", ");
        }
        System.out.print("]");
        System.out.println();

        // display arr 1
//        for (int value: arr2) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
        System.out.println( Arrays.toString(arr2) );

//        for (int value: arr3) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
        System.out.println(
                Arrays.toString(arr3)
                .replace("[", "(")
                .replace("]", ")")
        );

        // display arr 3

    }

}
