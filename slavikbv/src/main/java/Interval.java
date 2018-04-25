/*Задание 8
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение.*/

import java.sql.SQLOutput;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a=");
        int a = scan.nextInt();
        if (a>=0 && a<=14) System.out.println("[0 - 14]");
        else if (a>=15 && a<=35) System.out.println("[15 - 35]");
        else if (a>=36 && a<50) System.out.println("[36 - 50]");
        else if (a == 50) {System.out.println("[36 - 50]");System.out.println("[50 - 100]");}
        else if (a>50 && a<=100) System.out.println("[50 - 100]");
        else System.out.println("interval error");
    }
}
