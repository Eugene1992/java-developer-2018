package encapsulation;

public class Test {
    public static void main(String[] args) throws Exception {
        Human human = new Human("Ivan", 22);

        human.setSalary(-10_000);

        System.out.println(human.getSalary());

        System.out.println(human.getName());
    }
}
