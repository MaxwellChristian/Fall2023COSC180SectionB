package lo_arrays.two_d_arrays;

public class StudentAttendance2 {

    public static void main(String[] args) {

        final int TOTAL_STUDENTS = 3;
        final int TOTAL_DAYS = 5;

        int[][] attendance = new int[TOTAL_STUDENTS][TOTAL_DAYS];

        int student;
        int day;

        int[][] attendance2 = {
                {1, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {1, 1, 0, 0, 1}
        };

        // print day names [for header row]
        String []dayNames = {"  ", "Mo", "Tu", "We", "Th", "Fr"};
        for( int i = 0 ; i < dayNames.length ; i++ ){
            System.out.print(dayNames[i] + " ");
        }
        System.out.println();

        // student presence report with presence count i.e. row count
        int studentPresenceCount ;
        for (student = 0; student < TOTAL_STUDENTS; student++) {

            // print the student number
            System.out.printf("%2s ", "s"+(student+1));

            studentPresenceCount = 0;
            for (day = 0; day < TOTAL_DAYS; day++) {
                System.out.printf("%2d ", attendance2[student][day]);
                if( attendance2[student][day] == 1 ){
                    studentPresenceCount++;
                }
            }

            System.out.printf(": %d\n", studentPresenceCount);
        }

        // student presence count as per each day i.e. day count

        // leave an empty space for the heading column
        System.out.printf("%2s ", "  ");


        int []dayTotals = new int[TOTAL_DAYS];
        for (day = 0; day < TOTAL_DAYS; day++) {
            for (student = 0; student < TOTAL_STUDENTS; student++) {
                if( attendance2[student][day] == 1 ){
                    dayTotals[day]++;
                }
            }
            System.out.printf("%2d ", dayTotals[day]);
        }

    }

}
