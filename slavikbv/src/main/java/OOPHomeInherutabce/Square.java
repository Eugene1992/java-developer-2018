package OOPHomeInherutabce;

public class Square extends Shape {

    public Square(int sideA) {
        super(sideA);
    }

    @Override
    protected double square(int sideA) {
        return sideA * sideA;
    }
}

