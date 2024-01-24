package lo_sorting;

import java.util.Arrays;

public class MergeSortDemo {

    public static void main(String []args) {

        int []values = {18, 958, 23, 594, 3, 8, -8, 78};

        System.out.println(Arrays.toString(values));

        SortingMethods.mergeSort(values);

        System.out.println(Arrays.toString(values));

    }

}
