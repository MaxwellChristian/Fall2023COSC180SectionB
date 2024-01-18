package lo_generics;

public class GenericMethods {

    public static <T extends Comparable<T> > T largest(T []values) {

        T max = values[0];
        for( int i = 1 ; i  < values.length ; i++ ){
            if( values[i].compareTo(max) > 0 ){
                max = values[i];
            }
        }

        return max;
    }

    public static <T extends Comparable<T> > T smallest(T []values) {

        T min = values[0];
        for( int i = 1 ; i  < values.length ; i++ ){
            if( values[i].compareTo(min) < 0 ){
                min = values[i];
            }
        }

        return min;
    }

    // a method which can take a circle and a rectangle and compare them on their area

}
