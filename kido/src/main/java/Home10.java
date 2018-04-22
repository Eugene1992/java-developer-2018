public class Home10 {

    // 10. Поменять значения двух переменных без использования третей

    public static void main(String[] args) {
        int a = 21;
        int b = 15;
        b = a + b;
        a = b - a;
        b = b - a;


        System.out.println(a);
        System.out.println(b);
    }
}
