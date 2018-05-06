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
//        - для нахождения пользователя с самой большой зарплатой
        User maxSalaryUser = users[0];
        for (User user : users) {
            if (user.salary > maxSalaryUser.salary)
                maxSalaryUser = user;
        }
        return maxSalaryUser + " has the biggest salary.";
    }

    static String getUsersAgeIntervalIn(User[] users, int from, int to) {
//        - для нахождения пользователей в заданном интервале лет(от и до)
        //User[] usersAgeInterval = new User[users.length];
        String usersAgeInterval = "- in age interval [" + from + ", " + to + "].";
        //int i = 0;
        for (User user : users) {
            if (user.age >= from && user.age <= to) {
                //usersAgeInterval[i] = user;
                //i++;
                usersAgeInterval = user + " " + usersAgeInterval;
            }
        }
        //return Arrays.toString(usersAgeInterval) + " - in age interval [" + from + ", " + to + "].";
        return usersAgeInterval;
    }

    String getUserOrdersSummary() {
//        - для нахождения суммарной цены по всем заказам пользователя
        int sum = 0;
        for (Order order : this.orders) {
            sum += order.getSummaryPrice();
        }
        return this + " has " + sum + " summary orders price.";
    }

    String getUserOrdersSummary(Date from, Date to) {
//       - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
        int sum = 0;
        for (Order order : this.orders) {
            if (order.date.after(from) && order.date.before(to)) {
                sum += order.getSummaryPrice();
            }
        }
        return this + " has " + sum + " summary orders price between " + from + " and " + to + ".";
    }

    String getUserOrderByCategory(Category category) {
//        - для нахождения купленных товаров пользователя по заданной категории
        /*int length = 0;
        for (Order order : this.orders) {
            length += order.products.length;
        }
        int i = 0;

        Product productsByCategory[] = new Product[length];
        */
        String productsByCategory = this + " ordered " + category + ": ";
        for (Order order : this.orders) {
            for (Product product : order.products) {
                if (product.category.equals(category)) {
                    //productsByCategory[i] = product;
                    //i++;
                    productsByCategory += product + " ";
                }
            }
        }
        //return this + " ordered " + category + ": " + Arrays.toString(productsByCategory);
        return productsByCategory;
    }

    String getAmountOfExpensiveOrders(int amount) {
//        - для нахождения заданного количества самых дорогих заказов пользователя
        Order[] expensiveOrders = new Order[amount];
        for (Order expensiveOrder : expensiveOrders) {
            expensiveOrder = new Order();
        }
        /*Order mostExpensiveOrder = expensiveOrders[0];
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
        }*/
        // TODO: 5/6/2018
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
        return "The most expensive orders:\n" + Arrays.toString(expensiveOrders);
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
