package lo_elementary_programming;


public class IncrementDecrementOperators {

    public static void main(String []args){

        int x ;
        int y ;

        x = 5;
        System.out.println("x : " + x);

        x = x + 1;
        System.out.println("x : " + x);

        x += 1;
        System.out.println("x : " + x);

        x++;    // postfix increment
        System.out.println("x : " + x);

        ++x;    // prefix increment
        System.out.println("x : " + x);

        // ------------------------------

        x = 5;
        y = 0;
        System.out.printf("x : %d, y : %d\n", x, y);
        y = x++;
        System.out.printf("x : %d, y : %d\n", x, y);

        x = 5;
        y = 0;
        System.out.printf("x : %d, y : %d\n", x, y);
        y = ++x;
        System.out.printf("x : %d, y : %d\n", x, y);

    }

}
