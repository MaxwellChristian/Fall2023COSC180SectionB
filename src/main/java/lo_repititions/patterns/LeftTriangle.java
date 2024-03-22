package lo_repititions.patterns;

public class LeftTriangle {

    public static void main(String []args) {

        int row;
        int col;

        for (row = 1 ; row <= 7 ; row++) {

            for( col = 1 ; col <= row ; col++ ){
//                System.out.print("*");
//                System.out.print( row );
                System.out.print( col );
            }
            System.out.println();

        }

        // using a while loop
        row = 1;    // start [before the loop]
        while (row <= 7){   // condition [check every time the loop works]

            col = 1;
            while (col <= row){
                System.out.print(col);
                col++;
            }

            System.out.println();

            row++;  // change [always inside the loop such that it affects the condition]
        }


    }

}
