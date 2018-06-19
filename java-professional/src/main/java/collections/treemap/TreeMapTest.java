package collections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Product, String> stringMap = new TreeMap<>(/*new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        }*/);

        stringMap.put(new Product(11, "Milk", 10), "Milk");
        stringMap.put(new Product(5, "Beer", 20), "Beer");
        stringMap.put(new Product(12, "Bread", 15), "Bread");

        System.out.println(stringMap);
    }
}
