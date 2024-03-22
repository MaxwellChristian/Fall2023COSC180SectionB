package lo_arrays.two_d_arrays;

public class StudentAttendance3 {

    public static void main(String[] args) {

        final int TOTAL_STUDENTS = 3;
        final int TOTAL_DAYS = 5;

        int[][] attendance = {
                {1, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {1, 1, 0, 0, 1}
        };;

        int student;
        int day;

        // print day names [for header row]
        String []dayNames = {"  ", "M", "T", "W", "T", "F"};
        displayValues(dayNames);
        System.out.println();

        // calculate the student count across whole week
        int []studentPresenceCount = new int[TOTAL_STUDENTS] ;
        for (student = 0; student < TOTAL_STUDENTS; student++) {
            for (day = 0; day < TOTAL_DAYS; day++) {
                if( attendance[student][day] == 1 ){
                    studentPresenceCount[student]++;
                }
            }
        }

        // student presence report with presence count i.e. row count
        for (student = 0; student < TOTAL_STUDENTS; student++) {

            // print the student number
            System.out.printf("%2s ", "s"+(student+1));

            // show the weekly presence of the student
            displayValues(attendance[student]);

            // show the weekly attendance count of the student
            System.out.printf(": %d\n", studentPresenceCount[student]);
        }


        // student presence count as per each day i.e. day count
        int []dayTotals = new int[TOTAL_DAYS];
        for (day = 0; day < TOTAL_DAYS; day++) {
            for (student = 0; student < TOTAL_STUDENTS; student++) {
                if( attendance[student][day] == 1 ){
                    dayTotals[day]++;
                }
            }
        }

        // leave an empty space for the heading column
        System.out.printf("%2s ", "  ");

        displayValues(dayTotals);

    }

    private static void displayValues(String[] values) {
        for( int i = 0 ; i < values.length - 1 ; i++ ){
            System.out.printf(values[i] + " ");
        }
        System.out.print(values[values.length-1]);
    }

    private static void displayValues(int[] values) {
        for( int i = 0 ; i < values.length - 1 ; i++ ){
            System.out.print(values[i] + " ");
        }
        System.out.print(values[values.length-1]);
    }

}
