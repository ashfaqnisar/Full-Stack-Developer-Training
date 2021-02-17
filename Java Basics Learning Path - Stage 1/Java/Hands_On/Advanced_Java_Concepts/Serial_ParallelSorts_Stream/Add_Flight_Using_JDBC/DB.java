package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Add_Flight_Using_JDBC;
/*Remove the package import from the code in genc learn*/

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static final Properties properties = new Properties();
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            FileInputStream fileInputStream = new FileInputStream("database.properties");
            properties.load(fileInputStream);

            // load the Driver Class
            Class.forName(properties.getProperty("DB_DRIVER_CLASS"));

            // create the connection now
            connection = DriverManager.getConnection(properties.getProperty("DB_URL"), properties.getProperty("DB_USERNAME"), properties.getProperty("DB_PASSWORD"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
