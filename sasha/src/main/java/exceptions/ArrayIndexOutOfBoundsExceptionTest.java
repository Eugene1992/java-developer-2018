package exceptions;


public class ArrayIndexOutOfBoundsExceptionTest {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        try {
            for (int j = 0; j <= a.length; j++) {
                System.out.println(a[j]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }
}
