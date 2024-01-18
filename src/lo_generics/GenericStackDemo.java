package lo_generics;

import lo_inheritance.Shape;

public class GenericStackDemo {

    public static void main(String []args) {

        GenericStack<Integer> gStackInt = new GenericStack<>();
        GenericStack<String> gStackString = new GenericStack<>();
        GenericStack<Shape> gStackShape = new GenericStack<>();

        try {
            // display the size of each stack before and after adding values
            System.out.println("Stack size: " + gStackInt.getSize());

            // try adding 3 values to each stack
            gStackInt.push(5);
            gStackInt.push(6);
            gStackInt.push(7);

            // display the size of each stack before and after adding values
            System.out.println("Stack size: " + gStackInt.getSize());

            // display all the elements of the stack
            for( int i = 0 ; i <= gStackInt.getSize() ; i++ ){
                System.out.println(gStackInt.pop());
            }

            // display the size of each stack before and after adding values
            System.out.println("Stack size: " + gStackInt.getSize());
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }






    }

}
