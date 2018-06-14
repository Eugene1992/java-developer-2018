package iterator_comporator;

import java.util.Comparator;

public class ProductIdComporator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getId() - product2.getId();
    }
}
