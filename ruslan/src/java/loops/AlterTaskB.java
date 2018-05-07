package loops;

public class AlterTaskB {
    public static void main(String[] args) {
        for (int a = 0 ; a < 10 ; a++){
            for (int b = 0 ; b < a; b++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }
}
