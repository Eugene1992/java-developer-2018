package hwLesson04;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if(a > b & a > c & d > a){
            System.out.println(a);
        }else if(a > b & a > d & c > a){
            System.out.println(a);
        }else if (a > c & a > d & b > a){
            System.out.println(a);
        }else if (b > a & b > c & d > b){
            System.out.println(b);
        }else if (b > a & b > d & c > b){
            System.out.println(b);
        }else if (b > c & b > d & a > b){
            System.out.println(b);
        }else if (c > a & c > b & d > c){
            System.out.println(c);
        }else if (c > a & c > d & b > c){
            System.out.println(c);
        }else if (c > b & c > d & a > c){
            System.out.println(c);
        }else if (d > a & d > b & c > d){
            System.out.println(d);
        }else if(d > a & d > c & b > d){
            System.out.println(d);
        }else if(d > b & d > c & a > d){
            System.out.println(d);
        }
    }
}
