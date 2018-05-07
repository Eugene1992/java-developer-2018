package loops;

public class LoopsE {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        int d = 0;
        while (d <= 20) {
            c = a + b; // c=0+1=1   c=1+1=2     c=1+2=3     c=2+3=5     c=3+5=8
            a = b; // a=1           a=1         a=2         a=3
            b = c; // b=1           b=2         b=3         b=5
            System.out.println(b);
            d++;
        }
        for (a = 0, b = 1, c = 0,  d = 0 ; d<=20 ; d++, c = a + b, a = b, b = c){
            System.out.println(b);
        }
    }
}
//5. Выведите на экран первые 20 членов последовательности Фибоначчи.