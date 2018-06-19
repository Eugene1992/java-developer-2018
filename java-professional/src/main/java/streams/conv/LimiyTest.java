package streams.conv;

import streams.Employee;

import java.util.Arrays;
import java.util.List;

import static streams.Employee.Position.BOSS;
import static streams.Employee.Position.CLERK;

public class LimiyTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Anna", CLERK, 12000),
                new Employee("Tom", BOSS, 120000),
                new Employee("Fred", CLERK, 7000),
                new Employee("John", CLERK, 32000),
                new Employee("Jack", CLERK, 22000)
        );


        employees
                .stream()
                .sorted((o1, o2) -> o2.getSalary() - o1.getSalary())
                .limit(2)
                .forEach(System.out::println);


    }
}
