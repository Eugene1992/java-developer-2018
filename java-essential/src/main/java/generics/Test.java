package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        Pair one = new Pair(1, "One");
        Pair two = new Pair("Two", "Two");

        Pair milk = new Pair(1, new Product("Milk"));
        Object value = milk.getValue();

        GenericPair<Integer, Product> genericPair1 = new GenericPair<>(1, new Product("Milk"));
        GenericPair<Integer, String> genericPair2 = new GenericPair<>(2, "Hello world!");

        Product value1 = genericPair1.getValue();
    }
}
