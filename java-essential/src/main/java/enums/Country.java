package enums;

/**
 * Created by Evgeniy on 03.06.2018.
 */
public enum Country {

//    public static final Country UKRAINE = new Country();
//    public static final Country USA = new Country();

    UKRAINE("Ukraine"),
    BELARUS("Republic Belarus"),
    USA("United States of America");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
