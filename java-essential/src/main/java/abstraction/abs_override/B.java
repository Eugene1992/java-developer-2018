package abstraction.abs_override;

public class B extends A {

    public static void f() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}
