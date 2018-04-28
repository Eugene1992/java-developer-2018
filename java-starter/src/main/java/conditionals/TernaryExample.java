package conditionals;

public class TernaryExample {
    public static void main(String[] args) {
        int a = 10; // Ctrl + Alt + V
        int b;

        if (a > 0) {
            b = 100;
        } else {
            b = 1000;
        }
        System.out.println(b);

        int c = a > 0     ?   100  :   1000;
//            = condition ? ifTrue : ifFalse;
        System.out.println(c);



    }
}
