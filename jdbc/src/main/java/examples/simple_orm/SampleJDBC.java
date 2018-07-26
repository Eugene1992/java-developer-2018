package examples.simple_orm;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yede0517 on 7/26/2018.
 */
public class SampleJDBC {

    private static String URL = "jdbc:postgresql://localhost:5432/demo";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "root";

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {

/*        List<User> employees = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM t_user");
            while (resultSet.next()) {
                employees.add(new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getInt("salary")

                ));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(employees);*/

//        final List<Employee> employees = getEntity("SELECT * FROM employee", Employee.class);
        final List<User> users = getEntity("SELECT * FROM t_user", User.class);

        System.out.println(users);
    }

    public static <T> List<T> getEntity(String sql, Class<T> clazz) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<T> entities = new ArrayList<>();

        if (clazz.isAnnotationPresent(Entity.class)) {
            final Set<Field> entityDeclaredColumnFields = new HashSet<>();
            final Field[] entityDeclaredFields = clazz.getDeclaredFields();
            for (Field declaredField : entityDeclaredFields) {
                if (declaredField.isAnnotationPresent(Column.class)) {
                    entityDeclaredColumnFields.add(declaredField);
                }
            }

            while (resultSet.next()) {
                final T entity = clazz.newInstance();
                for (Field entityDeclaredColumnField : entityDeclaredColumnFields) {
                    final String declaredFieldName = entityDeclaredColumnField.getName();
                    final Method declaredFieldSetterMethod = clazz.getDeclaredMethod(constructSetterMethodName(declaredFieldName), entityDeclaredColumnField.getType());
                    final String columnName = entityDeclaredColumnField.getAnnotation(Column.class).name();
                    declaredFieldSetterMethod.invoke(entity, resultSet.getObject(columnName));
                }
                entities.add(entity);
            }
        } else {
            throw new IllegalArgumentException();
        }

        return entities;
    }

    private static String constructSetterMethodName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
    }
}
