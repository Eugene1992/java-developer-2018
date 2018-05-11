package homeWork03;

public class Trapeze extends Shape {
    protected int firstParametr;
    protected int secondParametr;
    protected int height;

    public Trapeze(int firstParametr, int secondParametr, int height) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
        this.height = height;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Trapeze Square: ");
        return (int) (this.firstParametr * this.secondParametr * this.height / 2);
    }
}
