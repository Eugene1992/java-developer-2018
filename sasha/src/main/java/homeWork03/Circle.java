package homeWork03;

public class Circle extends Shape {
    protected int firstParametr;

    public Circle(int firstParametr) {
        this.firstParametr = firstParametr;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Circle Square: ");
        return (int) (Math.pow(this.firstParametr, 2) * Math.PI);
    }
}
