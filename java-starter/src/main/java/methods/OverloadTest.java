package methods;

public class OverloadTest {
    public static void main(String[] args) {

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, byte b) {
        return a + b;
    }

    static int sum(byte b, int a) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int arrSum(int[] arr) {
        return 0;
    }

    static int arrSum(int[] arr, int from, int to) {
        return 0;
    }
}
