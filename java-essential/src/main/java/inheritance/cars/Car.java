package inheritance.cars;

public class Car {
    protected int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    protected void run() {
        System.out.println("Car run");
    }
}
