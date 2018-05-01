package lesson4Methods;

public class Task1WhileLoopMethod {
    public static void main(String[] args) {
        int num2 = 1000;
        int num1 = numbers(num2);
        System.out.println(num1);

    }

    static int numbers(int num1) {
        while (num1 < 10000) {
            System.out.println(num1);
            num1 += 3;
        }
        return num1;
    }

}
