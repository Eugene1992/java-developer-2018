package oop_intro.init_blocks;

public class Employee {

    static String planet;

    //    2
    static {
        System.out.println("Hello from static init block!");
//        name = "sdsd";
        planet = "sdsd";
    }

    String name;
    int age;

    //    1
    {
        System.out.println("Hello from non static init block!");
        planet = "sdsd";
        name = "sdsd";
    }

    //    3
    public Employee() {
        System.out.println("Hello from default constructor!");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
    }
}
