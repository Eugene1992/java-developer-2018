package lesson3LoopsLesson;


//5. Выведите на экран первые 20 членов последовательности Фибоначчи.
////

public class Task5Fibonaci {
    public static void main(String[] args) {
        int num1 = 0;
        System.out.println(num1);
        int num2 = 1;
        System.out.println(num2);
        int num3;
        for (int counter = 0; counter < 20; counter++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
