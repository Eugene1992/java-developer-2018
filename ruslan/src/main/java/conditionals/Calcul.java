package conditionals;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Начало работы");

        double a = scan.nextInt();
        System.out.println(a);
        String c = scan.next();
        System.out.println("Действие");
        double b = scan.nextInt();
        System.out.println(b);

        switch (c) {
            case "+" :
                System.out.println(a + b);
                break;

        }

    }
}