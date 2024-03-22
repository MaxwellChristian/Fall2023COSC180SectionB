package lo_arrays;

public class ArrayIntro {

    public static void main(String []args) {

        // declaring an array
        int []arr;

        // assigning a size to an array
        arr = new int[5];

        // assigning values to a declared array
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 28;
        arr[3] = 39;
        arr[4] = 42;
        // arr[5] = 57;    // this is incorrect
        // because the size is 5 and so index runs from 0 to 4

        // initializing an array
        int []arr2 = {11, 25, 31};
        // this creates an array of size 3 and assigns the value to each index
        // when initializing, { } brackets are used

        // when using individual element in array, [ ] brackets are used

        double []dArr = {25.76, 12.879, 111.002, 1476.2123};

    }

}
