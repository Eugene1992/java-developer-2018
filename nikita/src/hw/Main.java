package hw;


/**
 * Created by user on 08.05.2018.
 */
public class Main {
    public static void main(String[] args) {

        Category tennis = new Category("ATP Tour");
        Category football = new Category("WTA Tour");
        Category swimming = new Category("Youth Tour");


        Product racket = new Product("Tennis racket", 3600, tennis);
        Product tennisBalls = new Product("Tennis clothes", 1000, tennis);
        Product tennisShoes = new Product("Tennis shoes", 4000, tennis);


        Product ball = new Product("Football ball", 2000, football);
        Product footballShoes = new Product("Footballl shoes", 5000, football);
        Product uniform = new Product("Football clothes", 7000, football);


        Product glasses = new Product("Swimming glasses", 2000, swimming);
        Product trunks = new Product("Swimming trunks", 1500, swimming);
        Product cap = new Product("Swimming cap", 700, swimming);


        Order buyShoes = new Order("To buy any sport clothes", 001, new Product[]{footballShoes, tennisShoes}, 10.09);
        Order buyclothes = new Order("To buy any sport clothes", 002, new Product[]{tennisShoes, uniform, trunks, cap, glasses}, 12.10);
        Order butAccesories = new Order("To buy any sport accessories", 003, new Product[]{racket, ball, tennisBalls}, 11.11);
        Order buyTennis = new Order("To buy tennis things", 004, new Product[]{racket, tennisBalls, tennisShoes}, 12.08);
        Order buyFootball = new Order("To buy football things", 005, new Product[]{ball, footballShoes, uniform}, 05.07);
        Order buySwimming = new Order("To buy swimming things", 007, new Product[]{glasses, trunks, cap}, 07.03);


        User first = new User("Cristiano", "Ronaldo", 33, 520000, new Order[]{buyFootball, buyclothes, butAccesories});
        User second = new User("Roger", "Federer", 37, 630000, new Order[]{buyTennis, buyclothes}, new User[]{first});
        User third = new User("Rafael", "Nadal", 32, 780000, new Order[]{buyTennis, buyFootball}, new User[]{first, second});
        User fourth = new User("Michael", "Phelps", 33, 270000, new Order[]{buySwimming, buyclothes}, new User[]{second, third});
        User fifth = new User("Ryan", "Lochte", 28, 200000, new Order[]{buySwimming, buyTennis}, new User[]{third, fourth});
        User sixth = new User("Lionel", "Messi", 30, 460000, new Order[]{buyFootball, buyclothes}, new User[]{fourth, fifth});
        User seventh = new User("Mohamed", "Salah", 25, 540000, new Order[]{buyFootball, butAccesories}, new User[]{fifth, sixth});

        User[] allUsers = new User[]{first, second, third, fourth, fifth, sixth, seventh};


    }
}
