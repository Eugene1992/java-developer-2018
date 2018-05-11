package homeWork03;

public class HomeWork03 {
    public static void main(String[] args) {
        //Class Shape
        Shape shape = new Shape();
        System.out.println(shape.shapeSquare());

        Shape rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.shapeSquare());

        Shape square = new Square(10);
        System.out.println(square.shapeSquare());

        Shape circle = new Circle(10);
        System.out.println(circle.shapeSquare());

        Shape rhombus = new Rhombus(10, 45);
        System.out.println(rhombus.shapeSquare());

        Shape parallelogram = new Parallelogram(10, 20, 45);
        System.out.println(parallelogram.shapeSquare());

        Shape trapeze = new Trapeze(10, 20, 5);
        System.out.println(trapeze.shapeSquare());

        Shape triangle = new Triangle(10, 10, 60);
        System.out.println(triangle.shapeSquare());
    }
}
