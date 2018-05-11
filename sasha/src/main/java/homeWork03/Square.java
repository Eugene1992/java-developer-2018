package homeWork03;

public class Square extends Shape {
    protected int firstParametr;

    public Square(int firstParametr) {
        this.firstParametr = firstParametr;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Square Square: ");
        return (int) Math.pow(this.firstParametr, 2);
    }
}
