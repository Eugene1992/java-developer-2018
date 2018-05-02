package lesson3LoopsLesson;

//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Task4first20NumbersMultiplacation {
    public static void main(String[] args) {

        int num = 2;
        for (int counter = 0; counter < 20; counter++) {
            System.out.println(num);
            num *= 2;
        }
    }
}
