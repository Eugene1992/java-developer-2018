package homeWork03;

public class Square extends Shape {
    protected int squareSide;

    public Square(int squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    protected int squareShape() {
        System.out.println("Square Square: ");
        return (int) Math.pow(this.squareSide, 2);
    }
}
