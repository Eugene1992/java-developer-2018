package OOPHomeWork1;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) throws ParseException {

        Category catOne = new Category("Food");
        //TODO 10/05/17
        //  Category catOne = new Category();
        //  catOne.setCategory("Food");
        Category catTwo = new Category("Drinks");

        //  Product productOne = new Product("Eggs", 10, catOne);
        Product productOne = new Product();
        productOne.setProductName("Eggs");
        productOne.setProductPrice(10);
        productOne.category = catOne;

        //Product productTwo = new Product("Bread", 10, catOne);
        Product productTwo = new Product();
        productTwo.setProductName("Bread");
        productTwo.setProductPrice(10);
        productTwo.category = catOne;

        //Product productThree = new Product("Juice", 50, catTwo);
        Product productThree = new Product();
        productThree.setProductName("Juice");
        productThree.setProductPrice(50);
        productThree.category = catTwo;

        //Product productFour = new Product("Milk", 40, catTwo);
        Product productFour = new Product();
        productFour.setProductName("Milk");
        productFour.setProductPrice(40);
        productFour.category = catTwo;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //Order orderOne = new Order("Order1", 1, new Product[]{productOne, productTwo}, dateFormat.parse("10/01/2018"));
        Order orderOne = new Order();
        orderOne.setOrderName("Order1");
        orderOne.setOrderNumber(1);
        orderOne.products = new Product[]{productOne, productTwo};
        orderOne.setOrderDate(dateFormat.parse("10/01/2018"));

        //Order orderTwo = new Order("Order2", 2, new Product[]{productOne, productThree}, dateFormat.parse("10/02/2018"));
        Order orderTwo = new Order();
        orderTwo.setOrderName("Order2");
        orderTwo.setOrderNumber(2);
        orderTwo.products = new Product[]{productOne, productThree};
        orderTwo.setOrderDate(dateFormat.parse("10/02/2018"));

        //Order orderThree = new Order("Order3", 3, new Product[]{productOne, productFour}, dateFormat.parse("10/03/2018"));
        Order orderThree = new Order();
        orderThree.setOrderName("Order3");
        orderThree.setOrderNumber(3);
        orderThree.products = new Product[]{productOne, productFour};
        orderThree.setOrderDate(dateFormat.parse("10/03/2018"));

        //Order orderFour = new Order("Order4", 4, new Product[]{productThree, productTwo}, dateFormat.parse("10/04/2018"));
        Order orderFour = new Order();
        orderFour.setOrderName("Order4");
        orderFour.setOrderNumber(4);
        orderFour.products = new Product[]{productThree, productTwo};
        orderFour.setOrderDate(dateFormat.parse("10/04/2018"));

        //User userOne = new User("Anna", "Sergeeva", 20, 15000, new Order[]{orderOne, orderFour}, null);
        User userOne = new User();
        userOne.setFirstname("Anna");
        userOne.setLastname("Sergeeva");
        userOne.setAge(20);
        userOne.setSalary(15000);
        userOne.orders = new Order[]{orderOne, orderFour};

        //User userTwo = new User("Marina", "Vsuk", 30, 20000, new Order[]{orderOne, orderThree}, null);
        User userTwo = new User();
        userTwo.setFirstname("Marina");
        userTwo.setLastname("Vsuk");
        userTwo.setAge(30);
        userTwo.setSalary(20000);
        userTwo.orders = new Order[]{orderOne, orderThree};

        //User userThree = new User("Sasha", "Tihonova", 40, 10000, new Order[]{orderTwo, orderThree}, null);
        User userThree = new User();
        userThree.setFirstname("Sasha");
        userThree.setLastname("Tihonova");
        userThree.setAge(40);
        userThree.setSalary(10000);
        userThree.orders = new Order[]{orderTwo, orderThree};

        //User userFour = new User("Alex", "Kozak", 50, 25000, new Order[]{orderThree, orderFour}, null);
        User userFour = new User();
        userFour.setFirstname("Alex");
        userFour.setLastname("Kozak");
        userFour.setAge(50);
        userFour.setSalary(25000);
        userFour.orders = new Order[]{orderThree, orderFour};

        User[] users = {userOne, userTwo, userThree, userFour};

        System.out.println(User.maxSallary(users).getFirstname() + " " + User.maxSallary(users).getLastname() + " has biggest sallary = " + User.maxSallary(users).getSalary() + "\n");
        System.out.println();

        User.userAgeInterval(users, 20, 30);
        System.out.println();

        System.out.println("user " + userOne.getFirstname() + " has total order sum= " + userOne.userOrderSumPrice());
        System.out.println();

        System.out.println("user " + userOne.getFirstname() + " has bought " + User.purchaceGoods(userOne, catOne) + " goods from category " + catOne.name);
        System.out.println();

        System.out.println(userOne.userOrderSumPrice(dateFormat.parse("09/01/2018"), dateFormat.parse("09/03/2018")));
    }
}
