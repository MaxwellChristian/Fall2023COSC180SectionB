package lo_jdbc;

/*
* Create a program which demonstrates connecting to a database and fetching some records.
* To start with, this program connects to Ms-Access.
* */

import java.sql.*;

public class Demo_1 {

    public static void main(String []args) {

        try {
            // load the appropriate driver for the database used
            // i.e., load the class which represents the driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("Driver loaded");

            // connect to database

            // Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javabook", "db-user-name", "db-password");

            // Connection connection = DriverManager.getConnection("jdbc:ucanaccess://Students.accdb", "scott", "tiger");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://db_files/Students.accdb", "scott", "tiger");
            System.out.println("Database connected");

            // create the operation that you need to perform with the database
            // here we will fetch some records from the table "students"
            String query = "SELECT level, room FROM students";

            // to work with database commands, we need to create a 'Statement'
            Statement statement = connection.createStatement();

            // execute the command using the statement
            ResultSet resultSet = statement.executeQuery(query);

            // iterate over the received results
            while (resultSet.next()) {
                // System.out.println("Record traversed");

                // display the columns from the fetched records
                String fetchedColum1 = resultSet.getString(1);
                int fetchedColum2 = resultSet.getInt(2);

                System.out.println(fetchedColum1 + ", " + fetchedColum2);
            }

            // close the connection
            connection.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
