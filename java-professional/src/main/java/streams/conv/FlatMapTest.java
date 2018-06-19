package streams.conv;

import streams.Employee;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static streams.Employee.Position.BOSS;
import static streams.Employee.Position.CLERK;

public class FlatMapTest {
    public static void main(String[] args) {
        List<Employee> employees = asList(
                new Employee("Anna", CLERK, 12000, asList(23, 56, 3, 2)),
                new Employee("Tom", BOSS, 120000, asList(7, 23, 4, 1)),
                new Employee("Fred", CLERK, 7000, asList(457, 54, 66, 3)),
                new Employee("John", CLERK, 32000, asList(23, 7, 1)),
                new Employee("Jack", CLERK, 22000, singletonList(100))
        );


        employees
                .stream()
                .flatMap(employee -> employee.getLuckyNumbers().stream())
                .distinct()
                .filter(num -> num > 10 && num < 30)
                .forEach(System.out::println);

    }
}
