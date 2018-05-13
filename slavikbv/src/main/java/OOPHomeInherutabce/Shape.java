package OOPHomeInherutabce;

public class Shape {
    protected int sideA;


    public Shape(int sideA) {
        this.sideA = sideA;

    }

    public Shape() {

    }

    protected double square(int sideA) {
        return Math.PI * sideA * sideA;
    }
}
