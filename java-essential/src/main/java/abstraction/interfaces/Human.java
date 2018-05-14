package abstraction.interfaces;

public class Human implements Movable {
    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
