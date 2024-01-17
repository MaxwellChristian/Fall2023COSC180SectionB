package lo_recursion;

public class Factorial {

    public static void main(String []args) {

        int num = Integer.parseInt(args[0]);

        int fact = factorial(num);

        System.out.println("Factorial of " + num +  " : " + fact);

    }

    private static int factorial(int num) {

        int ans;
        for( ans = 1; num > 1 ; num-- ){
            ans = ans * num;
        }

        return ans;
    }

    private static int factorialR(int num) {

        // stop case
        if( num == 1 ){
            return 1;
        } else {
            return num * factorialR(num-1);
        }

    }

}
