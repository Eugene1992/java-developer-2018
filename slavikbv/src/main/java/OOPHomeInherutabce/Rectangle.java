package OOPHomeInherutabce;

public class Rectangle extends Square {
    protected int sideB;

    public Rectangle(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    double square() {
        return sideA * sideB;
    }
}
