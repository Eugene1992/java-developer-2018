package lesson3LoopsLesson;

import java.util.Scanner;

//Написать программу, которая реализует следующий функционал:
////        6.1 Пользователь вводит число в 10-ой системе счисления.
////        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
////        1) в 2-ую
////        2) в 8-ую
////        3) в 16-ую
////        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
////        на экран результат.
public class Task6System2_8_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your number");
        int number = in.nextInt();
        System.out.println("What system you want to convert:");
        int system;
        system = in.nextInt();

    }

}



