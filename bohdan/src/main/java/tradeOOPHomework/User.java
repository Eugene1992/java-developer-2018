package tradeOOPHomework;

import java.util.Arrays;
import java.util.Date;

public class User {
    String firstName;
    String lastName;
    int age;
    int salary;
    Order[] orders;
    User[] friends;


    User(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    User(String firstName, String lastName, int age, int salary, Order[] orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
    }

    User(String firstName, String lastName, int age, int salary, Order[] orders, User[] friends) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }

    static User getMaxSalaryUser(User[] users) {
//        - для нахождения пользователя с самой большой зарплатой
        User maxSalaryUser = users[0];
        for (User user : users) {
            if (user.salary > maxSalaryUser.salary)
                maxSalaryUser = user;
        }
        return maxSalaryUser;
    }

    static User[] getUsersAgeIntervalIn(User[] users, int from, int to) {
//        - для нахождения пользователей в заданном интервале лет(от и до)
        User[] usersAgeInterval = new User[users.length];
        int i = 0;
        for (User user : users) {
            if (user.age >= from && user.age <= to) {
                usersAgeInterval[i] = user;
                i++;
            }
        }
        return usersAgeInterval;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public String getOrderList() {
        return Arrays.toString(this.orders);
    }

    public int getAmountOfOrderedProducts() {
        int length = 0;
        for (Order order : this.orders) {
            length += order.products.length;
        }
        return length;
    }

    public User[] getFriends() {
        return friends;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }

    public String getFriendList() {
        return Arrays.toString(this.friends);
    }

    int getUserOrdersSummary() {
//        - для нахождения суммарной цены по всем заказам пользователя
        int sum = 0;
        for (Order order : this.orders) {
            sum += order.getSummaryPrice();
        }
        return sum;
    }

    int getUserOrdersSummary(Date from, Date to) {
//       - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
        int sum = 0;
        for (Order order : this.orders) {
            if (order.date.after(from) && order.date.before(to)) {
                sum += order.getSummaryPrice();
            }
        }
        return sum;
    }

    Product[] getUserOrderByCategory(Category category) {
//        - для нахождения купленных товаров пользователя по заданной категории
        Product productsByCategory[] = new Product[this.getAmountOfOrderedProducts()];
        int i = 0;
        for (Order order : this.orders) {
            for (Product product : order.products) {
                if (product.category.equals(category)) {
                    productsByCategory[i] = product;
                    i++;
                }
            }
        }
        return productsByCategory;
    }

    Order[] getAmountOfExpensiveOrders(int amount) {
//        - для нахождения заданного количества самых дорогих заказов пользователя
        Order[] expensiveOrders = new Order[amount];
        for (int i = 0; i < amount; i++) {
            expensiveOrders[i] = this.orders[0];
        }
        for (int i = 0; i < amount; i++) {
            inner:
            for (int j = 0; j < this.orders.length; j++) {
                if (this.orders[j].getSummaryPrice() > expensiveOrders[i].getSummaryPrice()) {
                    for (int k = 0; k < amount; k++) {
                        if (this.orders[j].equals(expensiveOrders[k])) {
                            continue inner;
                        }
                    }
                    expensiveOrders[i] = this.orders[j];
                }
            }
        }
        return expensiveOrders;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
