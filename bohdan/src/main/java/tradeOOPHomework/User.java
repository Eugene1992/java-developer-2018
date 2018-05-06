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

    static String getMaxSalaryUser(User[] users) {
        User maxSalaryUser = users[0];
        for (User user : users) {
            if (user.salary > maxSalaryUser.salary)
                maxSalaryUser = user;
        }
        return maxSalaryUser + " has the biggest salary.";
    }

    static String getUsersAgeIntervalIn(User[] users, int from, int to) {
        User[] usersAgeInterval = new User[users.length];
        int i = 0;
        for (User user : users) {
            if (user.age >= from && user.age <= to) {
                usersAgeInterval[i] = user;
                i++;
            }
        }
        return Arrays.toString(usersAgeInterval) + " - in age interval [" + from + ", " + to + "].";
    }

    String getUserOrdersSummary() {
        int sum = 0;
        for (Order order : this.orders) {
            sum += order.getSummaryPrice();
        }
        return this + " has " + sum + " summary orders price.";
    }

    String getUserOrdersSummary(Date from, Date to) {
        int sum = 0;
        for (Order order : this.orders) {
            if (order.date.after(from) && order.date.before(to)) {
                sum += order.getSummaryPrice();
            }
        }
        return this + " has " + sum + " summary orders price.";
    }

    String getUserOrderByCategory(Category category) {
        int length = 0;
        for (Order order : this.orders) {
            length += order.products.length;
        }
        int i = 0;
        Product productsByCategory[] = new Product[length];
        for (Order order : this.orders) {
            for (Product product : order.products) {
                if (product.category.equals(category)) {
                    productsByCategory[i] = product;
                    i++;
                }
            }
        }
        return this + " ordered " + category + ": " + Arrays.toString(productsByCategory);
    }

    String getAmountOfExpensiveOrders(int amount) {
        Order[] expensiveOrders = new Order[amount];
        Order mostExpensiveOrder = expensiveOrders[0];
        int i = 0;
        while (expensiveOrders[amount - 1] == null) {
            outer:
            for (Order order : this.orders) {
                if (order.getSummaryPrice() > mostExpensiveOrder.getSummaryPrice()) {
                    for (Order expensiveOrder : expensiveOrders) {
                        if (order.equals(expensiveOrder)) {
                            continue outer;
                        }
                        expensiveOrders[i] = order;
                        i++;
                    }
                }
            }
        }
        return "The most expensive orders:\n" + Arrays.toString(expensiveOrders);
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
