package java_starter.lesson4.conditionals.hw;

/*
    Задание 2
    Создать программу, проверяющую и сообщающую на экран, является ли введенное с
    консоли целое число, чётным либо нечётны
*/

import java.util.Scanner;

public class Task2_EvenDigit {
    public static void main(String[] args) {
        int inNumber;
        Scanner s = new Scanner(System.in);

        System.out.print("Please, enter your digit:\t");
        inNumber = s.nextInt();

        if (inNumber % 2 == 0) {
            System.out.println("Digit is even!");
        } else {
            System.out.println("Digit is odd!");
        }
    }
}
