package inner_nested_classes.annonymous;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();

        Car electricCar = new Car() {
            @Override
            public void run() {
                System.out.println("Run electric car");
            }
        };

        electricCar.run();

        Car electricCar2 = new ElectricCar();
        electricCar2.run();

        Fighter fighter = new MixFighter();

        Fighter someFighter = new Fighter() {
            @Override
            public int attack() {
                return 100;
            }
        };
    }
}
