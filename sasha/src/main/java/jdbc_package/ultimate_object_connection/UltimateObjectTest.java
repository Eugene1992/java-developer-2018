package jdbc_package.ultimate_object_connection;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UltimateObjectTest {
    private static final String USERNAME = "xrrdsqtlcjrvub";
    private static final String PASSWORD = "944b92f82e375f87d0b535edf7e8ee906974edf5c23583dfdbe00e51dad10b79";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-217-205-90.eu-west-1.compute.amazonaws.com:5432/ddi3pjc1s738us?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";


    public static void main(String[] args) {
        List<Employee> employees = getEntities("SELECT * FROM employee", Employee.class);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        List<User> users = getEntities("SELECT * FROM \"user\"", User.class);

        for (User user : users) {
            System.out.println(user.toString());
        }

    }

    public static <T> List<T> getEntities(String sql, Class<T> entity) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<T> entities = null;

        try {

            if (!entity.isAnnotationPresent(Entity.class)) {
                throw new IllegalArgumentException(entity.getSimpleName() + " without annotation @Entity");
            }
            entities = new ArrayList<>();

            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            Field[] fields = entity.getDeclaredFields();
            while (resultSet.next()) {
                T object = entity.newInstance();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Column.class)) {
                        field.setAccessible(true);
                        String columnName = field.getAnnotation(Column.class).name();
                        columnName = !columnName.isEmpty() ? columnName : field.getName();

                        Object columnValues = resultSet.getObject(columnName);
                        field.set(object, columnValues);
                    }
                }
                entities.add(object);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
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
        return entities;
    }
}
