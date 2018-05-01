package hwLessonLoops05;

public class Task04 {
    public static void main(String[] args) {
        /*
        Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
         */
        int a = 2;
        for (int i = 1; i < 20; i++) {
            int res = a * 2;
            a = res;
            System.out.println(res);

        }
    }
}
