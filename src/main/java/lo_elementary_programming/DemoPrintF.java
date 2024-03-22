package lo_elementary_programming;

public class DemoPrintF {

    public static void main(String []args){

        double value = 578.2897131123;

        System.out.println("Value : " + value);

        // display using printf
        System.out.printf("Value is %f", value);
        // will print the floating point value and will NOT give a new line

        System.out.println();   // for a blank line

        // display with only 2 decimals
        System.out.printf("Value is %.2f\n", value);
        // \n : used for new line

        // display with only 3 decimals
        System.out.printf("Value is %.3f", value);

        // displaying two values using a single printf
        System.out.printf("\nValue1: %.2f Value2: %.4f\n", 5.1278, value);

        int x = 987;
        System.out.printf("x: %d\n", x);
        System.out.printf("x: %5d\n", x);

        System.out.printf("value: %.3f\n", value);
        System.out.printf("value: %12.3f\n", value);

        String name = "Maxwell";
        System.out.printf("Name: %s\n", name);
        System.out.printf("Name: %10s\n", name);
        System.out.printf("Name: %-10s%s\n", name, "Christian");

    }

}
