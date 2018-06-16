package streams.term;

import streams.Employee;

import java.util.Arrays;
import java.util.List;

import static streams.Employee.Position.*;

public class MatchesFirstTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", CLERK, 12000),
                new Employee("Tom", BOSS, 120000),
                new Employee("Fred", CLERK, 7000),
                new Employee("John", CLERK, 32000),
                new Employee("Jack", CLERK, 22000)
        );


        boolean anyMatch = employees
                .stream()
                .anyMatch(employee -> employee.getPosition() == CLERK);

        boolean noneMatch = employees
                .stream()
                .noneMatch(employee -> employee.getPosition() == MANAGER);

        boolean allMatch = employees
                .stream()
                .allMatch(employee -> employee.getSalary() > 20000);

        System.out.println(anyMatch);
        System.out.println(noneMatch);
        System.out.println(allMatch);
    }
}
