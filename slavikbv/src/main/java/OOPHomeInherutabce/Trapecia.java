package OOPHomeInherutabce;

public class Trapecia extends Shape {
    public int sideB;
    public int height;


    public Trapecia(int sideA, int sideB, int height) {
        super(sideA);
        this.sideB = sideB;
        this.height = height;
    }

    double square() {
        return (this.sideA + this.sideB) / 2 * this.height;
    }
}