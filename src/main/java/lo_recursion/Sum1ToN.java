package lo_recursion;

/*
* Write a recursive method which can generate
* summation of 1 to N. N passed as parameter to the method.
* */

public class Sum1ToN {

    public static void main(String []args) {

        try {

            System.out.println("Sum : " + sum(Integer.parseInt(args[0])));

        } catch (Exception exception) {
            System.out.println(exception);
        }

    }

    private static int sum(int num) {
        return (num == 1) ? 1 : (num + sum(num-1));
    }

    private static double sum1DN(int num) {
        return (num == 1) ? 1 : ( (1.0/num) + sum(num-1));
    }

}
