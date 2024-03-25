package lo_jdbc;

/*
* Display the attendance for each student.
* The details must have the student ID, student name,
* date of attendance and status of attendance
*
* */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentAttendance {

    public static void main(String []args) {

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
            String sqlQuery = "SELECT level FROM Students";

            ResultSet resultSet;
            resultSet = statement.executeQuery(sqlQuery);
            System.out.println("SQL executed: " + sqlQuery);

            // fetch and process the results
            System.out.println("Result fetched");
            while (resultSet.next()) {

                // process the required columns
                String fetchedColumn1 = resultSet.getString(1);
                System.out.println("Fetched column's value: " + fetchedColumn1);

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
