package homeWork03;

public class Circle extends Shape {
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    protected int squareShape() {
        System.out.println("Circle Square: ");
        return (int) (Math.pow(this.radius,2) * Math.PI);
    }
}
