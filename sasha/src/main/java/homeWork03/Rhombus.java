package homeWork03;

public class Rhombus extends Shape {
    protected int firstParametr;
    protected int secondParametr;

    public Rhombus(int firstParametr, int secondParametr) {
        this.firstParametr = firstParametr;
        this.secondParametr = secondParametr;
    }

    @Override
    protected int shapeSquare() {
        System.out.println("Rhombus Square: ");
        return (int) (Math.pow(this.firstParametr, 2) * Math.sin(Math.toRadians(this.secondParametr)));
    }
}
