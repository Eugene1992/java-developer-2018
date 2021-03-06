package dao;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

    public static final String ID = "id";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String AGE = "age";
    public static final String SALARY = "salary";
    public static final String IS_MARRIED = "is_married";
    public static final String POSITION = "position";
    private Connection connection;

    public EmployeeDaoJdbcImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    // TODO: 7/29/2018  PSQLException: Returning autogenerated keys is only supported for 8.2 and later servers.
    @Override
    public Employee create(Employee employee) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement
                    ("INSERT INTO employee_filled(first_name, last_name, age, salary, is_married,position) " +
                            "VALUES(?, ?, ?, ?, ?, ?)");

            preparedStatement.setString(1, employee.firstNameProperty().toString());
            preparedStatement.setString(2, employee.lastNameProperty().toString());
            preparedStatement.setInt(3, employee.ageProperty().get());
            preparedStatement.setInt(4, employee.salaryProperty().get());
            preparedStatement.setBoolean(5, employee.isMarriedProperty().get());
            preparedStatement.setString(6, employee.positionProperty().toString());

            preparedStatement.execute();

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

        return get(getLastId());
    }

    @Override
    public Employee update(Employee employee) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement
                    ("UPDATE employee_filled " +
                            "SET first_name = ?, last_name = ?, age = ?, salary = ?, is_married = ?, position = ? " +
                            "WHERE id = ?");

            preparedStatement.setString(1, employee.firstNameProperty().toString());
            preparedStatement.setString(2, employee.lastNameProperty().toString());
            preparedStatement.setInt(3, employee.ageProperty().get());
            preparedStatement.setInt(4, employee.salaryProperty().get());
            preparedStatement.setBoolean(5, employee.isMarriedProperty().get());
            preparedStatement.setString(6, employee.positionProperty().toString());
            preparedStatement.setInt(7, employee.idProperty().get());

            preparedStatement.executeUpdate();


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

        return employee;
    }

    @Override
    public boolean delete(Integer id) {

        PreparedStatement preparedStatement = null;

        boolean result = false;

        try {

            preparedStatement = connection.prepareStatement("DELETE FROM employee_filled " +
                    "WHERE id = ?");
            preparedStatement.setInt(1, id);

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
    public Employee get(Integer id) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        Employee result = null;

        try {

            preparedStatement = connection.prepareStatement("SELECT * FROM employee_filled " +
                    "WHERE id = ?");
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            result = getEmployeeFromResultSet(resultSet);

        } catch (SQLException e) {
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
    public List<Employee> getAll() {

        Statement statement = null;
        ResultSet resultSet = null;

        List<Employee> result = new ArrayList<>();

        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employee_filled");

            while (resultSet.next()) {
                result.add(getEmployeeFromResultSet(resultSet));
            }

        } catch (SQLException e) {
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

    @Override
    public List<Employee> getByName(String name) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<Employee> result = new ArrayList<>();

        try {

            preparedStatement = connection.prepareStatement("SELECT * FROM employee_filled " +
                    "WHERE first_name = ?");
            preparedStatement.setString(1, name);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                result.add(getEmployeeFromResultSet(resultSet));
            }

        } catch (SQLException e) {
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
    public List<Employee> getByPosition(String position) {

        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        List<Employee> result = new ArrayList<>();

        try {

            preparedStatement = connection.prepareStatement("SELECT * FROM employee_filled " +
                    "WHERE position = ?");
            preparedStatement.setString(1, position);


            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                result.add(getEmployeeFromResultSet(resultSet));
            }

        } catch (SQLException e) {
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

    private Employee getEmployeeFromResultSet(ResultSet resultSet) throws SQLException {
        return new Employee(
                new SimpleIntegerProperty(resultSet.getInt(ID)),
                new SimpleStringProperty(resultSet.getString(FIRST_NAME)),
                new SimpleStringProperty(resultSet.getString(LAST_NAME)),
                new SimpleIntegerProperty(resultSet.getInt(AGE)),
                new SimpleIntegerProperty(resultSet.getInt(SALARY)),
                new SimpleBooleanProperty(resultSet.getBoolean(IS_MARRIED)),
                new SimpleStringProperty(resultSet.getString(POSITION))
        );
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Integer getLastId() {
        Integer id = null;

        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT id FROM employee_filled ORDER BY id DESC");
            rs = preparedStatement.executeQuery();

            rs.next();
            id = rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

}

