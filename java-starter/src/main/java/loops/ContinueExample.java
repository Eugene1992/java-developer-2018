package loops;

public class ContinueExample {
    public static void main(String[] args) {
        int a = 7;

        while (a > 0) {
            if (a == 5) {
                continue;
            }
            System.out.println(a);
            a--;
        }
    }
}
