package lo_generics;

import lo_inheritance.Circle;

public class GenericsDemo {

    public static void main(String []args) {


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
