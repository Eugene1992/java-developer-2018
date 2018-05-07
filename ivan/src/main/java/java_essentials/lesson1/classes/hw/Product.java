package java_essentials.lesson1.classes.hw;

/*
	Product
	- name
	- price
	- category
 */
public class Product {
    String name;
    double price;
    Category category;

    Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
