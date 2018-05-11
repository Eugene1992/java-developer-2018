package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Circle extends Shape {
    protected String objName = "Circle";

    public Circle(double sideA) {
        super(sideA);
    }

    public double getSquare() {
        return Math.PI * Math.pow(sideA, 2);
    }
}
