package lesson2ConditionalsLesson;

import java.util.Scanner;

public class Task1IfNumIsEven {

//    Задание 2
//    Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//    консоли целое число, чётным либо нечётны


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number");

        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

