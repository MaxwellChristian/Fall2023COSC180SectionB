package lo_sorting;

import java.util.Arrays;

public class SortingMethods {

    public static void selectionSort(int[] values) {

//        for (int i= 0 ; i < values.length ; i++) {
//
//            int minIndex = i;
//            for( int j = i+1 ; j < values.length ; j++ ){
//
//                if( values[j] < values[minIndex] ){
//                    minIndex = j;
//                }
//
//            }
//
//            // check if the swap is required
//            if( minIndex != i ){
//                int temp;
//                temp = values[i];
//                values[i] = values[minIndex];
//                values[minIndex] = temp;
//
////                System.out.println(Arrays.toString(values) + " " + "swapped positions " + i + ", " + minIndex);
//            } else {
////                System.out.println(Arrays.toString(values) + " " + "no swap performed");
//            }
//
//
//
//        }

        selectionSort(values, values.length, 0);

    }

    // recursive version
    private static void selectionSort(int[] iValues, int length, int startIndex) {
        // Return when starting and size are same
        if (startIndex == length)
            return;

        // calling minimum index function for minimum index
        int minIndex = minIndex(iValues, startIndex, length - 1);

        // Swapping when index and minimum index are not same
        if (minIndex != startIndex) {
            // swap
            swap(iValues, minIndex, startIndex);
        }

        // Recursively calling selection sort function
        selectionSort(iValues, length, startIndex + 1);
    }

    // iterative version
    public static void insertionSort(int[] values) {

        int currentIndex;
        int shiftingIndex;

        for (currentIndex = 1; currentIndex < values.length; currentIndex++) {

            int currentValue = values[currentIndex];

            for (shiftingIndex = currentIndex - 1;
                 shiftingIndex >= 0 && values[shiftingIndex] > currentValue;
                 shiftingIndex--) {

                values[shiftingIndex + 1] = values[shiftingIndex];
            }

            values[shiftingIndex + 1] = currentValue;
        }

    }

    // recursive version
    public static void insertionSort(int[] values, int length) {

        // base case
        if (length <= 1) {
            return;
        }

        // sort first n-1 values
        insertionSort(values, length - 1);

        // insert last element in the current position in sorted array
        int lastValue = values[length - 1];

        // shift the values[0 .. length-1], which are larger than last value,
        // to one index ahead of their current position
        int shiftingIndex;
        for (shiftingIndex = length - 2;
             shiftingIndex >= 0 && values[shiftingIndex] > lastValue;
             shiftingIndex--) {

            values[shiftingIndex + 1] = values[shiftingIndex];
        }

        values[shiftingIndex + 1] = lastValue;

    }

    public static void mergeSort(int[] values) {

        // base case
        if (values.length > 1) {

            // merge sort the left half of the list
            int[] leftList = new int[values.length / 2];
            System.arraycopy(values, 0, leftList, 0, values.length / 2);
            mergeSort(leftList);

            // merge sort the second half of the list
            int[] rightList = new int[values.length - values.length / 2];
            System.arraycopy(values, values.length / 2, rightList, 0, (values.length - values.length / 2));
            mergeSort(rightList);

            // merge first and second halves into a single list
            merge(leftList, rightList, values);
        }

    }

    private static void merge(int[] leftList, int[] rightList, int[] finalList) {

        int currentLeft = 0;
        int currentRight = 0;
        int currentFinal = 0;

        // compare each value from both lists
        while (currentLeft < leftList.length && currentRight < rightList.length) {

            // copy the smaller value to the final list
            if (leftList[currentLeft] < rightList[currentRight]) {
                finalList[currentFinal++] = leftList[currentLeft++];
            } else {
                finalList[currentFinal++] = rightList[currentRight++];
            }

        }

        // copy the remaining values from left list
        // [as they are smaller than values in right list]
        while (currentLeft < leftList.length) {
            finalList[currentFinal++] = leftList[currentLeft++];
        }

        // copy the remaining values from the right list
        while (currentRight < rightList.length) {
            finalList[currentFinal++] = rightList[currentRight++];
        }
    }

    private static int minIndex(int[] iValues, int startIndex, int endIndex) {
        if (startIndex == endIndex)
            return startIndex;

        // Find minimum of remaining elements
        int indexOfMin = minIndex(iValues, startIndex + 1, endIndex);

        // Return minimum of current and remaining.
        return (iValues[startIndex] < iValues[indexOfMin]) ? startIndex : indexOfMin;
    }

    public static void swap(int[] iValues, int index1, int index2) {
        iValues[index1] = iValues[index1] + iValues[index2];
        iValues[index2] = iValues[index1] - iValues[index2];
        iValues[index1] = iValues[index1] - iValues[index2];
    }

}
