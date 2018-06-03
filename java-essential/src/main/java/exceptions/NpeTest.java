package exceptions;

public class NpeTest {
    public static void main(String[] args) {
        Object obj = null;
        obj.hashCode();
    }
}
