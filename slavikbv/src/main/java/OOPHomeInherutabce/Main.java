package OOPHomeInherutabce;

public class Main {
    public static void main(String[] args) {
        /*круг*/
        Shape circle = new Circle(10);
        System.out.println("площадь круга: " + circle.square(10));

        /*параллелограм*/
        Parallelogram paralOne = new Parallelogram(10, 15);
        Parallelogram paralTwo = new Parallelogram(10, 20, Math.PI / 6);
        System.out.println("площадь параллелограмма :" + paralOne.square(10, 15));
        System.out.println("площадь параллелограмма :" + paralTwo.square(10, 20, Math.PI / 6));

        /*прямоугольник*/
        Square rectangOne = new Rectangle(10, 15);
        System.out.println("площадь прямоугольника :" + ((Rectangle) rectangOne).square());

        /*ромб*/
        Romb rombOne = new Romb(15, 10);
        Romb rombTwo = new Romb(15, Math.PI / 6);
        System.out.println("площадь ромбa :" + rombOne.square(15, 10));
        System.out.println("площадь ромбa :" + rombTwo.square(15, Math.PI / 6));

        /*квадрат*/
        Shape squareOne = new Square(15);
        System.out.println("площадь квадрата :" + squareOne.square(15));

        /*трапеция*/
        Trapecia trapOne = new Trapecia(10, 15, 7);
        System.out.println("площадь трапеции :" + trapOne.square());

        /*треугольник*/
        Triangle triangleOne = new Triangle(10, 7);
        System.out.println("площадь треугольника :" + triangleOne.square());
    }
}
