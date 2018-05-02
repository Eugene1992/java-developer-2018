package lesson4Methods;

public class Task2IfMethod {
    public static void main(String[] args) {

        int a = 45;
        int b = 456;
        int c = 34567;

        int result = biggestNumber(a, b, c);
        System.out.println("Biggest bumber is " + result);
    }

    static int biggestNumber(int a, int b, int c) {

        if (a > b && a > c) {
            return a;

        } else if (b > a && b > c) {
            return b;
        } else if (c > b && c > a) {
            return c;
        }
        return biggestNumber(a, b, c);
    }
}

