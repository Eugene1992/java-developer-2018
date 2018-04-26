package loops;

public class IncrementTest {
    public static void main(String[] args) {
        int i = 10;

        System.out.println(i--);
        System.out.println(--i);

        i = i + 1;
        i += 1;

        i = i - 1;
        i -= 1;

        i = -1;
        i = +1;
    }
}
