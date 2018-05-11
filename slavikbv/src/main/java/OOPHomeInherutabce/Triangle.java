package OOPHomeInherutabce;

public class Triangle extends Shape {
    public int height;

    public Triangle(int sideA, int height) {
        super(sideA);
        this.height = height;
    }

    double square() {
        return (double) 1 / 2 * this.sideA * this.height;
    }
}
