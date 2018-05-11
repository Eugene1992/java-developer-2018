package homeWork03;

public class Triangle extends Shape {
    protected int firstParametr;
    protected int secondParametr;
    protected int angle;

    public Triangle(int firstParametr, int secondParametr, int angle) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
        this.angle = angle;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Triangle Square: ");
        return (int) (this.firstParametr * this.secondParametr * Math.sin(Math.toRadians(this.angle)) / 2);
    }
}
