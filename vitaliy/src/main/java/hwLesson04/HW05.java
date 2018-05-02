package hwLesson04;
import static javax.swing.JOptionPane.*;
import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        /*
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.
         */

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c =scanner.nextDouble();

        double D = (b*b) - 4*a*c;

        if(D > 0){
            double x1=(-b + Math.sqrt(D)) / (2*a);
            double x2=(-b - Math.sqrt(D)) / (2*a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
            return;
        }else
        if(D==0){
            double x1=(-(b) / (2*a));
            double x2=x1;
            System.out.println("x1=" +x1);
            System.out.println("x2="+x2);
            return;
        }else if(D < 0){
            System.out.println("root of equation");
        }

    }

}
