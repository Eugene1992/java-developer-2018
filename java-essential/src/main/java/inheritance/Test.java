package inheritance;

public class Test {
    public static void main(String[] args) {
        ChildOne childOne = new ChildOne();
        ChildTwo childTwo = new ChildTwo();
        System.out.println(childOne.num);
        System.out.println(childTwo.num);

        childOne.doSomething();

        Parent parentChild = new ChildOne();


    }
}
