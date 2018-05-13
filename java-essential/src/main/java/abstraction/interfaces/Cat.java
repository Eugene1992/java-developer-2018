package abstraction.interfaces;

public class Cat implements Movable {
    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
