package abstraction;

public class Triangle extends Shape {

    public Triangle(double sideA) {
        super(sideA);
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public void printShapeName() {
        super.printShapeName();
    }
}
