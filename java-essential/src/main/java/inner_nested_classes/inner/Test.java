package inner_nested_classes.inner;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tesla");

        Car.Engine engine1 = new Car("BMW").new Engine();
        Car.Engine engine2 = car.new Engine();

        System.out.println(engine1.getCarName());
    }
}
