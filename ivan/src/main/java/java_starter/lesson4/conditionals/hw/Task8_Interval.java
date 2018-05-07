package java_starter.lesson4.conditionals.hw;

/*
    Задание 8
    Используя IntelliJ IDEA, создайте класс Interval.
    Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
    промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
    Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
    выводится соответствующее сообщение.
*/

import java.util.Scanner;

public class Task8_Interval {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please, indicate your number: ");
        double num = s.nextDouble();

        if (num >= 0 && num <= 14) {
            System.out.println("Number [" + num + "] belongs to interval [0 - 14]");
        } else if (num >= 15 && num <= 35) {
            System.out.println("Number [" + num + "] belongs to interval [15 - 35]");
        } else if (num >= 36 && num <= 50) {
            System.out.println("Number [" + num + "] belongs to interval [36 - 50]");
        } else if (num >= 50 && num <= 100) {
            System.out.println("Number [" + num + "] belongs to interval [50 - 100]");
        } else {
            System.out.println("Number [" + num + "] doesn't belong to interval [0 - 100]");
        }
    }
}
