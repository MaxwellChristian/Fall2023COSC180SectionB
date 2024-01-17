package lo_sorting;

import java.util.Arrays;

public class BubbleSortDemo {

    public static void main(String[] args) {

        int[] iValues = {5, 1, 4, 18, 24, 7, 9};

        System.out.println("Before sorting : " + Arrays.toString(iValues));

        bubbleSort(iValues);

        System.out.println("After sorting  : " + Arrays.toString(iValues));

    }

    private static void bubbleSort(int[] iValues) {

        for (int i = 0; i < iValues.length; i++) {

            for (int j = 0; j < iValues.length - 1; j++) {

                // compare the adjacent values
                if (iValues[j] > iValues[j + 1]) {
                    // swap the values
                    int temp;
                    temp = iValues[j];
                    iValues[j] = iValues[j + 1];
                    iValues[j + 1] = temp;
                }

            }

            System.out.println("In sort: Pass " + i + " : " + Arrays.toString(iValues));

        }

    }

}
