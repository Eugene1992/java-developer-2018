package reflection;

import java.io.Serializable;

public class Employee extends Entity implements Serializable, Cloneable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sayHello() {
        System.out.println("Hello, i'm " + name);
    }

    public void test(int a, String b) {

    }
}
