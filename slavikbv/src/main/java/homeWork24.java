/*   Задание 4
   Задано три переменных, найти и вывести на экран переменную с максимальным значением
   (значения всех переменных разные).*/
import java.util.Scanner;
public class homeWork24
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max=a;
        if (b>max) max = b;
        if (c>max) max = c;
        System.out.println(max + " максимальное");
    }

}
