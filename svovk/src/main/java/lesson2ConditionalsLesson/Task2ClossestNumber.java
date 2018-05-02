package lesson2ConditionalsLesson;

//Задание 3
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.

import java.util.Scanner;

public class Task2ClossestNumber {
    public static void main(String[] args) {

        double c = 10;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = scan.nextInt();

        System.out.println("Enter second number");

        double b = scan.nextInt();
        if (a - (c) > b - (c)) {
            System.out.println("closer to 10");
        } else {
            System.out.println("not closer");
        }
    }
}
