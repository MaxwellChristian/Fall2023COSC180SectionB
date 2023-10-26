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

        // count the occurrences of a value from the set
        // complete using a user-defined method from your own library class

        // write a method to display a 2D array

    }

}
