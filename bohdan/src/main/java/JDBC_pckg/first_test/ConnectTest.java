package JDBC_pckg.first_test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectTest {

    private static final String USERNAME = "ndbekguuylikcy";
    private static final String PASSWORD = "60bb7ec5c671d2fea3692926039cb38c54d7ab2ff7c872d6f9dd7b65ff77e110";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-247-79-32.eu-west-1.compute.amazonaws.com:5432/ddbqh5qho6v4gc" +
            "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            List<Employee> employees = new ArrayList<>();

            Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employee_filled");

            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"),
                        resultSet.getInt("salary"),
                        resultSet.getBoolean("is_married"),
                        resultSet.getString("position")
                ));
            }

            System.out.println(employees);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
