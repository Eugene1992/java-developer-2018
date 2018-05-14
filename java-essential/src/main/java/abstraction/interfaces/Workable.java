package abstraction.interfaces;

public interface Workable {

    static int s() {
        return 0;
    }

    void f();

    default void d() {
        System.out.println("d from Workable");
    }
}
