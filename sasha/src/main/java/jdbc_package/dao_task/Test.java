package jdbc_package.dao_task;

public class Test {

    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();

        System.out.println("GET ALL");
        for (User user : userDaoImpl.getAll()) {
            System.out.println(user.toString());
        }

        System.out.println("GET");
        System.out.println(userDaoImpl.get(3).toString());

        System.out.println("CREATE");
        User testUser = new User(6, "test", "test", "test", "test", "test");
        User deleteUser = userDaoImpl.create(testUser);
        for (User user : userDaoImpl.getAll()) {
            System.out.println(user.toString());
        }

        System.out.println("DELETE");
        userDaoImpl.delete(deleteUser.getUser_id());
        for (User user : userDaoImpl.getAll()) {
            System.out.println(user.toString());
        }

        System.out.println("UPDATE");
        User updateUser = new User(1, "TestUpdate", "TestUpdate", "TestUpdate", "TestUpdate", "TestUpdate");
        userDaoImpl.update(updateUser);
        for (User user : userDaoImpl.getAll()) {
            System.out.println(user.toString());
        }
    }
}
