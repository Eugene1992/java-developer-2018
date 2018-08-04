package jdbc.dao;

import jdbc.dao.connection.connectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private Connection connection;

    public EmployeeDaoImpl() {
        this.connection = connectionFactory.getConnection();
    }

    @Override
    public Employee create(Employee employee) {
        Statement statement = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee(name) values(?)");
            preparedStatement.setString(1, employee.getName());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return getAll().get(getAll().size() - 1);
    }

    @Override
    public Employee update(Employee employee) {
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement
                    ("update employee" + "set name = ? where id = " + employee.getId());
            preparedStatement.setString(1, employee.getName());
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
        return get(employee.getId());
    }

    @Override
    public boolean delete(Integer id) {
        Statement statement = null;
        boolean result = false;
        try {
            statement = connection.createStatement();
            result = statement.executeUpdate("delete from employee where id = " + id) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
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
    public Employee get(Integer id) {
        Statement statement = null;
        ResultSet resultSet = null;
        Employee result = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee where id = " + id);
            resultSet.next();
            result = new Employee(
                    resultSet.getInt("id"),
                    resultSet.getString("name")
            );
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
    public List<Employee> getAll() {
        Statement statement = null;
        ResultSet resultSet = null;
        List<Employee> result = new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee");
            while (resultSet.next()) {
                result.add(new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        )
                );
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
        Statement statement = null;
        ResultSet resultSet = null;
        List<Employee> result = new ArrayList<>();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee where name = " + name);
            while (resultSet.next()) {
                result.add(new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("name")
                        )
                );
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
}
