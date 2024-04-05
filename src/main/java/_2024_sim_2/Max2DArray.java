package _2024_sim_2;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Max2DArray {

    public static int max(int[][] values) {

        final int[] finalMax = {Integer.MIN_VALUE};
        ReentrantLock lockSum = new ReentrantLock();

        //Replace with a thread-based code that uses a thread for each row to find the maximum from the values.
        try (ExecutorService obPool = Executors.newCachedThreadPool()) {

            int counter = 1;
            for (int[] naRow : values) {

                int finalCounter = counter;

                System.out.println(STR."Executing thread: \{counter++}");
                obPool.execute(() -> {

                    int maxFromThread = maxRow(naRow);

                    lockSum.lock();
                    if( maxFromThread > finalMax[0]){
                        finalMax[0] = maxFromThread;
                    }
                    lockSum.unlock();

                    // System.out.println("Thread " + finalCounter + " -> Max: " + maxFromThread);
                    System.out.println(STR."Thread \{(finalCounter)} -> Max: \{maxFromThread}");

                });

            }

            obPool.shutdown();

            while (!obPool.isTerminated()) ;
        }

        return finalMax[0];
    }

    public static int maxRow(int[] naRow) {

        return Arrays.stream(naRow).max().getAsInt();
//
//        int nMax = Integer.MIN_VALUE;
//
//        for (int value : naRow) {
//            if( value > nMax ){
//                nMax = value;
//            }
//        }

//        return nMax;

    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 55},
                {6, 7, 8, 9, 10},
                {99, 9}
        };

        int maxValue = max(array);
        System.out.println(STR."Maximum value from 2D array: \{maxValue}");

    }
}
