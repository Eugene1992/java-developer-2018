package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Square extends Shape {
    protected String objName = "Square";

    public Square(double sideA) {
        super(sideA);
    }

    public double getSquare() {
        return Math.pow(sideA, 2);
    }
}
