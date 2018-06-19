package collections.treemap;

public class Product implements Comparable<Product> {
    private long num;
    private String name;
    private int price;

    public Product(long num, String name, int price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return o.getPrice() - this.getPrice();
    }
}
