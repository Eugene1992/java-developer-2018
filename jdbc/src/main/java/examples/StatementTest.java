package examples;

import connection.ConnectionFactory;

import java.sql.*;

public class StatementTest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM x_user WHERE name = ";
            String inputSQl = "'Tom'; DROP TABLE x_user;";
            statement = connection.createStatement();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM x_user WHERE id = ? AND name = ?");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Tom");

            ResultSet resultSet = statement.executeQuery(sql + inputSQl);

            resultSet.next();
            System.out.println(resultSet.getString("name"));

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
