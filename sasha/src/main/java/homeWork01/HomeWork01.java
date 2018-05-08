package homeWork01;

/*
    1. Создать классы с полями:

	Category
	- name

	Product
	- name
	- price
	- category

	Order
	- name
	- number
	- products
	- date

	User
	- firstname
	- lastname
	- age
	- salary
	- orders
	- friends

    2. Написать методы:

    - для нахождения пользователя с самой большой зарплатой
    - для нахождения пользователей в заданном интервале лет(от и до)
    - для нахождения суммарной цены по всем заказам пользователя
    - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
    - для нахождения купленных товаров пользователя по заданной категории
    - для нахождения заданного количества самых дорогих заказов пользователя
 */

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class HomeWork01 {
    public static void main(String[] args) {
        Category computerCategory = new Category("computer");
        Category foodCategory = new Category("food");
        Category chemicalCategory = new Category("chemical");

        Product acerComputer = new Product("Acer notebook", 15000, computerCategory);
        Product asusComputer = new Product("Asus notebook", 25000, computerCategory);
        Product bread = new Product("Bread", 5, foodCategory);
        Product apple = new Product("Apple", 10, foodCategory);
        Product cake = new Product("Cake", 100, foodCategory);
        Product toothpaste = new Product("Lacalut White", 30, chemicalCategory);
        Product deodorante = new Product("Axe", 60, chemicalCategory);

        Product[] order1Products = {acerComputer, bread, apple, toothpaste, deodorante};
        Product[] order2Products = {asusComputer, cake, apple};
        Product[] order3Products = {bread, apple, toothpaste, deodorante, cake};

        Order order1 = new Order("order1", 123456, order1Products, new GregorianCalendar(2018, 2, 15));
        Order order2 = new Order("order2", 234567, order2Products, new GregorianCalendar(2018, 3, 23));
        Order order3 = new Order("order3", 345678, order3Products, new GregorianCalendar(2018, 4, 6));

        Order[] ordersOfUser1 = {order1, order3};
        Order[] ordersOfUser2 = {order2, order3};
        Order[] ordersOfUser3 = {order1, order2};

        User user1 = new User("Ivan", "Petrov", 23, 15000, ordersOfUser1);
        User user2 = new User("Tom", "Marlov", 19, 7000, ordersOfUser2);
        User user3 = new User("Anna", "Lubimova", 45, 50000, ordersOfUser3);
        User[] allUsers = {user1, user2, user3};

        System.out.println("==========");
        userWithBiggerSalary(allUsers);
        System.out.println("==========");
        userFromManageAgeInterval(allUsers, 18, 40);
        System.out.println("==========");
        sumOfAllUserOrders(user2);
        System.out.println("==========");
        sumOfAllUserOrdersInTimeInterval(user1, new GregorianCalendar(2018, 2, 1), new GregorianCalendar(2018, 4, 7));
        System.out.println("==========");
        allUsersProductsFromPredeterminedCategory(user1, chemicalCategory);
        System.out.println("==========");
        mostExpensiveUsersProducts(user1, 3);
    }

    public static void userWithBiggerSalary(User[] users) {
        User maxSalaryUser = users[0];
        for (int i = 0; i < users.length; i++) {
            if (maxSalaryUser.salary < users[i].salary) {
                maxSalaryUser = users[i];
            }
        }
        System.out.println("# User with bigger salary is:");
        System.out.println(maxSalaryUser.firstname + " " + maxSalaryUser.lastname + " age: " + maxSalaryUser.age);
    }

    public static void userFromManageAgeInterval(User[] users, int beginInterval, int endInterval) {
        System.out.println("# User in age interval from " + beginInterval + " to " + endInterval);
        for (int i = 0; i < users.length; i++) {
            if ((users[i].age > beginInterval) && (users[i].age < endInterval)) {
                System.out.println(users[i].firstname + " " + users[i].lastname + " age " + users[i].age);
            }
        }
    }

    public static void sumOfAllUserOrders(User user) {
        System.out.println("# Sum for all users orders:");
        int sum = 0;
        for (int i = 0; i < user.orders.length; i++) {
            System.out.println((i + 1) + ") " + user.orders[i].name);
            for (int j = 0; j < user.orders[i].products.length; j++) {
                System.out.println(user.orders[i].products[j].name + " - " + user.orders[i].products[j].price);
                sum += user.orders[i].products[j].price;
            }
        }
        System.out.println(user.firstname + " " + user.lastname + " sum for all orders: " + sum);
    }

    public static void sumOfAllUserOrdersInTimeInterval(User user, GregorianCalendar beginOfInterval, GregorianCalendar endOfInterval) {
        System.out.println("# Sum for all users orders in Time Interval from: " + beginOfInterval.getTime().toString() + " to: " + endOfInterval.getTime().toString());
        int sum = 0;
        for (int i = 0; i < user.orders.length; i++) {
            System.out.println((i + 1) + ") " + user.orders[i].name);
            for (int j = 0; j < user.orders[i].products.length; j++) {
                if ((user.orders[i].date.before(endOfInterval)) && (user.orders[i].date.after(beginOfInterval))) {
                    System.out.println(user.orders[i].products[j].name + " - " + user.orders[i].products[j].price);
                    sum += user.orders[i].products[j].price;
                }
            }
        }
        System.out.println(user.firstname + " " + user.lastname + " sum for all orders: " + sum);
    }

    public static void allUsersProductsFromPredeterminedCategory(User user, Category category) {
        System.out.println("# All users products from predetermined category: " + category.name);
        for (int i = 0; i < user.orders.length; i++) {
            System.out.println((i + 1) + ") " + user.orders[i].name);
            for (int j = 0; j < user.orders[i].products.length; j++) {
                if (user.orders[i].products[j].category == category) {
                    System.out.println("Product: " + user.orders[i].products[j].name + " Category: " + user.orders[i].products[j].category.name);
                }
            }
        }
    }

    public static void mostExpensiveUsersProducts(User user, int count) {
        System.out.println("# Most expensive users products, count: " + count);
        ArrayList<Product> mostExpensiveProducts = new ArrayList<Product>();
        for (int i = 0; i < user.orders.length; i++) {
            for (int j = 0; j < user.orders[i].products.length; j++) {
                mostExpensiveProducts.add(user.orders[i].products[j]);
            }
        }
        Product changeProduct;
        int k;
        for (int i = 0; i < mostExpensiveProducts.size(); i++) {
            Product maxProduct = mostExpensiveProducts.get(i);
            k = i;
            for (int j = i + 1; j < mostExpensiveProducts.size(); j++) {
                if (mostExpensiveProducts.get(j).price > maxProduct.price) {
                    maxProduct = mostExpensiveProducts.get(j);
                    k = j;
                }
            }
            if (i != k) {
                changeProduct = mostExpensiveProducts.get(k);
                mostExpensiveProducts.set(k, mostExpensiveProducts.get(i));
                mostExpensiveProducts.set(i, changeProduct);
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(mostExpensiveProducts.get(i).name + " " + mostExpensiveProducts.get(i).price);
        }
    }
}
