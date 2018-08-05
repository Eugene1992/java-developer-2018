import javafx.beans.property.*;

public class Employee {

    private IntegerProperty id;
    private StringProperty first_name;
    private StringProperty last_name;
    private IntegerProperty age;
    private IntegerProperty salary;
    private BooleanProperty is_married;
    private StringProperty position;

    public Employee() {

    }

    public Employee(StringProperty first_name, StringProperty last_name, IntegerProperty age, IntegerProperty salary, BooleanProperty is_married, StringProperty position) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
        this.position = position;
    }

    public Employee(IntegerProperty id, StringProperty first_name, StringProperty last_name, IntegerProperty age, IntegerProperty salary, BooleanProperty is_married, StringProperty position) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
        this.is_married = is_married;
        this.position = position;
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty first_nameProperty() {
        return first_name;
    }

    public StringProperty last_nameProperty() {
        return last_name;
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public IntegerProperty salaryProperty() {
        return salary;
    }

    public BooleanProperty is_marriedProperty() {
        return is_married;
    }

    public StringProperty positionProperty() {
        return position;
    }

    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    public void setFirst_name(String first_name) {
        this.first_name = new SimpleStringProperty(first_name);
    }

    public void setLast_name(String last_name) {
        this.last_name = new SimpleStringProperty(last_name);
    }

    public void setAge(int age) {
        this.age = new SimpleIntegerProperty(age);
    }

    public void setSalary(int salary) {
        this.salary = new SimpleIntegerProperty(salary);
    }

    public void setIs_married(boolean is_married) {
        this.is_married = new SimpleBooleanProperty(is_married);
    }

    public void setPosition(String position) {
        this.position = new SimpleStringProperty(position);
    }

    public boolean isNull() {
        return id == null;
    }

    @Override
    public String toString() {
        return "Employee #" + id +
                ": first_name = " + first_name +
                ", last_name = " + last_name +
                ", age = " + age +
                ", salary = " + salary +
                (is_married.get() ? ", married" : ", not married") +
                ", position = " + position;
    }
}
