package streams.term;

import streams.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static streams.Employee.Position.BOSS;
import static streams.Employee.Position.CLERK;

public class MinMaxFirstTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", CLERK, 12000),
                new Employee("Tom", BOSS, 120000),
                new Employee("Fred", CLERK, 7000),
                new Employee("John", CLERK, 32000),
                new Employee("Jack", CLERK, 22000)
        );

        Employee employee = employees
                .stream()
                .min(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o2.getSalary() - o1.getSalary();
                    }
                })
                .get();

        System.out.println(employee);
    }
}
