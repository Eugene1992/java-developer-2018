package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Parallelogram extends Shape {
    protected String objName = "Parallelogram";
    protected double sideB;
    protected float angle;

    public Parallelogram(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
        this.angle = -999;
        this.objName = "Parallelogram(sideB)";
    }

    public Parallelogram(double sideA, double sideB, float angle) {
        super(sideA);
        this.sideB = sideB;
        this.angle = angle;
        this.objName = "Parallelogram(full)";
    }

    public double getSquare() {
        double outSquare = 0;

        if (angle == -999) {
            outSquare = sideA * sideB;
        } else if (angle != 0) {
            outSquare = sideA * sideB * Math.sin((angle / 180) * Math.PI);
        }
        return outSquare;
    }
}
