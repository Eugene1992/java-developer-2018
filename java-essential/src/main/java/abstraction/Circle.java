package abstraction;

public class Circle extends RoundShape {
    protected String objName = "Circle";

    public Circle(double sideA) {
        super(sideA);
    }

    public double getSquare() {
        return Math.PI * Math.pow(sideA, 2);
    }
}
