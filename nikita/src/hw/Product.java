package hw;

/**
 * Created by user on 08.05.2018.
 */
public class Product {
    String name;
    int price;
    Category category;

    Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
