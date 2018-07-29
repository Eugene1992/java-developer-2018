package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbcsample {
    private static final String USERNAME = "gkrklcwiraibtn";
    private static final String PASSWORD = "76e9b717eb6ce346a9984e00e92797b594f4901462b0e735cb0452c570ae2280";
    private static final String JDBC_DRIVER = "com.postgresql.jdbc.Driver";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-228-251-254.eu-west-1.compute.amazonaws.com:5432/d1fr112srlqvoa?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            List<Employee> employees = new ArrayList<>();
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * From employee");

            while (resultSet.next())
                employees.add(
                        new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        )
                );

            System.out.println(employees);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
