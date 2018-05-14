package homeWork03;

public class Triangle extends Shape {
    protected int triangleFirstSide;
    protected int triangleSecondSide;
    protected int angleBetweenTriangleSides;

    public Triangle(int triangleFirstSide, int triangleSecondSide, int angleBetweenTriangleSides) {
        this.triangleFirstSide = triangleFirstSide;
        this.triangleSecondSide = triangleSecondSide;
        this.angleBetweenTriangleSides = angleBetweenTriangleSides;
    }

    @Override
    protected int squareShape() {
        System.out.println("Triangle Square: ");
        return (int) (this.triangleFirstSide * this.triangleSecondSide * Math.sin(Math.toRadians(angleBetweenTriangleSides)) / 2);
    }

}
