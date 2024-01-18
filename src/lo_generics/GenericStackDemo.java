package lo_generics;

import lo_inheritance.Shape;

public class GenericStackDemo {

    public static void main(String []args) {

        GenericStack<Integer> gStackInt = new GenericStack<>();
        GenericStack<String> gStackString = new GenericStack<>();
        GenericStack<Shape> gStackShape = new GenericStack<>();

        // try adding 3 values to each stack

        // display the size of each stack before and after adding values

        // display all the elements of the stack

    }

}
