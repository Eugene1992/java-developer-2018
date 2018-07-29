package examples.simple_orm;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * Created by yede0517 on 7/26/2018.
 */
public class SampleJDBC {
    private static final String USERNAME = "nykgmqvvdcegwm";
    private static final String PASSWORD = "bf201d90be9b4ae104d4aaa76ac8f63c8482ad8ff94f4d010f25f861066f8690";
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://ec2-54-228-251-254.eu-west-1.compute.amazonaws.com:5432/d3kqlpsdudhcij" +
            "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
//        final List<Employee> employees = getEntity("SELECT * FROM employee", Employee.class);
//        final List<User> users = getEntity("SELECT * FROM t_user", User.class);

//        System.out.println(users);
    }

}
