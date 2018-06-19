package inheritance;

/*
    Order
	- name
	- number
	- products
	- date
 */

import java.util.GregorianCalendar;

public class Order {
    String name;
    int number;
    Product[] products;
    GregorianCalendar date;

    Order() {

    }

    Order(String name, int number, Product[] products, GregorianCalendar date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }
}
