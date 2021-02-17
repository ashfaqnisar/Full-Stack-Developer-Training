package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Player_Selection_System_JDBC;
/*Remove the package import from the code in genc learn*/

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection con = null;
    private static final Properties props = new Properties();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {

            FileInputStream fis = null;
            fis = new FileInputStream("database.properties");
            props.load(fis);

            // load the Driver Class
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

            // create the connection now
            con = DriverManager.getConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return con;
    }
}
