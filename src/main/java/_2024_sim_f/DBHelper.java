package _2024_sim_f;

import java.sql.*;

public class DBHelper {

    public enum DATABASE_TYPE {
        SQLITE,
        ACCESS
    }

    static final public String DRIVER_SQLITE = "org.sqlite.JDBC";
    static final public String DRIVER_ACCESS = "net.ucanaccess.jdbc.UcanaccessDriver";

    static final private String connectionSQLITE = "jdbc:sqlite:";
    static final private String connectionACCESS = "jdbc:ucanaccess://";

    static final public String sqlQuery = "SELECT tName, tLocation, nDepartmentID, nShiftHours, nTotalItemsSold FROM tblEmployees";

    public static Connection connect(DATABASE_TYPE databaseType, String databaseName) throws ClassNotFoundException, SQLException {

        Connection connection = null;

        switch (databaseType) {
            case SQLITE:
                Class.forName(DRIVER_SQLITE);
                connection = DriverManager.getConnection(connectionSQLITE + databaseName);
                break;
            case ACCESS:
                Class.forName(DRIVER_ACCESS);
                connection = DriverManager.getConnection(connectionACCESS + databaseName);
                break;
        }

        return connection;
    }

    public static Connection connect(String connectionString) throws ClassNotFoundException, SQLException {

        if( connectionString.endsWith(".accdb") ){
            Class.forName(DRIVER_ACCESS);
            return DriverManager.getConnection(connectionString);
        }

        if( connectionString.endsWith(".sqlite") ){
            Class.forName(DRIVER_SQLITE);
            return DriverManager.getConnection(connectionString);
        }

        return null;
    }

    public static ResultSet execute(Connection connection, String query) throws SQLException {
        // create a prepared statement
        Statement statement = connection.createStatement();

        // fetch the results
        return statement.executeQuery(query);
    }

}
