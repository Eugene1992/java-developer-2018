package exceptions;

public class StringIndexOutOfBoundsExceptionTest {

    public static void main(String[] args) {
        try {
            String a = "test";
            System.out.println(a.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
