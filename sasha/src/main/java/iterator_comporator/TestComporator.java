package iterator_comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComporator {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Meat", 200, 1));
        products.add(new Product("Water", 50, 2));
        products.add(new Product("Bread", 10, 3));

        Collections.sort(products);
        System.out.println(products.toString());

        Collections.sort(products, new ProductIdComporator());
        System.out.println(products.toString());

        Collections.sort(products, new ProductNameComporator());
        System.out.println(products.toString());
    }
}
