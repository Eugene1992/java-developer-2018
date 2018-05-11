package homeWork03;

public class Parallelogram extends Shape {
    protected int firstParametr;
    protected int secondParametr;
    protected int angle;

    public Parallelogram(int firstParametr, int secondParametr, int angle) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
        this.angle = angle;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Parallelogram Square: ");
        return (int) (this.firstParametr * this.secondParametr * Math.sin(Math.toRadians(this.angle)));
    }
}
