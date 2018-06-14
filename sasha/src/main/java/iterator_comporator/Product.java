package iterator_comporator;


public class Product implements Comparable<Product> {
    String name;
    int price;
    int id;

    Product() {

    }

    Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Product product) {
        if (this.getPrice() < product.getPrice()) {
            return -1;
        } else if (this.getPrice() > product.getPrice()) {
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
