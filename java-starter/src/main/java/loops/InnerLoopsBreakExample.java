package loops;

public class InnerLoopsBreakExample {
    public static void main(String[] args) throws InterruptedException {
        outer:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            inner:
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    continue outer;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    /*
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *
    * * * * * * * * * *

    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
    * * * * * * * *
    * * * * * * * * *
    * * * * * * * * * *
    */
}
