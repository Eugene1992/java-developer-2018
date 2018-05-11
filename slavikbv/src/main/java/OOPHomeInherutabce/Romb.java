package OOPHomeInherutabce;

public class Romb extends Shape {
    public double angle;
    public int height;

    public Romb(int sideA, int height) {
        super(sideA);
        this.height = height;
    }

    public Romb(int sideA, double angle) {
        super(sideA);
        this.angle = angle;
    }


    protected double square(int sideA, double angle) {
        return sideA * sideA * Math.sin(angle);
    }

    protected double square(int sideA, int height) {
        return sideA * height;
    }
}
