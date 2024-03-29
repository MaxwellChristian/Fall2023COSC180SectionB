package test_pkg;
/*
* Take two numbers from user and display the quotient of division operation
* */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDivison {

    public static void main(String []args) {

        int num1;
        int num2;

        int ans;

        Scanner inputLine = new Scanner(System.in);

        try {
            System.out.print("Enter num1 : ");
            num1 = inputLine.nextInt();

            System.out.print("Enter num2 : ");
            num2 = inputLine.nextInt();

            ans = num1 / num2;
            System.out.printf("%d / %d : %d\n", num1, num2, ans);
        } catch ( ArithmeticException ex ) {
            System.out.println("Number 2 must be NON-ZERO");
        } catch ( InputMismatchException ex ) {
            System.out.println("Inputs must only be INT");
        }

    }

}
