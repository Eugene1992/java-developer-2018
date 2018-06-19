package streams;

import java.util.List;

public class Employee {
    private String name;
    private Position position;
    private int salary;
    private List<Integer> luckyNumbers;

    public Employee(String name, Position position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, Position position, int salary, List<Integer> luckyNumbers) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.luckyNumbers = luckyNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public List<Integer> getLuckyNumbers() {
        return luckyNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return position == employee.position;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + salary;
        return result;
    }

    public enum Position {
        BOSS, CLERK, MANAGER
    }
}
