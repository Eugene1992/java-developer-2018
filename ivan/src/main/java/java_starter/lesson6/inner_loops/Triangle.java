package java_starter.lesson6.inner_loops;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) {
                    System.out.print("*" + " ");
                }

                if (i == j) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
