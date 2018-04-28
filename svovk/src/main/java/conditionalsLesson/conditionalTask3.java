package conditionalsLesson;

public class conditionalTask3 {
    public static void main(String[] args) {

//        Задание 4
//        Задано три переменных, найти и вывести на экран переменную с максимальным значением
//        (значения всех переменных разные).
        int a = 10;
        int b = 33;
        int c = 1;

        if(a > b && a > c)
            System.out.println("A is the biggest number");
        else if(b >a && b >c)
            System.out.println("b is the biggest number");
        else{
            System.out.println("c is the biggest number");
        }
    }
}
