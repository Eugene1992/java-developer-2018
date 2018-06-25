package json_task;

@JsonEntity
public class Employee {
    @JsonSuperName(name = "supername")
    private String name;
    private int age;
    private boolean isMarried;

    Employee() {

    }

    public Employee(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarried='" + isMarried + '\'' +
                '}';
    }
}
