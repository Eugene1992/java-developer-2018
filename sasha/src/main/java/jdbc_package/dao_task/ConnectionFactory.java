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

    static {
        try {
            sqlProperties = new Properties();
            sqlProperties.load(new FileInputStream("sql_base.properties"));
            Class.forName(sqlProperties.getProperty("driver"));
            connection = DriverManager.getConnection(
                    sqlProperties.getProperty("url"),
                    sqlProperties.getProperty("username"),
                    sqlProperties.getProperty("password"));
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
