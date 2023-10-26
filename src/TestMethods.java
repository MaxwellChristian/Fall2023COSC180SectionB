import user_defined_logic.MyMethods;

import java.util.Arrays;

public class TestMethods {

    public static void main(String[] args) {

        int totalValuesRequired = 10;
        int maxValuePermitted = 15;

        int []values = MyMethods.generateValues(totalValuesRequired, maxValuePermitted);
        System.out.println(Arrays.toString(values));

//        values = MyMethods.generateValues(5, 50);
//        System.out.println(Arrays.toString(values));

        // compute teh total of all values and display [using methods from your library]
        int total = MyMethods.computeTotal(values);
        System.out.println("Total : " + total);

        // write a method in your library class which
        // returns all the even values from the set of values passed as parameter
//        int []evenValues = MyMethods.filterEvenValues(values);
//        System.out.println(Arrays.toString(evenValues));

        // filter odd values
//        int []oddValues = MyMethods.filterOddValues(values);
//        System.out.println(Arrays.toString(oddValues));

        final int TYPE_EVEN = 0;
        final int TYPE_ODD = 1;

        // filtering values as per requirement
        int []filteredEvenValues = MyMethods.filterValues(values, TYPE_EVEN);
        System.out.println(Arrays.toString(filteredEvenValues));

        int []filteredOddValues = MyMethods.filterValues(values, TYPE_ODD);
        System.out.println(Arrays.toString(filteredOddValues));

        // check whether a value exists in the set
        // complete using a user-defined method from your own library class
        boolean found = MyMethods.exists(values, 3);
        System.out.println("3 exists in values: " + found);

        // fetch the index where a value exists in the set
        int indexAt = MyMethods.indexOf(3, values, 0, values.length);
        if( indexAt != -1 ){
            System.out.println("3 found at position: " + indexAt);
        }
        else {
            System.out.println("3 does not exist in the values");
        }

        // count the occurrences of a value from the set
        // complete using a user-defined method from your own library class
        int count = MyMethods.count(values, 3);
        System.out.println("3 occurs " + count + " times");

        // write a method to display a 2D array
        int [][]values2D = {
                {1, 2, 3},
                {10, 20},
                {33, 55, 77, 88}
        };
        MyMethods.showValues(values2D);

    }

}
