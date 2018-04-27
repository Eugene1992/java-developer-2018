/*1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/
package HomeWork3;

public class HomeWork31 {
    public static void main(String[] args) {
        int a = 1000;
        while (a < 10000) {
            System.out.println(a);
            a = a + 3;
        }

    }
}
