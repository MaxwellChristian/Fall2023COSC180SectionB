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

    }

}
