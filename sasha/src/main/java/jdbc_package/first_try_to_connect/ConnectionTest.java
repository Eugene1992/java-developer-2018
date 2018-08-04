package jdbc_package.first_try_to_connect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionTest {
    private static final String USERNAME = "xrrdsqtlcjrvub";
    private static final String PASSWORD = "944b92f82e375f87d0b535edf7e8ee906974edf5c23583dfdbe00e51dad10b79";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-217-205-90.eu-west-1.compute.amazonaws.com:5432/ddi3pjc1s738us?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";


    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            List<Employee> employees = new ArrayList<>();
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employee");

            while (resultSet.next()) {
                employees.add(
                        new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("first_name"),
                                resultSet.getString("last_name"),
                                resultSet.getInt("age"),
                                resultSet.getInt("salary"),
                                resultSet.getBoolean("is_married"),
                                resultSet.getString("position")
                        )
                );

            }
            for (int i = 0; i < employees.size(); i++) {
                System.out.println(employees.get(i).toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
