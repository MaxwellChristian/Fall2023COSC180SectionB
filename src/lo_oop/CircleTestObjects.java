package lo_oop;

import java.util.Scanner;

public class CircleTestObjects {

    public static void main(String []args) {

        // create 5 different objects of circle

//        Circle c1 = new Circle();
//        Circle c2 = new Circle();
//        Circle c3 = new Circle();
//        Circle c4 = new Circle();
//        Circle c5 = new Circle();

        // create 5 objects of circle using array

        // this is an array declaration. Still objects are not created
        // creating an array just creates references for objects to be created later
        Circle []cArr = new Circle[5];

        Scanner inputLine = new Scanner(System.in);
        int index;

        // inout radius to each circle object using the array
        for( index = 0 ; index < cArr.length ; index++ ){
            cArr[index] = new Circle();

            System.out.printf("Enter radius for circle%d: ", index);
            cArr[index].setRadius( inputLine.nextDouble() );

            // display the area for each circle
            System.out.printf("Area with %.2f: %.2f\n", cArr[index].getRadius(), cArr[index].getArea());
        }

        // re-write this program such that
            // it takes input of 5 radius and then after taking all the input
        // it displays the area for each circle



    }

}
