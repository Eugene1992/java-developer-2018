package com.relationships.one_to_one;

import javax.persistence.*;

@Entity(name = "OneToOne_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double salary;
    private String deg;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(int id,
                    String name, double salary, String deg) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int eid) {
        this.id = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String ename) {
        this.name = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
