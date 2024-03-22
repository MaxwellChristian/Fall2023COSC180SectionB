package lo_jdbc;

/*
* Create a program which demonstrates connecting to a database and fetching some records.
* To start with, this program connects to Ms-Access.
* */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo_1 {

    public static void main(String []args) {


        try {
            // load the appropriate driver for the database used
            // i.e. load the class which represents the driver
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("Driver loaded");

            // connect to database
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://Students.accdb", "scott", "tiger");
            System.out.println("Database connected");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
