package homeWork02;

/*
   1. Переделать 1ое домащнее задание, закрыв поля классов и переписать доступ к ним через Setters и Getters
 */

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class HomeWork02 {
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

    //    - для нахождения пользователя с самой большой зарплатой
    private static User userWithBiggerSalary(User[] users) {
        User maxSalaryUser = users[0];
        for (int i = 0; i < users.length; i++) {
            if (maxSalaryUser.getSalary() < users[i].getSalary()) {
                maxSalaryUser = users[i];
            }
        }
        System.out.println("# User with bigger salary is:");
        System.out.println(maxSalaryUser.getFirstname() + " " + maxSalaryUser.getLastname() + " age: " + maxSalaryUser.getAge());
        return maxSalaryUser;
    }

    //    - для нахождения пользователей в заданном интервале лет(от и до)
    private static ArrayList<User> userFromManageAgeInterval(User[] users, int beginInterval, int endInterval) {
        System.out.println("# User in age interval from " + beginInterval + " to " + endInterval);
        ArrayList<User> usersFromInterval = new ArrayList<User>();
        for (int i = 0; i < users.length; i++) {
            if ((users[i].getAge() > beginInterval) && (users[i].getAge() < endInterval)) {
                System.out.println(users[i].getFirstname() + " " + users[i].getLastname() + " age " + users[i].getAge());
                usersFromInterval.add(users[i]);
            }
        }
        return usersFromInterval;
    }

    //     - для нахождения суммарной цены по всем заказам пользователя
    private static int sumOfAllUserOrders(User user) {
        System.out.println("# Sum for all users orders:");
        int sum = 0;
        for (int i = 0; i < user.getOrders().length; i++) {
            System.out.println((i + 1) + ") " + user.getOrders()[i].getName());
            for (int j = 0; j < user.getOrders()[i].getProducts().length; j++) {
                System.out.println(user.getOrders()[i].getProducts()[j].getName() + " - " + user.getOrders()[i].getProducts()[j].getPrice());
                sum += user.getOrders()[i].getProducts()[j].getPrice();
            }
        }
        System.out.println(user.getFirstname() + " " + user.getLastname() + " sum for all orders: " + sum);
        return sum;
    }

    //    - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
    private static int sumOfAllUserOrdersInTimeInterval(User user, GregorianCalendar beginOfInterval, GregorianCalendar endOfInterval) {
        System.out.println("# Sum for all users orders in Time Interval from: " + beginOfInterval.getTime().toString() + " to: " + endOfInterval.getTime().toString());
        int sum = 0;
        for (int i = 0; i < user.getOrders().length; i++) {
            System.out.println((i + 1) + ") " + user.getOrders()[i].getName());
            for (int j = 0; j < user.getOrders()[i].getProducts().length; j++) {
                if ((user.getOrders()[i].getDate().before(endOfInterval)) && (user.getOrders()[i].getDate().after(beginOfInterval))) {
                    System.out.println(user.getOrders()[i].getProducts()[j].getName() + " - " + user.getOrders()[i].getProducts()[j].getPrice());
                    sum += user.getOrders()[i].getProducts()[j].getPrice();
                }
            }
        }
        System.out.println(user.getFirstname() + " " + user.getLastname() + " sum for all orders: " + sum);
        return sum;
    }

    //    - для нахождения купленных товаров пользователя по заданной категории
    private static ArrayList<Product> allUsersProductsFromPredeterminedCategory(User user, Category category) {
        System.out.println("# All users products from predetermined category: " + category.getName());
        ArrayList<Product> productsFromPredeterminedCategory = new ArrayList<Product>();
        for (int i = 0; i < user.getOrders().length; i++) {
            System.out.println((i + 1) + ") " + user.getOrders()[i].getName());
            for (int j = 0; j < user.getOrders()[i].getProducts().length; j++) {
                if (user.getOrders()[i].getProducts()[j].getCategory() == category) {
                    productsFromPredeterminedCategory.add(user.getOrders()[i].getProducts()[j]);
                    System.out.println("Product: " + user.getOrders()[i].getProducts()[j].getName() + " Category: " + user.getOrders()[i].getProducts()[j].getCategory().getName());
                }
            }
        }
        return productsFromPredeterminedCategory;
    }

    //    - для нахождения заданного количества самых дорогих заказов пользователя
    private static ArrayList<Product> mostExpensiveUsersProducts(User user, int count) {
        System.out.println("# Most expensive users products, count: " + count);
        ArrayList<Product> mostExpensiveProducts = new ArrayList<Product>();
        for (int i = 0; i < user.getOrders().length; i++) {
            for (int j = 0; j < user.getOrders()[i].getProducts().length; j++) {
                mostExpensiveProducts.add(user.getOrders()[i].getProducts()[j]);
            }
        }
        Product changeProduct;
        int k;
        for (int i = 0; i < mostExpensiveProducts.size(); i++) {
            Product maxProduct = mostExpensiveProducts.get(i);
            k = i;
            for (int j = i + 1; j < mostExpensiveProducts.size(); j++) {
                if (mostExpensiveProducts.get(j).getPrice() > maxProduct.getPrice()) {
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
            System.out.println(mostExpensiveProducts.get(i).getName() + " " + mostExpensiveProducts.get(i).getPrice());
        }
        return mostExpensiveProducts;
    }
}
