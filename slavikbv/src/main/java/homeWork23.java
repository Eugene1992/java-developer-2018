/*  Задание 3
          Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
          Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
import java.util.Scanner;
public class homeWork23 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if (Math.abs(a-10)<=Math.abs(b-10)) System.out.println(a+" Ближайшее к 10");
        else System.out.println(b+" Ближайшее к 10");
    }
}
