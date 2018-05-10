package hw;

/**
 * Created by user on 08.05.2018.
 */
public class User {
    String firstname;
    String lastname;
    int age;
    int salary;
    Order[] orders;
    User[] friends;

    public User(String firstname, String lastname, int age, int salary, Order[] orders) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
    }

    public User(String firstname, String lastname, int age, int salary, Order[] orders, User[] friends) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Order[] getOrders() {
        return orders;
    }

    static User theBiggestSalaryUser(User[] users) {
        User theBiggestSalary = users[0];
        for (User user : users) {
            if (user.salary > theBiggestSalary.salary)
                theBiggestSalary = user;
        }
        return theBiggestSalary;
    }

}

