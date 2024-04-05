package lo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    static final public String DRIVER_SQLITE = "org.sqlite.JDBC";
    static final public String DRIVER_ACCESS = "net.ucanaccess.jdbc.UcanaccessDriver";

    static final private String connectionSQLITE = "jdbc:sqlite:";
    static final private String connectionACCESS = "jdbc:ucanaccess://";

    public static Connection connect(int databaseType, String databaseName) throws ClassNotFoundException, SQLException {

        Connection connection = null;

        switch (databaseType) {
            case 1:
                Class.forName(DRIVER_SQLITE);
                connection = DriverManager.getConnection(connectionSQLITE + databaseName);
                break;
            case 2:
                Class.forName(DRIVER_ACCESS);
                connection = DriverManager.getConnection(connectionACCESS + databaseName);
                break;
        }

        return connection;
    }


}
