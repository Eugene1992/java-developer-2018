package shapeTask;

public class Trapeze extends Quadrangle {
    final String NAME = "Trapeze";

    public Trapeze(double sideA, double sideB, double height) {
        super(sideA, sideB, height);
    }

    public double getArea() {
        this.area = (this.getSideA() + this.getSideB()) / 2 * this.getHeight();
        return this.area;
    }

    public String toString() {
        return NAME;
    }
}
