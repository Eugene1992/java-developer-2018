package lesson3LoopsLesson;

//        -------------------------------------------------- Последовательности --------------------------------------------------
//        1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Task1ConsequensesOn3 {
    public static void main(String[] args) {
        int num1 = 1000;

        while (num1 < 10000) {
            System.out.println(num1);
            num1 += 3;
        }
    }

}
