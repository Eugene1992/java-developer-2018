package tradeOOPHomework;

public class Product {
    String name;
    int price;
    Category category;

    Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return this.name;
    }

}
