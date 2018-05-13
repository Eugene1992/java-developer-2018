package shapeTask;

public class Parallelogram extends Quadrangle {
    final String NAME = "Parellelogram";

    public Parallelogram(double sideA, double sideB, int angle) {
        super(sideA, sideB, angle);
    }

    public Parallelogram(double sideA, double height) {
        super(sideA);
        this.height = height;
    }

    public double getAngleSin() {
        return Math.sin(angle);
    }

    public double getAreaWithAngle() {
        this.area = this.getSideA() * this.getSideB() * this.getAngleSin();
        return this.area;
    }

    public double getAreaWithHeight() {
        this.area = this.getSideA() * this.getHeight();
        return this.area;
    }

    public double getArea() {
        if (this.getAngle() == 0 && this.getHeight() != 0) {
            System.out.print("*counted with height* ");
            return this.getAreaWithHeight();
        }
        if (this.getHeight() == 0 && this.getAngle() != 0) {
            System.out.print("*counted with angle* ");
            return this.getAreaWithAngle();
        }
        return 0;
    }

    public String toString() {
        return NAME;
    }
}
