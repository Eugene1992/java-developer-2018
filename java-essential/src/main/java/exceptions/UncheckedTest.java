package exceptions;

import java.util.Scanner;

public class UncheckedTest {
    public static void main(String[] args) {
        System.out.println("Please, enter divider:");
        Scanner scanner = new Scanner(System.in);
        int divider = scanner.nextInt();
        try {
            int a = 10 / divider;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Please, enter valid divider:");
            int dividerRe = scanner.nextInt();
            int a = 10 / dividerRe;
            System.out.println(a);
        }
    }
}
