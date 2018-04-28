package loops;

public class WhileExample {
    public static void main(String[] args) {
        int a = 10;

        while (a > 0) {
            System.out.println(a);
            if (a == 5) {
                a = -1;
            }
            a--;
        }
    }
}
