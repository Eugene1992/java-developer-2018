package examples;

import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteTest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.createStatement();
            boolean isExecuted = statement.execute("CREATE TABLE x_user (" +
                    "id SERIAL PRIMARY KEY," +
                    "name VARCHAR(100)" +
                    ")");

            statement.executeUpdate("INSERT INTO x_user(name) VALUES ('Jack')");
            statement.executeUpdate("INSERT INTO x_user(name) VALUES ('Tom')");
            statement.executeUpdate("INSERT INTO x_user(name) VALUES ('John')");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
