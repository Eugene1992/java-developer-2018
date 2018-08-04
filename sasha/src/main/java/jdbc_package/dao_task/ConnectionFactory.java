package jdbc_package.dao_task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private static Properties sqlProperties;
    private static Connection connection;

    private static final String
            DRIVER = "driver",
            URL = "url",
            USERNAME = "username",
            PASSWORD = "password";

    public static final String SQL_PROPERTIES = "sql_base.properties";

    static {
        try {
            sqlProperties = new Properties();
            sqlProperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(SQL_PROPERTIES));
            Class.forName(sqlProperties.getProperty(DRIVER));
            connection = DriverManager.getConnection(
                    sqlProperties.getProperty(URL),
                    sqlProperties.getProperty(USERNAME),
                    sqlProperties.getProperty(PASSWORD));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
