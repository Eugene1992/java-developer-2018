package exceptions;

public class ThrowTest {
    public static void main(String[] args) {
        int index = -10;
        if (index < 0) {
            throw new IllegalIndexValueException("Illegal index value exception: " + index);
        }
    }
}
