package lo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    static final private String DRIVER_SQLITE = "org.sqlite.JDBC";
    static final private String DRIVER_ACCESS = "net.ucanaccess.jdbc.UcanaccessDriver";

    static final private String connectionSQLITE = "jdbc:sqlite:";
    static final private String connectionACCESS = "jdbc:ucanaccess://";

    public enum DATABASE_TYPE {
        SQLITE,
        ACCESS
    }

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


}
