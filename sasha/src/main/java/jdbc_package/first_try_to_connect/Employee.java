package jdbc_package.first_try_to_connect;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int salary;
    private boolean is_married;
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
