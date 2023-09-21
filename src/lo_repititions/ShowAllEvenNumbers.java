package lo_repititions;

import java.util.Scanner;

public class ShowAllEvenNumbers {

    public static void main(String []args){

        final int valueSize = 5;

        // int []values = new int[5];
        int []values = new int[valueSize];

        Scanner input = new Scanner(System.in);

        int position;

        // input
//        for (position = 0 ; position < 5 ; position++){
        for (position = 0 ; position < values.length ; position++){
            System.out.print("Enter number : ");
            values[position] = input.nextInt();
        }


//        for (position = 0 ; position < 5 ; position++){
        for (position = 0 ; position < values.length ; position++){
            if(values[position]%2 == 0){
                System.out.println(values[position] + " : Even");
            }

        }



    }

}
