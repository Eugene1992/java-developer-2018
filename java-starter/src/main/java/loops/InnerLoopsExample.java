package loops;

public class InnerLoopsExample {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 5; j++) {
                Thread.sleep(1000);
                System.out.print("j = " + j + " ");
            }
            System.out.println();
        }
    }
}
