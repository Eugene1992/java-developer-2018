package methods;

public class RecursionTest {
    //    4!
//    4 * 3 * 2 * 1
//    !6
//    6 * 5 * 4 * 3 * 2 * 1
    public static void main(String[] args) {
        int a = 5;
//        loopFact(a);
//        System.out.println(recursiveFact(a));
//        System.out.println(fib(6));
        stackOverflow(1);
    }

    static int loopFact(int num) {
        int fact = 1;
        for (; num > 0; num--) {
            fact = fact * num;
        }
        return fact;
    }

    static int recursiveFact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * recursiveFact(num - 1);
        }
    }

    //    1 1 2 3 5 8
    static int fib(int num) {
        return num <= 1 ? num : fib(num - 1) + fib(num - 2);
    }

    static int stackOverflow(int num) {
        System.out.println(num);
        return stackOverflow(++num);
    }
}
