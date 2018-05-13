package homeWork03;

public class Rectangle extends Shape {
    protected int firstRectangleSide;
    protected int secondRectangleSide;

    public Rectangle(int firstRectangleSide, int secondRectangleSide) {
        this.firstRectangleSide = firstRectangleSide;
        this.secondRectangleSide = secondRectangleSide;
    }

    @Override
    protected int squareShape() {
        System.out.println("Rectangle Square: ");
        return this.firstRectangleSide * this.secondRectangleSide;
    }
}
