package lesson3LoopsLesson;

//  3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Task3NotBelowZero {
    public static void main(String[] args) {
        int num;
        for (num = 90; num > 0; num -= 5) {
            System.out.println(num);
        }

    }
}
