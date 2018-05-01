package arrays;

public class Test {
    public static void main(String[] args) {
        int arrSum = sum(new int[]{1, 4, 5, 6, 6, 4});
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b;
    }

    static int sum(int[] arr) {
        return 0;
    }
}
