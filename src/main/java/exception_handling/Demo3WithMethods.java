package exception_handling;

/*
 * Write a program to
 *   - take a number as input from user and use it as an array size
 *   - create an array of size specified as input from user
 *   - initialize the array with random int upto 5
 *   - display the quotient when dividing the first index with second
 *   - repeat the division for each possible index
 * */

import java.util.Random;
import java.util.Scanner;

public class Demo3WithMethods {

    public static void main(String[] args) {

        int arrSize;
        int[] arr;

        Scanner inputLine = new Scanner(System.in);

        try {
            // input the arr size
            System.out.print("Enter arr size: ");
            arrSize = inputLine.nextInt();

            // create the array as per size
            arr = createArray(arrSize);
            System.out.println("After array creation");

            // initialize the arr [random values upto 5]
            initializeArray(arr, 5);
            System.out.println("After array initialization");

            // divide value at each index by the value at next index
            divideAndDisplay(arr);
            System.out.println("After array division and display");

            System.out.println("The program execution completed");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Bye");
        }



    }

    private static void divideAndDisplay(int[] arr) {
        for (int i = 0; i < arr.length - 2; i += 2) {

            try {
                int ans = arr[i] / arr[i + 1];
                System.out.printf("%d / %d: %d\n", arr[i], arr[i + 1], ans);
            } catch (ArithmeticException ex) {
                System.out.printf("Cannot divide by zero: Skipped : %d / %d\n", arr[i], arr[i + 1]);
            }

        }
    }

    private static void initializeArray(int[] arr, int maxValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(maxValue);
        }
    }

    private static int[] createArray(int arrSize) throws Exception {
        try {
            return new int[arrSize];
        } catch (NegativeArraySizeException nasEx) {
//            System.out.println("When creating array size must be positive");
            throw nasEx;
        }

    }

}
