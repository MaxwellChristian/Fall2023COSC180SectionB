package lo_decision_statements;

import java.util.Scanner;

public class TerneryOperatorDemo1 {

    public static void main(String []args){

        int num1 ;
        int num2 ;
        int largerNum;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        num2 = input.nextInt();

        // find the larger from both numbers

        if( num1 > num2 ){
            largerNum = num1;
        }
        else {
            largerNum = num2;
        }
        System.out.println("Larger number : " + largerNum);

        // performing same using ?: operator
        // syntax : (condition) ? true part : false part

        largerNum = ( num1 > num2 ) ? num1 : num2 ;
        System.out.println("Larger number : " + largerNum);

        System.out.println("Larger number : " + (( num1 > num2 ) ? num1 : num2) );

    }

}
