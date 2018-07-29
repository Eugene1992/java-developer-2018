package JDBC_pckg.get_entities_task;

import JDBC_pckg.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final String USERNAME = "ndbekguuylikcy";
    private static final String PASSWORD = "60bb7ec5c671d2fea3692926039cb38c54d7ab2ff7c872d6f9dd7b65ff77e110";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-247-79-32.eu-west-1.compute.amazonaws.com:5432/ddbqh5qho6v4gc" +
            "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";


    public static void main(String[] args) {

        List<Employee> entities = getEntities("SELECT * FROM employee_filled",
                Employee.class);

        for (Employee entity : entities) {
            System.out.println(entity);
        }

    }


    public static <T> List<T> getEntities(String sql, Class<T> entity) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<T> entities = null;
        try {

            if (!entity.isAnnotationPresent(Entity.class)) {
                throw new IllegalEntityException("Entity \'" + entity.getSimpleName() + "\' is not acceptable. Caused by missing the annotation @Entity.");
            }

            entities = new ArrayList<>();

            Class.forName(JDBC_DRIVER);

            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            Field[] fields = entity.getDeclaredFields();

            while (resultSet.next()) {
                T object = entity.getConstructor().newInstance();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Column.class)) {
                        field.setAccessible(true);

                        String toGet = !field.getDeclaredAnnotation(Column.class).name().equals("") ?
                                field.getAnnotation(Column.class).name() : field.getName();

                        field.set(object, resultSet.getObject(toGet));
                    }
                }
                entities.add(object);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
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

        return entities;
    }
}
