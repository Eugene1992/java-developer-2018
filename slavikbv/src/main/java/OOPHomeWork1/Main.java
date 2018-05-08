package OOPHomeWork1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static OOPHomeWork1.User.userOrderSumPrice;


public class Main {
    public static void main(String[] args) throws ParseException {


        Category catOne = new Category("Food");
        Category catTwo = new Category("Drinks");

        Product productOne = new Product("Eggs", 10, catOne);
        Product productTwo = new Product("Bread", 10, catOne);
        Product productThree = new Product("Juice", 50, catTwo);
        Product productFour = new Product("Milk", 40, catTwo);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Order orderOne = new Order("Order1", 1, new Product[]{productOne, productTwo}, dateFormat.parse("10/01/2018"));
        Order orderTwo = new Order("Order2", 2, new Product[]{productOne, productThree}, dateFormat.parse("10/02/2018"));
        Order orderThree = new Order("Order3", 3, new Product[]{productOne, productFour}, dateFormat.parse("10/03/2018"));
        Order orderFour = new Order("Order4", 3, new Product[]{productThree, productTwo}, dateFormat.parse("10/04/2018"));


        User userOne = new User("Anna", "Sergeeva", 20, 15000, new Order[]{orderOne, orderFour}, null);
        User userTwo = new User("Marina", "Vsuk", 30, 20000, new Order[]{orderOne, orderThree}, null);
        User userThree = new User("Sasha", "Tihonova", 40, 10000, new Order[]{orderTwo, orderThree}, null);
        User userFour = new User("Alex", "Kozak", 50, 25000, new Order[]{orderThree, orderFour}, null);
        User[] users = {userOne, userTwo, userThree, userFour};

        System.out.println(User.maxSallary(users).firstname + " " + User.maxSallary(users).lastname + " has biggest sallary = " + User.maxSallary(users).salary + "\n");

        User.userAgeInterval(users, 20, 30);
        //TODO 08/05/2018
        System.out.println(userOne.userOrderSumPrice());

        User.purchaceGoods(userOne, catOne);

        userOrderSumPrice(userOne, dateFormat.parse("10/01/2018"), dateFormat.parse("10/04/2018"));

    }
}
