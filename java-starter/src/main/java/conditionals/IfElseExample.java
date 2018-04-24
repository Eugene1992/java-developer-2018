package conditionals;

public class IfElseExample {
    public static void main(String[] args) {
        int a = 0;

        System.out.println("Start");
        if (a > 0) {
            System.out.println("A > 0");
        } else if (a < 0) {
            System.out.println("A < 0");
        } else if (a == 0){
            System.out.println("A == 0");
        }
        System.out.println("End");

        if (a > 0) {
            System.out.println("A > 0");
        }
        if (a < 0) {
            System.out.println("A < 0");
        }
        if (a == 0){
            System.out.println("A == 0");
        }
    }
}
