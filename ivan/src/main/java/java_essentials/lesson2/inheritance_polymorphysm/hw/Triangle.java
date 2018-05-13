package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Triangle extends Shape {
    protected String objName = "Triangle";
    protected double height;

    public Triangle(double sideA, double height) {
        super(sideA);
        this.height = height;
    }

    public double getSquare() {
        return 0.5 * sideA * height;
    }
}
