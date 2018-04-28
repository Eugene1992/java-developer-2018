package loops;

public class BreakExample {
    public static void main(String[] args) {
        int a = 10;

        /*while (a > 0) {
            if (a == 5) {
                break;
            }
            System.out.println(a);
//            a = a - 2;
            a -= 2;
        }*/

        while (true) {

            switch (a) {
                case 10: {
                    System.out.println("case 10");
                    break;
                }
            }
        }
    }
}
