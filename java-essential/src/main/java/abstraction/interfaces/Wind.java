package abstraction.interfaces;

public class Wind implements Movable {
    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    @Override
    public int getDistance(int hours) {
        return speed * hours;
    }
}
