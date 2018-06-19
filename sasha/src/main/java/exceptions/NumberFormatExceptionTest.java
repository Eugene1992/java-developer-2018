package exceptions;

public class NumberFormatExceptionTest {
    public static void main(String[] args) {

        try {
            String a = "test";
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

    }
}
