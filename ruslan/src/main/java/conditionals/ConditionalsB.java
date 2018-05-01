package conditionals;

import java.util.Scanner;

public class ConditionalsB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для сравнения");
        int var1 = 0;
        int valOne = scan.nextInt();
        if (valOne < 10) {
            var1 = 10 - valOne; }
        if (valOne > 10) {
            var1 = valOne - 10; }
        System.out.println("Введите второе число для сравнения");
        int var2 = 0;
        int valTwo = scan.nextInt();
        if (valTwo < 10) {
            var2 = 10 - valTwo; }
        if (valTwo > 10) {
            var2 = valTwo - 10; }
        if (var1 < var2) {
            System.out.println("Первое число ближе к 10"); }
        if (var1 > var2) {
            System.out.println("Второе число ближе к 10"); }
        else{
            System.out.println("Два числа равны между собой"); }
    }
}
//Задание 3
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.