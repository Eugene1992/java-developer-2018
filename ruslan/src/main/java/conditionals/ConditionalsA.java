package conditionals;

import java.util.Scanner;

public class ConditionalsA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки");
        int val = scan.nextInt();
        if (val % 2 > 0) {
            System.out.println("Введенное число является Не чётным");
        } else {
            System.out.println("Введённое число является Чётным");
        }
    }
}
//Задание 2
//Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//консоли целое число, чётным либо нечётны
