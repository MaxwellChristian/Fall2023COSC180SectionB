package lo_generics;

import lo_inheritance.Circle;
import lo_inheritance.Rectangle;

import java.util.ArrayList;

public class GenericsDemo {

    public static void main(String []args) {


//        ArrayList<Integer> alNumbers = new ArrayList<>();
//        alNumbers.add(20);
//        alNumbers.add("20");
//

        Integer []iValues = {11, 22, 33, 44, 55};
        String []sValues = {"AA", "BB", "CC"};

        int []i2 = {11, 22};

//        showIntValues(iValues);
//        showTextValues(sValues);

        showValues(iValues);
        showValues(sValues);
        // showValues(i2);  // not allowed

        Circle[]cValues = new Circle[3];
        cValues[0] = new Circle(11);
        cValues[1] = new Circle(22);
        cValues[2] = new Circle(33);

        showValues(cValues);

        System.out.println("Max : " + largest(iValues));
        System.out.println("Max : " + largest(sValues));
        System.out.println("Max : " + largest(cValues));

        System.out.println("Min : " + GenericMethods.smallest(iValues));
        System.out.println("Min : " + GenericMethods.smallest(sValues));
        System.out.println("Min : " + GenericMethods.smallest(cValues));

        if(GenericMethods.compareShapes(cValues[0], new Rectangle())){
            System.out.println("Both are same");
        } else {
            System.out.println("Both are Not same");
        }

    }

    // <T> return_type method_name(T parameter) { }
    // <E> return_type method_name(E parameter) { }

    private static <T extends Comparable<T> > T largest(T []values) {

        T max = values[0];
        for( int i = 1 ; i  < values.length ; i++ ){
            if( values[i].compareTo(max) > 0 ){
                max = values[i];
            }
        }

        return max;
    }

    private static void showTextValues(String[] values) {
        for (String value : values) {
            System.out.println(value);
        }
    }

    private static void showIntValues(Integer[] values) {
        for (Integer value : values) {
            System.out.println(value);
        }
    }

    private static <T> void showValues(T []values){
        for( T value: values ){
            System.out.println(value);
        }
    }

}
