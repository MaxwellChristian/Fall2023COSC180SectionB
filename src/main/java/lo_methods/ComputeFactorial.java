package lo_methods;

import java.util.Random;

/*
 * Write a program which generate 20 random integers upto limit of 15.
 * Then the program display all the numbers and the computed factorial of each number.
 *
 * The program then should also display the factorials of square root of each number
 *
 * Ex.
 *
 * 1 : 1
 * 2 : 2
 * 5 : 120
 * 3 : 6
 * ....
 * ....
 *
 *
 * Sqrt(1) : factorial value
 * Sqrt(2) : factorial value
 * Sqrt(5) : factorial value
 * Sqrt(3) : factorial value
 * */
public class ComputeFactorial {

    public static void main(String[] args
    ) {

        // variable to store all random numbers
        int[] values = new int[20];

        // generate random numbers
        int position;
        for (position = 0; position < values.length; position++) {
            values[position] = new Random().nextInt(15);
        }

        // compute the factorial of each generated random number
        int factorial;

        // display the factorial of each generated random number
        for (int valueToCompute : values) {

            factorial = computeFactorial(valueToCompute);
            System.out.println(valueToCompute + " : " + factorial);
        }

        System.out.println();
        System.out.println();

        // display the factorial of square root of each generated number
        for (int valueToCompute : values) {
            // logic to compute the factorial
            /*factorial = computeFactorial((int) Math.sqrt(valueToCompute));*/

            System.out.println(
                    (int) Math.sqrt(valueToCompute)
                            + " : "
                            + computeFactorial((int) Math.sqrt(valueToCompute))
            );
        }

    }

    private static int computeFactorial(int value) {

        int factorial = 1;
        while (value > 1) {
            factorial *= value;
            value--;
        }

        return factorial;
    }
}
