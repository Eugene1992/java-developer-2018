package abstraction.interfaces;

public class Car extends Machine implements Movable, Workable {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }

    @Override
    public void f() {

    }

    /*@Override
    public void d() {
        System.out.println("d from Car");
    }*/
}
