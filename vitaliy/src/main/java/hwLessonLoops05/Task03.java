package hwLessonLoops05;

public class Task03 {
    public static void main(String[] args) {
        /*
        Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
         */
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }
}
