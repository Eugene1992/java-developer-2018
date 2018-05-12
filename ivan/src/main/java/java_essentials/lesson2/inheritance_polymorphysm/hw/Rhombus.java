package java_essentials.lesson2.inheritance_polymorphysm.hw;

public class Rhombus extends Shape {
    protected String objName = "Rhombus";
    protected double height;
    protected float angle;

    public Rhombus(double sideA, double height) {
        super(sideA);
        this.height = height;
        this.angle = -999;
        this.objName = "Rhombus(sideB)";
    }

    public Rhombus(double sideA, float angle) {
        super(sideA);
        this.height = 0;
        this.angle = angle;
        this.objName = "Rhombus(angle)";
    }

    public double getSquare() {
        double outSquare = 0;

        if (height > 0) {
            outSquare = sideA * height;
        } else if (angle != 0 && angle != -999) {
            outSquare = Math.pow(sideA, 2) * Math.sin((angle / 180) * Math.PI);
        } else if (height < 0) {
            System.out.println("Incorrect sideB provided: [" + height + "]");
            System.exit(1);
        } else {
            outSquare = 0;
        }
        return outSquare;
    }
}
