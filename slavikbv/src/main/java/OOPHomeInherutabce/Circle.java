package OOPHomeInherutabce;

public class Circle extends Shape {

    public Circle() {
        super();
    }

    public Circle(int sideA) {
        super(sideA);
    }

    @Override
    protected double square(int sideA) {
        return Math.PI * sideA * sideA;

    }
}
