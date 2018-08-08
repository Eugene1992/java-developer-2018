package dao;

import javafx.beans.property.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_filled")
public class Employee {

    @Id
    private IntegerProperty id;
    @Column(name = "first_name")
    private StringProperty firstName;
    @Column(name = "last_name")
    private StringProperty lastName;
    @Column
    private IntegerProperty age;
    @Column
    private IntegerProperty salary;
    @Column(name = "is_married")
    private BooleanProperty isMarried;
    @Column
    private StringProperty position;

    public Employee() {

    }

    public Employee(StringProperty firstName, StringProperty lastName, IntegerProperty age, IntegerProperty salary, BooleanProperty isMarried, StringProperty position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.position = position;
    }

    public Employee(IntegerProperty id, StringProperty firstName, StringProperty lastName, IntegerProperty age, IntegerProperty salary, BooleanProperty isMarried, StringProperty position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        this.position = position;
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public IntegerProperty salaryProperty() {
        return salary;
    }

    public BooleanProperty isMarriedProperty() {
        return isMarried;
    }

    public StringProperty positionProperty() {
        return position;
    }

    public void setId(int id) {
        this.id = new SimpleIntegerProperty(id);
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = new SimpleStringProperty(lastName);
    }

    public void setAge(int age) {
        this.age = new SimpleIntegerProperty(age);
    }

    public void setSalary(int salary) {
        this.salary = new SimpleIntegerProperty(salary);
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = new SimpleBooleanProperty(isMarried);
    }

    public void setPosition(String position) {
        this.position = new SimpleStringProperty(position);
    }

    public boolean isNull() {
        return id == null;
    }

    @Override
    public String toString() {
        return "dao.Employee #" + id +
                ": firstName = " + firstName +
                ", lastName = " + lastName +
                ", age = " + age +
                ", salary = " + salary +
                (isMarried.get() ? ", married" : ", not married") +
                ", position = " + position;
    }
}
