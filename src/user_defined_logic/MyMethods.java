package user_defined_logic;

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
}
