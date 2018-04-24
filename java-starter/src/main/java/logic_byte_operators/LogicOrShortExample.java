package logic_byte_operators;

public class LogicOrShortExample {
    public static void main(String[] args) {
        int a = 10;

        if (a > 0 || a / 0 == 10) {
            System.out.println(a);
        }
    }
}
