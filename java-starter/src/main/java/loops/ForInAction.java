package loops;

public class ForInAction {
    public static void main(String[] args) {

        for (int a = 10; a > 0; a -= 2) {
            System.out.println(a);
        }

        int a = 0;

        while (a > 0) {
            System.out.println(a);
            System.out.println(a);
        }

        do {
            System.out.println(a);
        } while (a > 0);

        String s = "";

        s = s + 1;
        s = 1 + s;

//        Please enter number:
//        > 1
//

    }
}
