package lo_jdbc.sqlite_demo;

//

import java.sql.*;

public class FetchStudentRecords {

    public static void main(String[] args) {

        try {
            // connect to database
            Connection connection = connect();

            String sqlQuery =
                    "SELECT " +
                            "last_name as LN, first_name AS FN, grade_level as GRADE " +
                        "FROM " +
                            "tblStudents " +
                            "";

            // create a prepared statement
            Statement statement = connection.createStatement();

            // set the dynamic values to prepare the query
//            preparedStatement.setString(1, args[0]);
//            preparedStatement.setString(2, args[1]);

            // fetch the results
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print(", ");

                // System.out.print( resultSet.getString("FirstName") );
                System.out.print(resultSet.getString("FN"));
                System.out.print(", ");

                System.out.print(resultSet.getString("GRADE"));

                System.out.println();
            }

            // close the connection
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    private static Connection connect() {

        Connection connection = null;

        try {
            // load the driver
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver loaded");

            // connect to required database
            connection = DriverManager.getConnection("jdbc:sqlite:demo_db.sqlite");
            System.out.println("Database connected");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            // return the connection
            return connection;
        }

    }

}
