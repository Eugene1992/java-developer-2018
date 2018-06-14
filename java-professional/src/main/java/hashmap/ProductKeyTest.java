package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductKeyTest {
    public static void main(String[] args) {
        Map<Product, String> products = new LinkedHashMap<>();

        Product product1 = new Product(1, "Milk", 10);
        Product product2 = new Product(2, "Beer", 20);
        Product product3 = new Product(3, "Oil", 30);
        Product product4 = new Product(4, "Sugar", 5);
        Product product5 = new Product(5, "Egg", 2);

        products.put(product1, "One");
        products.put(product2, "Two");
        products.put(product3, "Three");
        products.put(product4, "Three");
        products.put(product5, "Three");

        System.out.println(products);
    }

}
