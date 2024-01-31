package lo_functional_programming;

import java.util.Arrays;
import java.util.Random;

public class ParallelStreamDemo {

    public static void main(String []args) {

        // number of available processors
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());

        System.out.println("Generating 200_000_000 values");

        Random random = new Random();
        int []values = random.ints(200_000_000).toArray();

        System.out.println("Sorting 200_000_000 values");

        // time to sort values [sequentially]
        int []sortedValuesS = new int[values.length];
        long sequentialTime = sortSequential(values, sortedValuesS);
        System.out.println("Execution time [Sequential]: " + sequentialTime + " ms");

        // time to sort values [parallel]
        int[] sortedValuesP = new int[values.length];
        long parallelTime = sortParallel(values, sortedValuesP);
         System.out.println("Execution time [Parallel]: " + parallelTime + " ms");

    }

    private static long sortSequential(int[] values, int[] sortedValues) {

        long startTime = System.currentTimeMillis();
        // sequential sort of values larger than 0 and displaying first 5 values
        sortedValues = Arrays.stream(values).filter(value -> value > 0).sorted().toArray();
        // end time
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    private static long sortParallel(int[] values, int[] sortedValues) {
        long startTime = System.currentTimeMillis();
        // parallel sort of values larger than 0 and displaying first 5 values
        sortedValues = Arrays.stream(values).parallel().filter(value -> value > 0).sorted().toArray();
        // end time
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

}
