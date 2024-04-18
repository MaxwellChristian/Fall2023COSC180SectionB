package lo_jdbc.sqlite_demo;

//

import lo_jdbc.DBHelper;

import java.sql.*;

public class FetchStudentRecords2 {

    public static void main(String[] args) {

        try {
            // connect to database
            Connection connection = DBHelper.connect(DBHelper.DB_TYPE.SQLITE, "demo_db.sqlite");

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
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
