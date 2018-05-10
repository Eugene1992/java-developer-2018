package tradeOOPHomework;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Order {
    SimpleDateFormat dateFormat;
    String name;
    int number;
    Product[] products;
    Date date;

    Order() {
    }

    Order(String name, int number, Product[] products, Date date) {
        dateFormat = new SimpleDateFormat("dd.mm.yyyy");
        this.name = name;
        this.number = number;
        this.products = products;
        this.date = date;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
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

    public String getProductList() {
        return Arrays.toString(this.products);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    int getSummaryPrice() {
        int sum = 0;
        for (Product product : this.products) {
            sum += product.price;
        }
        return sum;
    }

    public String toString() {
        return this.name + " #" + this.number + " " + Arrays.toString(products) + "\nPrice = " + getSummaryPrice();
    }
}
