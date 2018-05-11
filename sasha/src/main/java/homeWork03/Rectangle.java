package homeWork03;

public class Rectangle extends Shape {
    protected int firstParametr;
    protected int secondParametr;

    public Rectangle(int firstParametr, int secondParametr) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Rectangle Square: ");
        return this.firstParametr * this.secondParametr;
    }

}
