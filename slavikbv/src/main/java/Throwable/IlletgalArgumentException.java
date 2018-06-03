package Throwable;

public class IlletgalArgumentException {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x=" + x + ", y=" + y);
        else System.out.println("square = " + x * y);

    }
}

