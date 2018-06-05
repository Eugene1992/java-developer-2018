package object_methods;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        House house = new House("prosp. Glushkova", 9, new Door("Door #1"));
//        House clonedHouse = (House) house.clone();
        House clonedHouse = new House(house);

        System.out.println(house.getDoor().getName());
        System.out.println(clonedHouse.getDoor().getName());

        clonedHouse.getDoor().setName("Door #666");

        System.out.println(house.getDoor().getName());
        System.out.println(clonedHouse.getDoor().getName());
    }
}
