package abstraction;

public abstract class Shape {
    protected String objName = "General";
    protected double sideA;

    public Shape(double sideA) {
        this.sideA = sideA;
    }

    public abstract double getSquare();

    public void printShapeName() {
        System.out.println(this.objName);
    }
}
