package lo_multi_threading.fork_join_example;

import lo_sorting.SortingMethods;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelMSortDemo {

    public static void main(String[] args) {

        final int TOTAL_VALUES = 7000000;
        Integer[] values1 = new Integer[TOTAL_VALUES];
        int[] values2 = new int[TOTAL_VALUES];

        // generate random values and fill in both arrays
        for (int i = 0; i < TOTAL_VALUES; i++) {
            values1[i] = values2[i] = (int) (Math.random() * 10000000);
        }

        // capture the start time
        long startTime = System.currentTimeMillis();

        // sort using parallel merge sort
        parallelMergeSort(values1);

        // capture the end time
        long endTime = System.currentTimeMillis();

    }

    private static void parallelMergeSort(Integer[] values) {
        ForkJoinPool pool = new ForkJoinPool();

        RecursiveAction task = new SortingTask(values);

        pool.invoke(task);
    }

    private static class SortingTask extends RecursiveAction {
        private final Integer[] values;

        // sorts 200 values in parallel
        private final int MAX_VALUES_TO_SORT_IN_PARALLEL = 200;

        public SortingTask(Integer[] values) {
            this.values = values;
        }

        @Override
        protected void compute() {

            if (values.length < MAX_VALUES_TO_SORT_IN_PARALLEL) {
                Arrays.sort(this.values);
            } else {

                // sort in parallel

                // split in two parts

                // the left part
                Integer[] leftPart = new Integer[values.length / 2];
                System.arraycopy(this.values, 0, leftPart, 0, this.values.length / 2);

                // the right part
                int rightLength = values.length - values.length / 2;
                Integer[] rightPart = new Integer[rightLength];
                System.arraycopy(this.values, values.length/2, rightPart, 0, rightLength);

                // recursively sort
                invokeAll(new SortingTask(leftPart), new SortingTask(rightPart));

                // merge both parts
                // MergeSortDemo.merge(leftPart, rightPart, values);
                SortingMethods.merge(leftPart, rightPart, values);

            }

        }
    }
}
