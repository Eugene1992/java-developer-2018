package conditionalsLesson;

//Задание 3
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

import java.util.Scanner;

public class conditionalsLessonTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");

        int a = scan.nextInt();

        System.out.println("Enter second number");

        int b = scan.nextInt();
           if((a > b)) {
            System.out.println("closer to 10");
        } else {
                System.out.println("not closer");
            }
    }
}
