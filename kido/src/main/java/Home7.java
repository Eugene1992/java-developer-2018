public class Home7 {

    //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte

    public static void main(String[] args) {
        short a = 21;
        short b = 15;
        byte m = 2;
        byte r = (byte) ((a + b) / m);


        System.out.println(r);
    }
}
