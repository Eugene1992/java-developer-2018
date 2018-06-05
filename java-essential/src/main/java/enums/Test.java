package enums;

public class Test {
    public static void main(String[] args) {
        Country ukraine = Country.UKRAINE;
//        System.out.println(ukraine);
//        System.out.println(ukraine.getName());

        for (Country country : Country.values()) {
            System.out.println(country.name() + " - " + country.getName());
        }

        Country usa = Country.valueOf("USA");
        System.out.println(usa.getName());

        Country usa2 = Country.valueOf("USA");


        System.out.println(ukraine == usa);
        System.out.println(usa == usa2);
    }
}
