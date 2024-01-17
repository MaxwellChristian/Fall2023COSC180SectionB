package lo_recursion;

public class Factorial {

    public static void main(String[] args) {

        try {
            System.out.println("Factorial of "
                    + Integer.parseInt(args[0])
                    + " : "
                    + factorialR(Integer.parseInt(args[0])));

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Provide an int as command line argument");
        } catch (NumberFormatException exception) {
            System.out.println("Only int values permitted as command line argument");
        } catch (Exception exception) {
            System.out.println("An exception generated: " + exception.getMessage());
        } catch (Error error) {
            System.out.println("An error generated: " + error);
        }

    }

    private static int factorialR(int num) throws Error {

        // stop case
        if (num == 1) {
            return 1;
        } else {
            return num * factorialR(num - 1);
        }

    }


//    private static int factorial(int num) {
//
//        int ans;
//        for( ans = 1; num > 1 ; num-- ){
//            ans = ans * num;
//        }
//
//        return ans;
//    }

}
