package methods;

public class Example {
    public static void main(String[] args) {
        printStringToConsole(10, "Hello world!");
        int a = 10;
        int b = a + 10;
        printStringToConsole(b, "Hello world!!!");

        int sum = sum(100, 21);
        System.out.println(sum);

        System.out.println(sum(100, 21));

        if (isEven(54)) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd");
        }

//  0 ... 999999
//  123321
//  333333
//  223322

//        12
//        1 2 3 4 6 12
    }

    static void printStringToConsole(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
