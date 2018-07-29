package JDBC_pckg.get_entities_task;

@Entity
public class Employee {

    @Column
    private int id;
    @Column(name = "first_name")
    private String f_name;
    @Column(name = "last_name")
    private String l_name;
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

    public Employee(int id, String f_name, String l_name, int age, int salary, boolean is_married, /*Date birthdate,*/ String position) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
//        this.birthdate = birthdate;
        this.position = position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
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

    @Override
    public String toString() {
        return "Employee #" + id +
                ": first_name = " + f_name +
                ", last_name = " + l_name +
                ", age = " + age +
                ", salary = " + salary +
                (is_married ? ", married" : ", not married") +
//                ", birthdate =" + birthdate +
                ", position = " + position;
    }
}
