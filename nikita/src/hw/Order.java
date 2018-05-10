package hw;

import java.util.Date;

/**
 * Created by user on 08.05.2018.
 */
public class Order {
    String name;
    int number;
    Product[] products;
    double date;

    Order(String name, int number, Product[] products, double date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }
}
