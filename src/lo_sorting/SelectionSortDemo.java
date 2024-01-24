package lo_sorting;

import java.util.Arrays;

/*
* Re-write/modify the code to show the output after each pass.
* Also, write a new recursive method for selection sort.
* */

public class SelectionSortDemo {

    public static void main(String []args) {

        int []values = {18, 958, 23, 594, 3, 8, -8, 78};

        System.out.println(Arrays.toString(values));

        selectionSort(values);

        System.out.println(Arrays.toString(values));

    }

    private static void selectionSort(int[] values) {

        for (int i= 0 ; i < values.length ; i++) {

            int minIndex = i;
            for( int j = i+1 ; j < values.length ; j++ ){

                if( values[j] < values[minIndex] ){
                    minIndex = j;
                }

            }

            // check if the swap is required
            if( minIndex != i ){
                int temp;
                temp = values[i];
                values[i] = values[minIndex];
                values[minIndex] = temp;
            }

        }
    }

}
