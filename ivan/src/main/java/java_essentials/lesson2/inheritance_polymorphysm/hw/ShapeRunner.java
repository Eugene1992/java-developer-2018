package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class ShapeRunner {
    public static void main(String[] args) {

        Shape s = new Shape(23);
        System.out.println("Square of [" + s.objName + "] = [" + s.getSquare() + "]");

        Shape rect = new Rectangle(23, 13); /* ??? why objName gets fro  Shape ??? */
        System.out.println("Square of [" + rect.objName + "] = [" + rect.getSquare() + "]");

        Square square = new Square(4);
        System.out.println("Square of [" + square.objName + "] = [" + square.getSquare() + "]");

        Circle circle = new Circle(4);
        System.out.println("Square of [" + circle.objName + "] = [" + circle.getSquare() + "]");

        Rhombus rhombusH = new Rhombus(4, 25d);
        System.out.println("Square of [" + rhombusH.objName + "] = [" + rhombusH.getSquare() + "]");

        Rhombus rhombusA = new Rhombus(4, 6);
        System.out.println("Square of [" + rhombusA.objName + "] = [" + rhombusA.getSquare() + "]");

        Triangle triangle = new Triangle(-4, 4);
        System.out.println("Square of [" + triangle.objName + "] = [" + triangle.getSquare() + "]");

        Parallelogram parallelogramS = new Parallelogram(-4, 6d);
        System.out.println("Square of [" + parallelogramS.objName + "] = [" + parallelogramS.getSquare() + "]");

        Parallelogram parallelogramA = new Parallelogram(-4, 32, 60);
        System.out.println("Square of [" + parallelogramA.objName + "] = [" + parallelogramA.getSquare() + "]");

        Trapeze trapeze = new Trapeze(-4, 10, 60);
        System.out.println("Square of [" + trapeze.objName + "] = [" + trapeze.getSquare() + "]");

    }
}
