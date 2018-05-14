package homeWork03;

public class HomeWork03 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle(10);
        Shape parallelogram = new Parallelogram(5, 7, 60);
        Shape rectangle = new Rectangle(4, 5);
        Shape rhombus = new Rhombus(8, 60);
        Shape square = new Square(7);
        Shape trapeze = new Trapeze(5, 4, 5);
        Shape triangle = new Triangle(8, 10, 60);

        System.out.println(shape.squareShape());
        System.out.println(circle.squareShape());
        System.out.println(parallelogram.squareShape());
        System.out.println(rectangle.squareShape());
        System.out.println(rhombus.squareShape());
        System.out.println(square.squareShape());
        System.out.println(trapeze.squareShape());
        System.out.println(triangle.squareShape());
    }
}
