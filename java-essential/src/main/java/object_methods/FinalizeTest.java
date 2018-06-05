package object_methods;

public class FinalizeTest {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        for (int i = 0; i < 100; i++) {
            House house = new House("prosp. Glushkova", 9, new Door("Door #1"));
            house = null;
            System.gc();
        }

        Thread.sleep(1000);
        System.out.println(House.COUNT);
    }
}
