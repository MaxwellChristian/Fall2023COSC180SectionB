package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {

        int num1;
        int num2;
        int ans;

        boolean validInput;

        do {

            validInput = true;

            try {

                // input first value
                System.out.print("Enter num1 : ");
                num1 = captureInt();

                // input second value
                System.out.print("Enter num2 : ");
                num2 = captureInt();

                ans = num1 + num2;
                System.out.printf("%d + %d : %d\n", num1, num2, ans);
            } catch (MyCustomException customEx) {
                // System.out.println("Please provide only INT values");
                System.out.println(customEx.getMessage());
                validInput = false;
            }

        } while (!validInput);


    }

    private static int captureInt() throws MyCustomException {
        try {
            Scanner inputLine = new Scanner(System.in);
            return inputLine.nextInt();
        } catch (InputMismatchException immEx) {
            throw new MyCustomException("Only INT values allowed");
        }

    }

}
