package lo_methods;

import java.util.Arrays;

public class ArraysAndMethods {

    public static void main(String[] args) {

        //int []values = {1, 0, 1, 1, 1, 0, 1};

        // invoke/call a method which will return an array filled with random values
        int[] values = generateRandomArray(20, 2);

        // print the generated array
        System.out.println(Arrays.toString(values));

        int maxValueRequired = 100;
        values = generateRandomArray(20, maxValueRequired);
        System.out.println(Arrays.toString(values));

        if (indexOf(values, 12) != -1) {
            System.out.println("Array contains 12");
        } else {
            System.out.println("Array does not contain 12");
        }

        // write a method which will return the position where a
        // value is found in the array
        int foundAtPosition = indexOf(values, 12);
        if (foundAtPosition != -1) {
            System.out.println("12 exists at: " + foundAtPosition);
        } else {
            System.out.println("12 not found in the array");
        }

        int lastIndex = lastIndexOf(values, 12);

    }

    private static int lastIndexOf(int[] values, int valueToCheck) {
        for (int position = values.length - 1; position >= 0; position--) {
            if (values[position] == valueToCheck) {
                return position;
            }
        }

        return -1;
    }

    private static int indexOf(int[] values, int valueToCheck) {

        for (int position = 0; position < values.length; position++) {
            if (values[position] == valueToCheck) {
                return position;
            }
        }

        return -1;
    }

    private static int[] generateRandomArray(int totalValuesToGenerate, int maxValueRequired) {

        int[] values = new int[totalValuesToGenerate];

        for (int position = 0; position < totalValuesToGenerate; position++) {
            values[position] = (int) (Math.random() * maxValueRequired);
        }
        return values;
    }

}
