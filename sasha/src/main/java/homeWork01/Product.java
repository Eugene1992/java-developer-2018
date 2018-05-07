package homeWork01;

/*
    Product
	- name
	- price
	- category
 */

public class Product {
    String name;
    int price;
    Category category;

    Product() {

    }

    Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
