package examples;

import connection.ConnectionFactory;

import java.sql.*;

public class CallableStatementTest {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String SQL = "{call sum (?, ?)}";
            callableStatement = connection.prepareCall(SQL);

            callableStatement.setString(1, "Hello");
            callableStatement.setString(2, " world!");

            ResultSet resultSet = callableStatement.executeQuery();

            resultSet.next();

            ResultSetMetaData metaData = resultSet.getMetaData();

            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.println(metaData.getCatalogName(i));
            }

            System.out.println(resultSet.getObject(1));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                callableStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
