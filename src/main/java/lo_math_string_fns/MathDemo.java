package lo_math_string_fns;

public class MathDemo {

    public static void main(String []args){


        // find max of two numbers
        System.out.printf("Max of 5.897 and 5.788 is : %f\n", Math.max(5.897, 5.788) );

        // find min of two numbers
        System.out.printf("Max of 5.897 and 5.788 is : %f\n", Math.min(5.897, 5.788) );

        // | x | i.e. absolute value of x
        System.out.printf("ABS of -5.897: %f\n", Math.abs(-5.897) );

        // round value
        double roundedValue = Math.round(5.897);
        System.out.printf("Round of 5.897: %f\n", roundedValue );

        // round-up value
        double ceilValue = Math.ceil(5.897);
        System.out.printf("Ceil of 5.897: %f\n", ceilValue );

        // round-down value
        double floorValue = Math.floor(5.897);
        System.out.printf("Floor of 5.897: %f\n", floorValue );

        // log of 5 i.e., natural log (base e)
        System.out.printf("Log(base e) 5: %f\n", Math.log(5) );

        // log of 5 i.e., log (base 10)
        System.out.printf("Log(base 10) 5: %f\n", Math.log10(5) );

        // e to the power 5
        System.out.printf("e to power 5: %f\n", Math.exp(5) );
        System.out.printf("e to power 1: %f\n", Math.exp(1) );

        // x to power y
        System.out.printf("5 to power 3: %f\n", Math.pow(5, 3) );

        // square root of 189.12
        System.out.printf("Square root of 189.12: %f\n", Math.sqrt(189.12) );
        System.out.printf("Square root of 189.12: %.2f\n", Math.sqrt(189.12) );
        System.out.printf("Square root of -189.12: %f\n", Math.sqrt(-189.12) );

        // find max of 3 numbers
        System.out.println("Max of 5, 2, 7: " + Math.max(5, Math.max(2, 7)) );

    }

}
