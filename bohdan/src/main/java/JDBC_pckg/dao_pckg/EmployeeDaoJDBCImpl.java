package JDBC_pckg.dao_pckg;

import JDBC_pckg.ConnectionFactory;
import JDBC_pckg.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoJDBCImpl implements EmployeeDao {

    public static final String ID = "id";
    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String AGE = "age";
    public static final String SALARY = "salary";
    public static final String IS_MARRIED = "is_married";
    public static final String POSITION = "position";
    private Connection connection;

    public EmployeeDaoJDBCImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    // TODO: 7/29/2018  PSQLException: Returning autogenerated keys is only supported for 8.2 and later servers.
    @Override
    public Employee create(Employee employee) {

        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

//        int id = 0;

        try {

            preparedStatement = connection.prepareStatement
                    ("INSERT INTO employee_filled(first_name, last_name, age, salary, is_married,/* birthdate,*/ position) " +
                            "VALUES(?, ?, ?, ?, ?,/* ?,*/ ?)"/*, Statement.RETURN_GENERATED_KEYS*/);

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setInt(4, employee.getSalary());
            preparedStatement.setBoolean(5, employee.is_married());
//            preparedStatement.setString(6, employee.getBirthdate());
            preparedStatement.setString(6, employee.getPosition());

            preparedStatement.execute();

            /*rs = preparedStatement.getGeneratedKeys();

            rs.next();
            id = rs.getInt("id");*/

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

//        return id == 0 ? null : get(id);

        return get(getLastId());
    }

    @Override
    public Employee update(Employee employee) {

        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement
                    ("UPDATE employee_filled " +
                            "SET first_name = ?, last_name = ?, age = ?, salary = ?, is_married = ?,/* birthdate = ?,*/ position = ? " +
                            "WHERE id = ?");

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setInt(3, employee.getAge());
            preparedStatement.setInt(4, employee.getSalary());
            preparedStatement.setBoolean(5, employee.is_married());
//            preparedStatement.setString(6, employee.getBirthdate());
//            preparedStatement.setString(6, employee.getBirthdate());
            preparedStatement.setString(6, employee.getPosition());
            preparedStatement.setInt(7, employee.getId());

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
                resultSet.getInt(ID),
                resultSet.getString(FIRST_NAME),
                resultSet.getString(LAST_NAME),
                resultSet.getInt(AGE),
                resultSet.getInt(SALARY),
                resultSet.getBoolean(IS_MARRIED),
                resultSet.getString(POSITION)
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
