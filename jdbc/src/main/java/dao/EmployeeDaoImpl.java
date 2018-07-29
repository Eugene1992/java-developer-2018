package dao;

import connection.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private Connection connection;

    public EmployeeDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public Employee create(Employee employee) {
        Statement statement = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee(name) VALUES(?)");
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
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Employee get(Integer integer) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee getByName(String name) {
        return null;
    }
}
