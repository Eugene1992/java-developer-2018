package oop_intro;

public class Employee {
    String name;
    int age;
    int salary;
    Department department;

    Employee() {
    }

    Employee(String name, int age, int salary, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void hello() {
        System.out.println("Hello, i'm " + this.name);
    }
}
