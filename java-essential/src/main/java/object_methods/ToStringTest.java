package object_methods;

public class ToStringTest {
    public static void main(String[] args) {
        House house1 = new House("prosp. Glushkova", 9);
        House house2 = new House("str. Polevaya", 19);
//        House house = null;
        House[] houses = {house1, house2};

        for (House house : houses) {
            System.out.println(house);
        }
    }
}
