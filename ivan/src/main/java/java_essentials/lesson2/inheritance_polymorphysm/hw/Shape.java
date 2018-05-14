package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Shape {
    protected String objName = "General";
    protected double sideA;

    public Shape(double sideA) {
        this.sideA = sideA;
    }

    public double getSquare() {
        return 0;
//        return Math.pow(sideA,2);
    }
}
