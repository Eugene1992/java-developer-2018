package exceptions;

public class MultyCatchTest {
    public static void main(String[] args) {
        try {
            long ms = System.currentTimeMillis();
            if (ms % 13 == 1) {
                int a = 10 / 0;
            } else if (ms % 13 == 0) {
                Object obj = null;
                obj.hashCode();
            } else {
                int[] arr = new int[2];
                System.out.println(arr[10]);
            }
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
