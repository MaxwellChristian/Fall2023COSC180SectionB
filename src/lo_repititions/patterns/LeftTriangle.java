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


    }

}
