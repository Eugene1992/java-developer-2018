package java_essentials.lesson1.classes.hw;

/*
2. Написать методы:
- для нахождения пользователя с самой большой зарплатой
- для нахождения пользователей в заданном интервале лет(от и до)
- для нахождения суммарной цены по всем заказам пользователя
- для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
- для нахождения купленных товаров пользователя по заданной категории
- для нахождения заданного количества самых дорогих заказов пользователя
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserRunner {
    public static void main(String[] args) {
        Category catMeat = new Category("Meat");
        Category catMeals = new Category("Meals");
        Category catAlcohol = new Category("Alcohol");

        Product prChicken = new Product("Chicken", 124.5, catMeat);
        Product prBurger = new Product("Burger", 150, catMeals);
        Product prShashlyk = new Product("Shashlyk", 200, catMeals);
        Product prBeer = new Product("Beer", 37, catAlcohol);
        Product prWine = new Product("Wine", 60, catAlcohol);
        Product prVodka = new Product("Vodka", 10, catAlcohol);

        Order order1 = new Order("Friday Dinner", 1, new Product[]{prBurger, prBeer}, string2Date("2018-05-01", "yyyy-MM-dd"));
        Order order2 = new Order("Heavy Meal", 2, new Product[]{prShashlyk, prVodka}, string2Date("2018-03-29", "yyyy-MM-dd"));
        Order order3 = new Order("Chicken Meal", 2, new Product[]{prChicken}, string2Date("2018-02-20", "yyyy-MM-dd"));
        Order order4 = new Order("NormCore", 2, new Product[]{prChicken, prWine}, string2Date("2018-01-23", "yyyy-MM-dd"));

        User user1 = new User("Alex", "Smith", (byte) 25, 10000, new Order[]{order1, order2}, null);
        User user2 = new User("Matthew", "McConaughey", (byte) 48, 50000, new Order[]{order3, order4}, new User[]{user1});
        User user3 = new User("Jina", "Linetti", (byte) 32, 5000, new Order[]{order3}, new User[]{user1, user2});
        User user4 = new User("Jacob", "Peralta", (byte) 25, 10000, new Order[]{order1, order2, order3, order4}, new User[]{user1, user2, user3});

        User[] users = new User[]{user1, user2, user3, user4};

        // - для нахождения пользователя с самой большой зарплатой
        System.out.println("------------------------------");
        User guyWithBiggestSalary = getUserWithMaxSalary(users);
        System.out.println("Guy with biggest salary: " + guyWithBiggestSalary.firstname + " " + guyWithBiggestSalary.lastname + "; Salary: " + guyWithBiggestSalary.salary);

        // - для нахождения пользователей в заданном интервале лет(от и до)
        System.out.println("------------------------------");
        getByAge(users, (byte) 10, (byte) 40);

        // - для нахождения суммарной цены по всем заказам пользователя
        System.out.println("------------------------------");
        User checkUser = user1;
        System.out.println(checkUser.firstname + " " + checkUser.lastname + " spent [" + getUserTotalOrdersAmt(checkUser) + "$]");

        // - для нахождения суммарной цены по заказам пользователя в заданном интервале времени(от и до по date)
        System.out.println("------------------------------");
        checkUser = user1;
        Date fromDate = string2Date("2018-03-29", "yyyy-MM-dd");
        Date toDate = string2Date("2020-03-29", "yyyy-MM-dd");
        System.out.println(checkUser.firstname + " "
                + checkUser.lastname + " spent ["
                + getUserTotalOrdersAmtByDate(checkUser, fromDate, toDate)
                + "$] from [" + fromDate.toString() + "] till [" + toDate + "]");
    }

    private static Date string2Date(String inStr, String inDateFormat) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(inDateFormat);
        try {
            return dateFormat.parse(inStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static User getUserWithMaxSalary(User[] inUsers) {
        User outUser = inUsers[0];

        for (User usr : inUsers) {
            if (outUser.salary < usr.salary) {
                outUser = usr;
            }
        }
        return outUser;
    }

    private static void getByAge(User[] inUsers, byte fromAge, byte toAge) {
        for (User usr : inUsers) {
            if (usr.age >= fromAge && usr.age <= toAge) {
                System.out.println("Found user: " + usr.firstname + " " + usr.lastname + "; Age: " + usr.age);
            }
        }
    }

    private static double getUserTotalOrdersAmt(User inUser) {
        double totalAmt = 0;
        for (Order ordr : inUser.orders) {
            for (Product pr : ordr.products) {
                totalAmt = totalAmt + pr.price;
            }
        }
        return totalAmt;
    }

    private static double getUserTotalOrdersAmtByDate(User inUser, Date inFromDate, Date inTillDate) {
        double totalAmt = 0;
        for (Order ordr : inUser.orders) {
            for (Product pr : ordr.products) {
                if (ordr.date.compareTo(inFromDate) >= 0 && ordr.date.compareTo(inTillDate) <= 0) {
                    totalAmt = totalAmt + pr.price;
                }
            }
        }
        return totalAmt;
    }

}
