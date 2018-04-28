import java.util.Scanner;

//Задание 3
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
public class Hw3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение");
        int a = scan.nextInt();
        int t1 = 0;
        int t2 = 0;
        if (a > 10) {
            t1 = a - 10;
        } else if (a < 10) {
            t1 = 10 - a;
        }
        System.out.println("Введите второе значение");
        int b = scan.nextInt();
        if (b > 10) {
            t2 = b - 10;
        } else if (b < 10) {
            t2 = 10 - b;
        }
        if (t1 < t2) {
            System.out.println("Первое ближе");
        } else if (t1 > t2) {
            System.out.println("Второе ближе");
        } else
            System.out.println("Оба равны");
    }
}
