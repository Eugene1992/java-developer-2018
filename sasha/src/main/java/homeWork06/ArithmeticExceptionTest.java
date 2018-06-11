package homeWork06;

public class ArithmeticExceptionTest {


    public static void main(String[] args) {

        try {
            int a = 2;
            int b = 1;
            System.out.println((float) b / a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
