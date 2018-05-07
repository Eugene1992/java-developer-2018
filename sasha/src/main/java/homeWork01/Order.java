package homeWork01;

/*
    Order
	- name
	- number
	- products
	- date
 */

import java.util.Date;

public class Order {
    String name;
    int number;
    Product[] products;
    Date date;

    Order() {

    }

    Order(String name, int number, Product[] products, Date date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }
}
