package lo_arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String []args){

        int []arr = new int[5];
        int []revArr = new int[5];

        int position;

        // input the values in array
        Scanner input = new Scanner(System.in);

        for (position = 0 ; position < arr.length ; position++){
            System.out.print("Enter value " + (position) + " : ");
            arr[position] = input.nextInt();
        }

        // copy the values to another array in reverse order
        // i.e., copying the last element to the first position in new array
        // i.e., copying the second to the last element to the second position in new array

        position--;
        for(int newPosition=0 ; newPosition < revArr.length ; newPosition++){
            revArr[newPosition] = arr[position];
            position--;
        }

        // display the copied array


    }

}
