package HomeWork4;

public class HomeWork46 {
    public static void main(String[] args) {
        System.out.println(toother(20, 2));
    }

    static String toother(int a, int b) {
        String s = "";
        while (a > 0) {
            s = a % b + s;
            a = a / b;
        }
        return s;
    }
}
