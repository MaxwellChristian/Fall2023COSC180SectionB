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

        // fetch the index of second occurrence of 12 in the array
        // 11, 15, 12, 10, 11, 11, 12, 15, 12, 17
        int pos = fetchNthIndex(values, 12, 2);

        // ArrayUtilities.indexOf(values, 12);
    }

    private static int fetchNthIndex(int[] values, int valueToCheck, int occurenceCounter) {
        int foundTimes = 0;
        for (int position = 0; position < values.length; position++) {
            if (values[position] == valueToCheck) {

                foundTimes++;
                if(foundTimes == occurenceCounter){
                    return position;
                }


            }
        }

        return -1;
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

    private static int[][] fetchRows(int[][] values) {

        // decide the total destination rows required
        int totalDestRows = (values.length%2==0) ? (values.length/2) : (values.length/2+1) ;

        // create a new 2D array to hold the values from each even row from source values
        int [][]evenRowValues = new int[totalDestRows][0];  // total computed rows and 0 cols

        int destRow = 0;    // the destination row counter

        for(int row = 0 ; row < values.length ; row++){

            // check if the source row is even
            if( row%2 == 0 ){

                // assign the values at even row to the destination row
                evenRowValues[destRow] = values[row];

                // increment the destination row
                destRow++;
            }

        }

        // return the result values
        return evenRowValues;
    }

    public static int[] convert(int[][] values2D) {

        // count total values in 2D
        int count = 0;
        for( int []sourceRow : values2D ){
            for(int currentValue: sourceRow){
                count++;
            }
        }

        int []final1DValues = new int[count];

        int index = 0;
        for( int []sourceRow : values2D ){
            // copy values from current row to 1D array
            for(int currentValue: sourceRow){
                final1DValues[index++] = currentValue;
            }
        }

        return final1DValues;
    }

    private static int[][] convert(int[] values1D, int maxCols) {

        // decide how many rows are required in destination 2D
        int totalRowsRequired = (values1D.length % maxCols == 0) ? (values1D.length / maxCols) : (values1D.length / maxCols + 1);

        // create a 2D array with desired rows and each row having maxCols
        int[][] values2D = new int[totalRowsRequired][maxCols];

        int sourceIndex = 0;  // index to fetch the value from 1D array

        // iterate on each row
        for (int row = 0; row < values2D.length; row++) {

            // fetch the values from the current row
            int[] tempRow = new int[maxCols];

            int totalValuesCopied;  // count of total values copied

            for (totalValuesCopied = 0; totalValuesCopied < maxCols && sourceIndex < values1D.length; totalValuesCopied++) {
                tempRow[totalValuesCopied] = values1D[sourceIndex++];
            }

            // assign the total values required to the destination row
            values2D[row] = Arrays.copyOf(tempRow, totalValuesCopied);
        }

        return values2D;
    }

}
