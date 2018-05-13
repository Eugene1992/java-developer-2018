package shape_task;

public class Triangle extends Shape {
    final String NAME = "Triangle";
    private double side, height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        this.area = 0.5 * this.getSide() * this.getHeight();
        return this.area;
    }

    public String toString() {
        return NAME;
    }
}
