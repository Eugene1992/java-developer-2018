package shape_task;

public class Quadrangle extends Shape {
    protected double sideA, sideB, height;
    protected int angle;

    public Quadrangle() {
    }

    public Quadrangle(double sideA) {
        this.sideA = sideA;
    }

    public Quadrangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Quadrangle(double sideA, int angle) {
        this.sideA = sideA;
        this.angle = angle;
    }

    public Quadrangle(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public Quadrangle(double sideA, double sideB, int angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }

    public Quadrangle(double sideA, double sideB, double height, int angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.angle = angle;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
