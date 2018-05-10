package OOPHomeWork1;

import java.util.Date;

public class Order {
    private String name;
    private int number;
    private Product[] products;
    private Date date;

    Order() {

    }

    ;

    Order(String name, int number, Product[] products, Date date) {
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }

    public String getOrderName() {

        return name;
    }

    public void setOrderName(String name) {
        this.name = name;
    }

    public int getOrderNumber() {
        return number;
    }

    public void setOrderNumber(int number) {
        this.number = number;
    }

    public Date getOrderDate() {
        return date;
    }

    public void setOrderDate(Date date) {
        this.date = date;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
