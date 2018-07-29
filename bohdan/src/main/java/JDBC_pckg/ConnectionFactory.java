package JDBC_pckg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private static Properties credsProperties;

    private static Connection connection;

    static {
        try {
            credsProperties = new Properties();
            credsProperties.load(new FileInputStream("C:\\Users\\admin\\java-developer-2018\\bohdan\\src\\main\\resources\\postgresql_creds.properties"));

            Class.forName(credsProperties.getProperty("driver"));
            connection = DriverManager.getConnection(
                    credsProperties.getProperty("url"),
                    credsProperties.getProperty("username"),
                    credsProperties.getProperty("password")
            );

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private ConnectionFactory() {
    }

    public static Connection getConnection() {
        return connection;
    }

}
