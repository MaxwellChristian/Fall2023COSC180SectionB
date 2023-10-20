package lo_arrays.two_d_arrays;

import java.util.Scanner;

public class StudentAttendance {

    public static void main(String[] args) {

        // int[][] attendance = new int[3][5];
        // the above declaration creates an array which can hold
        // 3 rows each of 5 columns
        // i.e. attendance of 3 students for 5 days

        /*int row;
        int col;

        for (row = 0; row < 3; row++) {

            for (col = 0; col < 5; col++) {
                System.out.print("row : " + row + ", col : " + col);
            }
            System.out.println();

        }*/

        Scanner inputLine = new Scanner(System.in);

        final int TOTAL_STUDENTS = 3;
        final int TOTAL_DAYS = 5;

        int[][] attendance = new int[TOTAL_STUDENTS][TOTAL_DAYS];

        int student;
        int day;

        // capture the attendance of each student for each day
//        for (student = 0; student < TOTAL_STUDENTS; student++) {
//            for (day = 0; day < TOTAL_DAYS; day++) {
//                System.out.printf("Enter attendance for [student %d][day %d]: ", student+1, day+1);
//                attendance[student][day] = inputLine.nextInt();
//            }
//        }

        // display the student attendance report
//        for (student = 0; student < TOTAL_STUDENTS; student++) {
//            for (day = 0; day < TOTAL_DAYS; day++) {
//                System.out.print(attendance[student][day] + " ");
//            }
//            System.out.println();
//        }

        int[][] attendance2 = {
                {1, 1, 0, 1, 0},
                {0, 0, 1, 1, 0},
                {1, 1, 0, 0, 1}
        };

        // student presence count i.e. row count
        int studentPresenceCount ;
        for (student = 0; student < TOTAL_STUDENTS; student++) {

            studentPresenceCount = 0;
            for (day = 0; day < TOTAL_DAYS; day++) {
                if( attendance2[student][day] == 1 ){
                    studentPresenceCount++;
                }
            }

            System.out.printf("Student %d: %d\n", student+1, studentPresenceCount);
        }

        // student presence count as per each day i.e. day count
        for (day = 0; day < TOTAL_DAYS; day++) {
            studentPresenceCount = 0;
            for (student = 0; student < TOTAL_STUDENTS; student++) {
                if( attendance2[student][day] == 1 ){
                    studentPresenceCount++;
                }
            }
            System.out.printf("Day %d: %d\n", day+1, studentPresenceCount);
        }

    }

}
