package jdbc_package.dao_task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Connection connection;

    public UserDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public User create(User entity) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO \"user\"(first_name, last_name, username, password, role) " +
                    "VALUES((?),(?),(?),(?),(?))");
            preparedStatement.setString(1, entity.getFirst_name());
            preparedStatement.setString(2, entity.getLast_name());
            preparedStatement.setString(3, entity.getUsername());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getRole());

//            preparedStatement.getGeneratedKeys().
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public User get(Integer integer) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
