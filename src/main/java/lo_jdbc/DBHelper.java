package lo_jdbc;

import java.sql.*;

public class DBHelper {

    public enum DB_TYPE {
        SQLITE,
        ACCESS
    }

    static final public String DRIVER_SQLITE = "org.sqlite.JDBC";
    static final public String DRIVER_ACCESS = "net.ucanaccess.jdbc.UcanaccessDriver";

    static final private String connectionSQLITE = "jdbc:sqlite:";
    static final private String connectionACCESS = "jdbc:ucanaccess://";

    public static Connection connect(DB_TYPE databaseType, String databaseName) throws ClassNotFoundException, SQLException {

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

    public static ResultSet execute(Connection connection, String query) throws SQLException {
        // create a prepared statement
        Statement statement = connection.createStatement();

        // fetch the results
        return statement.executeQuery(query);
    }

}
