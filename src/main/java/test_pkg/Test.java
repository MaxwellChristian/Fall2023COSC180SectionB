package test_pkg;

public class Test {

    public static void main(String... args) {

        int count;

        long startTime = System.currentTimeMillis();

        // print 'A' 100000 times
        for (count = 0 ; count < 100000 ; count++)
        {
            System.out.print("A");
        }

        // print 'B' 100000 times
        for (count = 0 ; count < 100000 ; count++)
        {
            System.out.print("A");
        }

        // print 1 to 100000 [number values]
        for (count = 0 ; count < 100000 ; count++)
        {
            System.out.print(count);
        }

        // display the total time consumed

        long endTime = System.currentTimeMillis();

        System.out.println("Time consumed: " + (endTime - startTime) );

    }

}
