package loops;

public class Test {
    public static void main(String[] args) {
//  10100
        int a = 41;
        String res = "";
        while (a > 0) {
            res = (a % 2) + res;
            a = a / 2;
        }
        System.out.println(res);
    }
}
