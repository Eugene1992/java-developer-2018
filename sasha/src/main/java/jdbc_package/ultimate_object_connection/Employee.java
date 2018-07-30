package jdbc_package.ultimate_object_connection;

@Entity
public class Employee {
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "age")
    private int age;
    @Column(name = "salary")
    private int salary;
    @Column(name = "is_married")
    private boolean is_married;
    @Column(name = "position")
    private String position;

    public Employee() {
    }

    public Employee(int id, String first_name, String last_name, int age, int salary, boolean is_married, String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", is_married=" + is_married +
                ", position='" + position + '\'' +
                '}';
    }
}
