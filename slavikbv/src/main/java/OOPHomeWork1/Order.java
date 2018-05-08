package OOPHomeWork1;

import java.util.Date;

public class Order {
    String name;
    int number;
    Product[] products;
    Date date;

    Order(String name, int number, Product[] products, Date date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }
}
