package lo_jdbc;

/*
 * Display the attendance for each student.
 * The details must have the student ID, student name,
 * date of attendance and status of attendance.
 *
 * The attendance is to be fetched for the student whose ID is provided
 * by the user when the program is executed.
 *
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class StudentAttendance {

    public static void main(String[] args) {

        try {

            // load the driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("Driver loaded");

            // connect to the database
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://db_files/Students.accdb", "scott", "tiger");
            System.out.println("Database connected");

            // create the statement to execute database commands
            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            // execute the database commands using statement

            String []columnsToFetch = { "LastName", "FirstName", "Student", "AttendanceDate", "Status" };
            String []tablesToUse = {"Students", "StudentAttendance"};

            String fieldList = Arrays.toString(columnsToFetch);
            String tableList = Arrays.toString(tablesToUse);

            System.out.println(fieldList.substring(1, fieldList.length()-1));
            System.out.println(tableList.substring(1, tableList.length()-1));

//            String sqlQuery =
//                    "SELECT " +
//                            "LastName, " +
//                            "FirstName, " +
//                            "Student, " +
//                            "AttendanceDate, " +
//                            "Status " +
//                        "FROM " +
//                            "Students, " +
//                            "StudentAttendance " +
//                        "WHERE " +
//                            "Students.StudentID = StudentAttendance.Student";

//            String sqlQuery =
//                    "SELECT " +
//                            fieldList.substring(1, fieldList.length()-1) +
//                        " FROM " +
//                            tableList.substring(1, tableList.length()-1) +
//                        " WHERE " +
//                            "Students.StudentID = StudentAttendance.Student" +
//                        " AND " +
//                            "StudentAttendance.Student = 4"
//                    ;

            int idToSearch = Integer.parseInt(args[0]);
            String sqlQuery =
                    "SELECT " +
                            fieldList.substring(1, fieldList.length()-1) +
                        " FROM " +
                            tableList.substring(1, tableList.length()-1) +
                        " WHERE " +
                            "Students.StudentID = StudentAttendance.Student" +
                        " AND " +
                            "StudentAttendance.Student = " + idToSearch
                    ;

            ResultSet resultSet;
            System.out.println("SQL to execute: " + sqlQuery);
            resultSet = statement.executeQuery(sqlQuery);
            System.out.println("SQL executed: " + sqlQuery);

            // fetch and process the results
            System.out.println("Result fetched");
            while (resultSet.next()) {

                // process the required columns
                String studentID = resultSet.getString(3);
                String attendingDate = resultSet.getString(4);
                String attendanceStatus = resultSet.getString(5);

                String studentName =
                        resultSet.getString(1) +
                                " " +
                                resultSet.getString(2);

                System.out.println(studentID
                        + "(" + studentName + ")"
                        + ": "
                        + attendingDate
                        + " -> "
                        + attendanceStatus);

            }
            System.out.println("Display completed");

            // close the connection
            connection.close();
            System.out.println("Connection closed");

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

}
