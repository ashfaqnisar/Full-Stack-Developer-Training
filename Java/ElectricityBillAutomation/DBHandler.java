package ElectricityBillAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {

    private static Connection connection = null;
    private static Properties properties = new Properties();


    //ENSURE YOU DON'T CHANGE THE BELOW CODE WHEN YOU SUBMIT
    public static Connection establishConnection() throws ClassNotFoundException, SQLException {
        try {

            FileInputStream fileInputStream = new FileInputStream("db.properties");
            properties.load(fileInputStream);

            // load the Driver Class
            Class.forName(properties.getProperty("db.driver"));

            // create the connection now
            connection = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
