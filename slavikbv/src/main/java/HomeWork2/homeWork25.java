package HomeWork2;

/*Задание 5
Задано четыре переменных, найти и вывести на экран вторую по величине.*/
public class homeWork25 {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = 28;
        int d = 0;
        int min = a;
        int min2;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        if (min == a) {
            min2 = b;
            if (c < min2) min2 = c;
            if (d < min2) min2 = d;
            System.out.println(min2 + " - второе по величине");
        }
        if (min == b){
            min2 = a;
            if (c<min2) min2 = c;
            if (d<min2) min2 = d;
            System.out.println(min2 + " - второе по величине");
        }
        if (min == c){
            min2 = a;
            if (b<min2) min2 = b;
            if (d<min2) min2 = d;
            System.out.println(min2 + " - второе по величине");
        }
        if (min == d){
            min2 = a;
            if (b<min2) min2 = b;
            if (c<min2) min2 = c;
            System.out.println(min2 + " - второе по величине");
        }
    }
}
