package homeWork03;

public class Trapeze extends Shape {
    protected int firstTrapezeSide;
    protected int secondTrapezeSide;
    protected int heightOfTrapeze;

    public Trapeze(int firstTrapezeSide, int secondTrapezeSide, int heightOfTrapeze) {
        this.firstTrapezeSide = firstTrapezeSide;
        this.secondTrapezeSide = secondTrapezeSide;
        this.heightOfTrapeze = heightOfTrapeze;

    }

    @Override
    protected int squareShape() {
        System.out.println("Trapeze Square: ");
        return (this.firstTrapezeSide + this.secondTrapezeSide) * this.heightOfTrapeze / 2;
    }
}
