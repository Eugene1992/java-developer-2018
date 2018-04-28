package conditionals;

public class DoubleTernaryExample {
    public static void main(String[] args) {
        int a = -10; // Ctrl + Alt + V
        int b;

        if (a > 0) {
            if (a != 5) {
                b = 10;
            } else {
                b = 100;
            }
        } else {
            b = 1000;
        }

        int c = a > 0 ? (a != 5 ? 10 : 100) : 1000;

        System.out.println(b);
        System.out.println(c);
    }
}
