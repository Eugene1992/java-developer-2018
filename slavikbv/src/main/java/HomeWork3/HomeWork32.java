/*2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/
package HomeWork3;

public class HomeWork32 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 55; i++) {
            System.out.println(a);
            a += 2;
        }
    }
}
