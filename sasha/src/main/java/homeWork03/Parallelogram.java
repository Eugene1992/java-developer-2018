package homeWork03;

public class Parallelogram extends Shape {
    protected int parallelogramFirstSide;
    protected int parallelogramSecondSide;
    protected int angleBetweenParallelogramSides;

    public Parallelogram(int parallelogramFirstSide, int parallelogramSecondSide, int angleBetweenParallelogramSides) {
        this.parallelogramFirstSide = parallelogramFirstSide;
        this.parallelogramSecondSide = parallelogramSecondSide;
        this.angleBetweenParallelogramSides = angleBetweenParallelogramSides;
    }

    @Override
    protected int squareShape() {
        System.out.println("Parallelogram Square: ");
        return (int) (this.parallelogramFirstSide * this.parallelogramSecondSide * Math.sin(Math.toRadians(angleBetweenParallelogramSides)));
    }
}
