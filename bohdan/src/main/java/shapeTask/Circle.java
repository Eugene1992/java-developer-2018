package shapeTask;

public class Circle extends Shape {
    final String NAME = "Circle";
    final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area = getPI() * Math.pow(this.getRadius(), 2);
        return this.area;
    }

    public String toString() {
        return NAME;
    }
}
