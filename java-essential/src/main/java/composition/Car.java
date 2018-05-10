package composition;

public class Car {
    private Engine engine = new Engine();
    private Freshener freshener;

    public Car(Freshener freshener) {
        this.freshener = freshener;
    }

    public static void main(String[] args) {
        Freshener freshener = new Freshener();
        Car car = new Car(freshener);
        car.run();

        Engine engine = car.getEngine();

        Freshener freshener1 = car.getFreshener();

        car = null;

        car.getEngine();
    }

    public void run() {
        engine.on();
        System.out.println("Run!");
    }

    public Engine getEngine() {
        return engine;
    }

    public Freshener getFreshener() {
        return freshener;
    }
}
