package JDBC_pckg;

import JDBC_pckg.get_entities_task.Column;
import JDBC_pckg.get_entities_task.Entity;

@Entity
public class Employee {

    @Column
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column
    private int age;
    @Column
    private int salary;
    @Column
    private boolean is_married;
    //@Column
    //private Date birthdate;
    @Column
    private String position;

    public Employee() {

    }

    public Employee(String first_name, String last_name, int age, int salary, boolean is_married, String position) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
        this.position = position;
    }

    public Employee(int id, String first_name, String last_name, int age, int salary, boolean is_married, /*Date birthdate,*/ String position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
//        this.birthdate = birthdate;
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIs_married(boolean is_married) {
        this.is_married = is_married;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public boolean is_married() {
        return is_married;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee #" + id +
                ": first_name = " + first_name +
                ", last_name = " + last_name +
                ", age = " + age +
                ", salary = " + salary +
                (is_married ? ", married" : ", not married") +
//                ", birthdate =" + birthdate +
                ", position = " + position;
    }
}
