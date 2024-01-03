package exception_handling;

/*
* Write a program to
*   - take a number as input from user and use it as an array size
*   - create an array of size specified as input from user
*   - initialize the array with random int upto 5
*   - display the quotient when dividing the first index with second
*   - repeat the division for each possible index
* */

import java.util.Scanner;

public class Demo2 {

    public static void main( String []args ) {

        int arrSize;
        int []arr;

        Scanner inputLine = new Scanner(System.in);

        // input the arr size
        System.out.print("Enter arr size: ") ;
        arrSize = inputLine.nextInt();

        // create the array as per size
        arr = new int[arrSize];

        // initialize the arr [random values upto 5]
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = (int) Math.random()%5;
        }

        // divide value at each index by the value at next index
        for (int i = 0 ; i < arr.length ; i+=2) {
            int ans = arr[i] / arr[i+1];
            System.out.printf("%d / %d: %d\n", arr[i], arr[i+1], ans);
        }

    }

}
