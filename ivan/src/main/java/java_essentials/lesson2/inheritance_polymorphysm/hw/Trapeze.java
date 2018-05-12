package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Trapeze extends Shape {
    protected String objName = "Trapeze";
    protected double sideB;
    protected double height;

    public Trapeze(double sideA, double sideB, double height) {
        super(sideA);
        this.sideB = sideB;
        this.height = height;
    }

    public double getSquare() {
        return ((sideA + sideB) / 2) * height;
    }
}
