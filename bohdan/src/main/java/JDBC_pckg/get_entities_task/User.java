package JDBC_pckg.get_entities_task;

@Entity
public class User {

    private int id;
    private String name;
    private int age;
    private int salary;

    public User() {

    }

    public User(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User #" + id +
                ": name = " + name +
                ", age = " + age +
                ", salary = " + salary;
    }
}
