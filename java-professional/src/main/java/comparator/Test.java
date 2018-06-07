package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 12));
        products.add(new Product("Bread", 12));
        products.add(new Product("Bear", 12));
        products.add(new Product("Oil", 32));
        products.add(new Product("Meat", 120));
        products.add(new Product("Egg", 2));

        System.out.println(products);

//        Collections.sort(products);
        Collections.sort(products, new ProductByPriceComporator());
        System.out.println(products);

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(products);
    }
}
