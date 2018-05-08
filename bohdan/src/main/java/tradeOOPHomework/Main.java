package tradeOOPHomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static tradeOOPHomework.User.getMaxSalaryUser;
import static tradeOOPHomework.User.getUsersAgeIntervalIn;

public class Main {
    public static void main(String[] args) throws ParseException {
        Category food = new Category("Food");
        Category houseHoldGoods = new Category("Household goods");
        Category drink = new Category("Drink");

        Product meat = new Product("Chiken", 40, food);
        Product pasta = new Product("Pasta", 21, food);
        Product fruit = new Product("Fruit", 12, food);

        Product detergent = new Product("Detergent", 30, houseHoldGoods);
        Product bast = new Product("Bast", 15, houseHoldGoods);

        Product cola = new Product("Coca-cola", 22, drink);
        Product milk = new Product("Milk", 25, drink);
        Product soda = new Product("Soda", 18, drink);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");

        Order toEat = new Order("To eat", 1,
                new Product[]{meat, pasta}, dateFormat.parse("01.05.2018"));
        Order toDrink = new Order("To drink", 4,
                new Product[]{cola, soda}, dateFormat.parse("29.04.2018"));
        Order toHouseheld = new Order("To househeld", 5,
                new Product[]{detergent, bast}, dateFormat.parse("25.04.2018"));
        Order toEatAndDrink = new Order("To eat and drink", 2,
                new Product[]{meat, fruit, cola}, dateFormat.parse("03.05.2018"));
        Order toEatAndHouseheld = new Order("To eat and househeld", 6,
                new Product[]{meat, fruit, bast}, dateFormat.parse("04.05.2018"));
        Order toDrinkAndHouseheld = new Order("To drink and househeld", 7,
                new Product[]{soda, milk, detergent}, dateFormat.parse("05.04.2018"));
        Order toEatDrinkAndHouseheld = new Order("To eat, drink and househeld", 3,
                new Product[]{pasta, fruit, milk, detergent}, dateFormat.parse("30.04.2018"));

        User firstUser = null;
        User secondUser = null;
        User thirdUser = null;
        User fourthUser = null;
        firstUser = new User("Ivan", "Ivanenko", 23,
                10000, new Order[]{toEat, toDrinkAndHouseheld});
        secondUser = new User("Petr", "Petrov", 20,
                8000, new Order[]{toDrink, toEatAndHouseheld}, new User[]{thirdUser});
        thirdUser = new User("Anna", "Hannenko", 19,
                6000, new Order[]{toEatDrinkAndHouseheld}, new User[]{secondUser, fourthUser});
        fourthUser = new User("Akakiy", "Akienko", 30,
                20000, new Order[]{toEatAndDrink, toHouseheld, toEatDrinkAndHouseheld, toDrinkAndHouseheld}, new User[]{thirdUser});

        User[] allUsers = new User[]{firstUser, secondUser, thirdUser, fourthUser};

        System.out.println(getMaxSalaryUser(allUsers));

        System.out.println(getUsersAgeIntervalIn(allUsers, 20, 25));

        System.out.println(fourthUser.getUserOrdersSummary());
        System.out.println(fourthUser.getUserOrdersSummary(dateFormat.parse("01.05.2018"),
                dateFormat.parse("05.05.2018")));

        System.out.println(fourthUser.getUserOrderByCategory(food));

        System.out.println(fourthUser.getAmountOfExpensiveOrders(1));
    }
}
