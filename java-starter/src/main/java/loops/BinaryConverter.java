package loops;

public class BinaryConverter {
    public static void main(String[] args) {
        int i = 8; // 1110
        int b0, b1, b2, b3, b4;

        b0 = i % 2; // 0
        i = i / 2;

        b1 = i % 2;
        i = i / 2;

        b2 = i % 2;
        i = i / 2;

        b3 = i % 2;

        System.out.print(b3);
        System.out.print(b2);
        System.out.print(b1);
        System.out.print(b0);
    }
}
