package encapsulation.singletone;

import encapsulation.Human;

public class Test {
    public static void main(String[] args) {
        Connection instance1 = Connection.getInstance();
        Connection instance2 = Connection.getInstance();

        System.out.println(instance1.equals(instance2));

        Human ivan = new Human("Ivan", 22);
        Human tom = new Human("Tom", 32);

        System.out.println(ivan.equals(tom));
    }
}
