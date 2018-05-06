package tradeOOPHomework;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Order {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
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
