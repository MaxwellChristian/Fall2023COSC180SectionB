package lo_repititions.patterns;

public class Block {

    public static void main(String []args) {

        int row;
        int col;

        for (row = 1 ; row <= 3 ; row++) {
            for( col = 1 ; col <= 5 ; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
