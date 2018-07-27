package examples.sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SampleJDBC {
    private static final String USERNAME = "nykgmqvvdcegwm";
    private static final String PASSWORD = "bf201d90be9b4ae104d4aaa76ac8f63c8482ad8ff94f4d010f25f861066f8690";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-228-251-254.eu-west-1.compute.amazonaws.com:5432/d3kqlpsdudhcij" +
            "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

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
                                resultSet.getString("name")
                        )
                );
            }
            System.out.println(employees);
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
