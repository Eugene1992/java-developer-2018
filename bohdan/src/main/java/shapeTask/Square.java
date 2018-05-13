package shapeTask;

public class Square extends Quadrangle {
    final String NAME = "Square";

    public Square(double sideA) {
        super(sideA);
    }

    public double getArea() {
        this.area = Math.pow(this.getSideA(), 2);
        return this.area;
    }

    public String toString() {
        return NAME;
    }
}
