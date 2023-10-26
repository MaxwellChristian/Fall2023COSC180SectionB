package user_defined_logic;

import java.util.Arrays;

public class MyMethods {
    public static int[] generateValues(int totalValuesRequired, int maxValuePermitted) {

        int []values = new int[totalValuesRequired];

        for( int index = 0 ; index < totalValuesRequired ; index++ ){
            values[index] = (int) (Math.random() * maxValuePermitted);
        }

        return values;
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
}
