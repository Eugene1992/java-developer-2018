package hwLessonLoops05;

public class Task05 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        for(int i=1;i <20;i++){
            int summ = a + b;
            a = b;
            b = summ;
            System.out.println(summ);
        }
    }
}
