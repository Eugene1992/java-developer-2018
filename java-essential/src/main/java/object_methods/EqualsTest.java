package object_methods;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        House house1 = new House("prosp. Glushkova", 9, new Door("Door #1"));
        House house2 = new House("prosp. Glushkova", 19, new Door("Door #1"));

        System.out.println(house1.equals(house2));
    }
}
