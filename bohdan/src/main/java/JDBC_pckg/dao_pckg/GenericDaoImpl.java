package JDBC_pckg.dao_pckg;

import JDBC_pckg.ConnectionFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDaoImpl<ID, E> implements GenericDao<ID, E> {

    private Connection connection;
    private String tableName;
    private Class eClass;

    public static final String ID = "id";

    public GenericDaoImpl(String tableName, Class<E> object) {
        this.connection = ConnectionFactory.getConnection();
        this.tableName = tableName;
        this.eClass = object;
    }

    // TODO: 7/29/2018  PSQLException: Returning autogenerated keys is only supported for 8.2 and later servers.
    @Override
    public E create(E entity) {

        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

//        ID id = null;

        try {

            preparedStatement = connection.prepareStatement(getInsertionQuery());

            Field[] fields = eClass.getDeclaredFields();

            for (int i = 1; i < fields.length; i++) {
                fields[i].setAccessible(true);
                preparedStatement.setObject(i, fields[i].get(entity));
            }

            preparedStatement.execute();



            /*rs = preparedStatement.getGeneratedKeys();

            rs.next();
            id = rs.getObject("id");*/

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
//                if (rs != null) {
//                    rs.close();
//                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

//        return id == 0 ? null : get(id);

        return getAll().get(getAll().size() - 1);
    }

    @Override
    public E update(E entity) {

        PreparedStatement preparedStatement = null;
        ID id = null;

        try {

            Field idField = entity.getClass().getDeclaredField(ID);
            idField.setAccessible(true);
            id = (ID) idField.get(entity);
            preparedStatement = connection.prepareStatement(getUpdateQuery(id));

            Field[] fields = eClass.getDeclaredFields();


            for (int i = 1; i < fields.length; i++) {
                fields[i].setAccessible(true);
                preparedStatement.setObject(i, fields[i].get(entity));
            }


            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return get(id);
    }

    @Override
    public boolean delete(ID id) {

        PreparedStatement preparedStatement = null;

        boolean result = false;

        try {

            preparedStatement = connection.prepareStatement("DELETE FROM " + tableName +
                    " WHERE id = ?");
            preparedStatement.setObject(1, id);

            result = preparedStatement.executeUpdate() > 0;


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    @Override
    public E get(ID id) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        E result = null;

        try {

            preparedStatement = connection.prepareStatement("SELECT * FROM " + tableName +
                    " WHERE id = ?");
            preparedStatement.setObject(1, id);

            resultSet = preparedStatement.executeQuery();

            result = (E) eClass.getConstructor().newInstance();

            Field[] fields = eClass.getDeclaredFields();

            resultSet.next();

            for (Field field : fields) {
                field.setAccessible(true);
                field.set(result, resultSet.getObject(field.getName()));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    @Override
    public List<E> getAll() {

        Statement statement = null;
        ResultSet resultSet = null;

        List<E> result = new ArrayList<>();
        E object = null;

        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + tableName);

            Field[] fields = eClass.getDeclaredFields();

            while (resultSet.next()) {
                object = (E) eClass.getConstructor().newInstance();
                for (Field field : fields) {
                    field.setAccessible(true);
                    field.set(object, resultSet.getObject(field.getName()));
                }

                result.add(object);
                object = null;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    private String getInsertionQuery() {
        Field[] fields = eClass.getDeclaredFields();
        String query = "INSERT INTO " + tableName + " (";
        for (int i = 1; i < fields.length; i++) {
            query += (i == fields.length - 1 ? fields[i].getName() + ") " : fields[i].getName() + ", ");
        }
        query += ("VALUES ( ");
        for (int i = 1; i < fields.length; i++) {
            query += (i == fields.length - 1 ? "?)" : "?, ");
        }
        return query;
    }

    private String getUpdateQuery(ID id) {
        Field[] fields = eClass.getDeclaredFields();
        String query = "UPDATE " + tableName + " SET ";
        for (int i = 1; i < fields.length; i++) {
            query += (i == fields.length - 1 ? fields[i].getName() + " = ? " : fields[i].getName() + " = ?, ");
        }
        query += ("WHERE id = " + id);
        return query;
    }

   /* public ID getLastInstanceId() throws NoSuchFieldException, IllegalAccessException {
        Field field = eClass.getDeclaredField("id");
        field.setAccessible(true);
        return (ID) field.get(getAll().size()-1);
    }*/

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
