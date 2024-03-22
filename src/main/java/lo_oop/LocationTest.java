package lo_oop;

import java.util.Scanner;

public class LocationTest {

    public static void main(String []args) {

        Scanner inputLine = new Scanner(System.in);

        double [][]values = new double[3][2];

        for( int r = 0 ; r < values.length ; r++ ){
            for( int c = 0 ; c < values[r].length ; c++ ){
                System.out.printf("Enter values[%d][%d]: ", r, c );
                values[r][c] = inputLine.nextDouble();
            }
        }

        Location returnedLocationObject = Location.locateLargest(values);

        System.out.printf("MaxValue %f is at (%d, %d)\n",
                returnedLocationObject.getMaxValue(),
                returnedLocationObject.getRow(),
                returnedLocationObject.getCol());

    }

}

