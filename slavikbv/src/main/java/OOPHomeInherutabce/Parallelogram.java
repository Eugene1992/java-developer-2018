package OOPHomeInherutabce;

public class Parallelogram extends Shape {
    public int sideB;
    double angle;
    int height;


    public Parallelogram(int sideA, int sideB, double angle) {
        super(sideA);
        this.angle = angle;
        this.sideB = sideB;

    }

    public Parallelogram(int sideA, int height) {
        super(sideA);
        this.height = height;
    }

    protected double square(int sideA, int height) {
        return (double) sideA * height;
    }

    protected double square(int sideA, int sideB, double angle) {
        return (double) sideA * sideB * Math.sin(angle);
    }
}
