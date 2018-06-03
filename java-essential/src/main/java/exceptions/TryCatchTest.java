package exceptions;

public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int a = 10 / 0;
            System.out.println("After");
        } catch (ArithmeticException e) {
            int a = 10 / 0;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
