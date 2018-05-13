package oop_intro.static_test;

public class Employee {
    static String planet = "Earth";
    String name;
    int age;

    static String getEarthName(Employee emp) {
        System.out.println(emp.name);
//        System.out.println(name);
        return planet;
    }

    void sayHello() {
        System.out.println(planet);
//        System.out.println(getEarthName());
        System.out.println("Hello, i'm " + this.name);
    }
}
