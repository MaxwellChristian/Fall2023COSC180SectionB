package user_defined_logic;

import java.util.Arrays;

public class MyMethods {


    private static void test(){}
    private static void test(int x){}

    private static void test(int x, int y){}
    private static void test(char x, char y){}
    private static void test(int x, char y){}
    private static void test(char x, int y){}

    // the following is not permitted as it has change only in the return type
    // private static int test(char x, int y){}

    public static int[] generateValues(int totalValuesRequired, int maxValuePermitted) {

        int []values = new int[totalValuesRequired];

        for( int index = 0 ; index < totalValuesRequired ; index++ ){
            values[index] = (int) (Math.random() * maxValuePermitted);
        }

        return values;
    }

    public static int[][] generateValues(int rows, int cols, int maxRandomNumber) {

        int [][]matrix = new int[rows][cols];

        for( int r = 0 ; r < rows ; r++ ){
            for( int c = 0 ; c < cols ; c++ ){
                matrix[r][c] = (int) (Math.random()*maxRandomNumber);
            }
        }

        return matrix;
    }

    public static int computeTotal(int[] values) {
        int total = 0 ;
        for( int currentValue: values ){
            total += currentValue;
        }
        return total;
    }

    private static int[] filterEvenValues(int[] values) {

        int []filteredValues = new int[values.length];
        int destIndex = 0;

        for( int index = 0 ; index < values.length ; index++ ){
            if( values[index] != 0 && values[index] % 2 == 0 ){
                filteredValues[destIndex] = values[index];
                destIndex++;
            }
        }

        // trim the dest array upto the value of destIndex
        return Arrays.copyOfRange(filteredValues, 0, destIndex);
    }

    private static int[] filterOddValues(int[] values) {
        int []filteredValues = new int[values.length];
        int destIndex = 0;

        for( int index = 0 ; index < values.length ; index++ ){
            if( values[index] != 0 && values[index] % 2 != 0 ){
                filteredValues[destIndex] = values[index];
                destIndex++;
            }
        }

        // trim the dest array upto the value of destIndex
        return Arrays.copyOfRange(filteredValues, 0, destIndex);
    }

    public static int[] filterValues(int[] values, int typeOfFilter) {

        switch ( typeOfFilter ) {
            case 0:
//                for( int index = 0 ; index < values.length ; index++ ){
//                    if( values[index] != 0 && values[index] % 2 == 0 ){
//                        filteredValues[destIndex] = values[index];
//                        destIndex++;
//                    }
//                }
                return filterEvenValues(values);
//                break;

            case 1:
                return filterOddValues(values);
//                break;

        }

        return values;
    }

    public static boolean exists(int[] values, int valueToCheck) {

        for( int currentValue: values ){
            if( currentValue == valueToCheck ){
                return true;
            }
        }

        return false;
    }

    public static int count(int[] values, int valueToCount) {

        int count = 0;

        for( int currentValue: values ){
            if( currentValue == valueToCount ){
                count++;
            }
        }

//        int startIndex = -1 ;
//        while( (startIndex = indexOf(valueToCount, values, startIndex+1, values.length)) != -1 ){
//            count++;
//        }

        return count;
    }

    public static void showValues(int[][] values) {
        for( int row = 0 ; row < values.length ; row++ ){
            System.out.println(Arrays.toString(values[row]));
        }
    }

    public static int indexOf(int valueToCheck, int[] values, int startIndex, int endIndex) {

        for( int index = startIndex ; index < endIndex ; index++ ){
            if( values[index] == valueToCheck ){
                return index;
            }
        }

        return -1;
    }

    public static int findMax(int[] values) {

        int max = values[0];
        for( int index = 1 ; index < values.length ; index++ ){
            if( values[index] > max ){
                max = values[index];
            }
        }

        return max;
    }

    public static int findMin(int[] values) {

        int max = values[0];
        for( int index = 1 ; index < values.length ; index++ ){
            if( values[index] < max ){
                max = values[index];
            }
        }

        return max;
    }

    public static int findMax(int[][] generatedMatrix) {

        int max = generatedMatrix[0][0];

        for( int r = 0 ; r < generatedMatrix.length ; r++ ){
            for( int c = 0 ; c < generatedMatrix[r].length ; c++ ){
                if( generatedMatrix[r][c] > max ){
                    max = generatedMatrix[r][c];
                }
            }
        }

        return max;

    }

    public static int findMin(int[][] generatedMatrix) {
        int min = generatedMatrix[0][0];

        for( int r = 0 ; r < generatedMatrix.length ; r++ ){

            int rowMin = findMin(generatedMatrix[r]);
            if(  rowMin < min ){
                min = rowMin;
            }

        }

        return min;
    }


    public static String convertToBase2(int number) {
        return Integer.toBinaryString(number);
    }
}
