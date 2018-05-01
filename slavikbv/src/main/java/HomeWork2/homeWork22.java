package HomeWork2;/* Задание 2
         Создать программу, проверяющую и сообщающую на экран, является ли введенное с
         консоли целое число, чётным либо нечётны */
import java.util.Scanner;
public class homeWork22{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a  = scan.nextInt();
        if (a%2==0) System.out.println(a + " - четное");
        else System.out.println(a+" - нечетное");
    }
}
