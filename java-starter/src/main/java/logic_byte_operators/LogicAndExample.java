package logic_byte_operators;

public class LogicAndExample {
    public static void main(String[] args) {
        int a = 99;

        if (a > 0) {
            if (a != 10) {
                System.out.println("A > 0 and A != 10");
            }
        }

//          true     true       false
        if (a > 0 && a != 10 && a != 99) {
            System.out.println("A > 0 and A != 10"); // Ctrl + Shift + Page Up/Down
        }
    }
}
