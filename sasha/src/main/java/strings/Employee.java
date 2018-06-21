package strings;

public class Employee {
    int index;
    String name;
    int age;
    int salary;
    String position;

    Employee() {

    }

    public Employee(int index, String name, int age, int salary, String position) {
        this.index = index;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return index + ":" + name + ":" + age + ":" + salary + ":" + position;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
