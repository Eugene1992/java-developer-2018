import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        //   Задание 2 Создать программу, проверяющую и сообщающую на экран, является ли введенное
        // с консоли целое число, чётным либо нечётны
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Введите число");
            int i = scan.nextInt();
            if (i % 2 == 0)
                System.out.println("Целое");
            else
                System.out.println("Не целое");
        }
    }
}
