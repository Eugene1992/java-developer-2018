package homeWork02;

/*
    Order
	- name
	- number
	- products
	- date
 */

import java.util.GregorianCalendar;

public class Order {
    private String name;
    private int number;
    private Product[] products;
    private GregorianCalendar date;

    Order() {

    }

    Order(String name, int number, Product[] products, GregorianCalendar date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
}
