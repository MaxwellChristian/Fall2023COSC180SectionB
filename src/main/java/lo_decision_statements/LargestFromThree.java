package lo_decision_statements;

import java.util.Scanner;

public class LargestFromThree {

    public static void main(String[] args) {

        // declaration section
        int num1;
        int num2;
        int num3;

        // input section

        Scanner inputLine = new Scanner(System.in);

        // input number 1
        System.out.print("Enter num 1: ");
        num1 = inputLine.nextInt();

        // input number 2
        System.out.print("Enter num 2: ");
        num2 = inputLine.nextInt();

        // input number 3
        System.out.print("Enter num 3: ");
        num3 = inputLine.nextInt();

        if (num1 == num2) {
            if (num1 == num3) {
                System.out.println("All numbers are same");
            } else {
                // check larger from num1 and num3
                if (num1 > num3) {
                    System.out.println( num1 + ", " + num2 + " are same and largest");
                } else {
                    System.out.println(num3 + " is largest");
                }
            }
        } else {
            if( num1 == num3 ){
                if( num1 > num2 ){
                    System.out.println( num1 + ", " + num3 + " are same and largest");
                }
                else {
                    System.out.println(num2 + " is largest");
                }
            }
            else {
                if( num2 == num3 ){
                    if( num2 > num1){
                        System.out.println( num2 + ", " + num3 + " are same and largest");
                    }
                    else {
                        System.out.println(num1 + " is largest");
                    }
                }
            }
        }


    }

}
