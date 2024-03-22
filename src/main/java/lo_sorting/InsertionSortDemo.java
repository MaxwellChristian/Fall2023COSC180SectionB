package lo_sorting;

import java.util.Arrays;

public class InsertionSortDemo {

    public static void main(String []args) {

        int []values = {18, 958, 23, 594, 3, 8, -8, 78};

        System.out.println(Arrays.toString(values));

        SortingMethods.insertionSort(values, values.length);

        System.out.println(Arrays.toString(values));

    }

}
