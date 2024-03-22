package lo_sorting;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] iValues = {5, 1, 4, 18, 24, 7, 9};

        System.out.println("Before sorting : " + Arrays.toString(iValues));

        bubbleSort(iValues);
//        bubbleSortR(iValues, iValues.length);

        System.out.println("After sorting  : " + Arrays.toString(iValues));

    }

    private static void bubbleSort(int[] iValues) {

        for (int i = 0; i < iValues.length; i++) {

            System.out.printf("Pass %d [%d -> %d]: ", i, 0, iValues.length-1-i);

            int totalSwaps = 0;
            for (int j = 0; j < iValues.length - i - 1; j++) {

                // compare the adjacent values
                if (iValues[j] > iValues[j + 1]) {
                    // swap the values
                    swap(iValues, j, j+1);

                    totalSwaps++;
                }

            }

            System.out.printf(" : %s [Total swaps %d]\n", Arrays.toString(iValues), totalSwaps);

        }

    }

    private static void swap(int[] iValues, int index1, int index2) {
        int temp;

        temp = iValues[index1];
        iValues[index1] = iValues[index2];
        iValues[index2] = temp;
    }

    private static void bubbleSortR(int[] iValues, int length) {
        if (length == 1) {
            return;
        }

        int count = 0;
        for (int i = 0; i < iValues.length - 1; i++) {
            if (iValues[i] > iValues[i + 1]) {
                int temp;
                temp = iValues[i];
                iValues[i] = iValues[i + 1];
                iValues[i + 1] = temp;

                count = count + 1;
            }
        }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return;

        // Largest element is fixed,
        // recur for remaining array
        bubbleSortR(iValues, iValues.length - 1);
    }

}
