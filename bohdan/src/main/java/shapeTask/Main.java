package shapeTask;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),
                new Triangle(10, 4),
                new Square(7),
                new Rectangle(7, 8),
                new Trapeze(3, 7, 3),
                new Parallelogram(6, 5, 45),
                new Parallelogram(6, 4),
                new Rhombus(7, 45),
                new Rhombus(7, 5.0)};

        for (Shape shape : shapes) {
            System.out.println(shape + " area is " + shape.getArea());
        }
    }
}
