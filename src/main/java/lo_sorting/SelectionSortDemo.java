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

        SortingMethods.selectionSort(values);

        System.out.println(Arrays.toString(values));

    }

}
