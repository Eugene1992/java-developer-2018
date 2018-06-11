package homeWork06;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        try {
            A a = null;
            a.toString();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }

    private class A {

    }
}
