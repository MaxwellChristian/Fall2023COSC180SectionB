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

//        position--;
//        for(int newPosition=0 ; newPosition < revArr.length ; newPosition++){
//            revArr[newPosition] = arr[position];
//            position--;
//        }

        // another approach of copy
        int newPosition = 0;
        for(position-- ;  position >= 0 ; position--){
//            revArr[newPosition] = arr[position];
//            newPosition++;

            // same as above
            // i.e. it will use newPosition and then increment newPosition
            // because it is POSTFIX
            revArr[newPosition++] = arr[position];

            // the following is not the same
            // revArr[++newPosition] = arr[position];
        }

        // display the copied array
        for (position = 0 ; position < revArr.length ; position++){
            System.out.println("Value[" + position + "] : " + revArr[position]);
        }

        // display performed using the for each style
        // works as following:
        // takes values from the array [one by one] and
        // stores them into the currentValue and uses in the loop
        // automatically starts from the first element in the collection and
        // steps over to the next value and
        // repeats till the end of the collection
        for (int currentValue : revArr) {
            System.out.println(currentValue);
        }

    }

}
