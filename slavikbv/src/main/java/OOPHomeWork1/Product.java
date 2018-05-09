package OOPHomeWork1;

public class Product {
    private String name;
    private int price;
    private Category category;


    Product() {

    }

    ;

    Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;

    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public int getProductPrice() {
        return price;
    }

    public void setProductPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
