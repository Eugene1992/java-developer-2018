package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Rectangle extends Shape {
    protected String objName = "Rectangle";
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public double getSquare() {
        return sideA * sideB;
    }
}
