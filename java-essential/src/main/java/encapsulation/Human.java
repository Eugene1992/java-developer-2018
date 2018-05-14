package encapsulation;

public class Human {
    private String name; // package-private
    private int age;
    private int salary;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) throws Exception {
        if (salary < 0) {
            throw new Exception();
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
