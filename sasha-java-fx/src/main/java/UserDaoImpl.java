import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Connection connection;

    public UserDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public User create(User entity) {
        int resultID = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("INSERT INTO \"user\"(first_name, last_name, username, password, role) " +
                            "VALUES(?,?,?,?,?)");
            preparedStatement.setString(1, entity.getFirst_name());
            preparedStatement.setString(2, entity.getLast_name());
            preparedStatement.setString(3, entity.getUsername());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getRole());

            preparedStatement.execute();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM \"user\" ORDER BY user_id DESC");
            rs.next();
            resultID = rs.getInt("user_id");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return get(resultID);
    }

    @Override
    public User update(User entity) {
        int resultID = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("UPDATE \"user\" SET first_name = ?, last_name = ?, username = ?, password = ?, role = ?" +
                            "WHERE user_id = ?");
            preparedStatement.setString(1, entity.getFirst_name());
            preparedStatement.setString(2, entity.getLast_name());
            preparedStatement.setString(3, entity.getUsername());
            preparedStatement.setString(4, entity.getPassword());
            preparedStatement.setString(5, entity.getRole());
            preparedStatement.setInt(6, entity.getUser_id());

            preparedStatement.executeUpdate();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM \"user\" ORDER BY user_id DESC");
            rs.next();
            resultID = rs.getInt("user_id");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return get(resultID);
    }

    @Override
    public void delete(Integer integer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("DELETE FROM \"user\"" + "WHERE user_id = ?");
            preparedStatement.setInt(1, integer);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User get(Integer integer) {
        User result = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement
                    ("SELECT * FROM \"user\"" +
                            "WHERE user_id = ?");
            preparedStatement.setInt(1, integer);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();
            result = new User(
                    resultSet.getInt("user_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("role")
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"user\"");

            while (resultSet.next()) {
                result.add(new User(
                        resultSet.getInt("user_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("role")
                ));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
