package iterator_comporator;

import java.util.Comparator;

public class ProductNameComporator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().compareTo(product2.getName());
    }
}