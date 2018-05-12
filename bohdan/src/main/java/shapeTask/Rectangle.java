package shapeTask;

public class Rectangle extends Quadrangle {
    final String NAME = "Rectangle";

    public Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public double getArea() {
        this.area = this.getSideA() * this.getSideB();
        return this.area;
    }

    public String toString() {
        return NAME;
    }
}
