package homeWork03;

public class Rhombus extends Shape {
    protected int rhombusSide;
    protected int rhombusAngle;

    public Rhombus(int rhombusSide, int rhombusAngle) {
        this.rhombusSide = rhombusSide;
        this.rhombusAngle = rhombusAngle;
    }

    @Override
    protected int squareShape() {
        System.out.println("Rhombus Square: ");
        return (int) (Math.pow(this.rhombusSide, 2) * Math.sin(Math.toRadians(rhombusAngle)));
    }
}
