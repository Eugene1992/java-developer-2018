package shapeTask;

public class Rhombus extends Parallelogram {
    final String NAME = "Rhombus";

    public Rhombus(double sideA, double height) {
        super(sideA, height);
    }

    public Rhombus(double sideA, int angle) {
        super(sideA, sideA, angle);
    }

    public String toString() {
        return NAME;
    }
}
