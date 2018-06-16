package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import static streams.Employee.Position.BOSS;
import static streams.Employee.Position.CLERK;

public class Test {
    public static void main(String[] args) {
        List<Employee> arrayList = Arrays.asList(
                new Employee("Anna", CLERK, 12000),
                new Employee("Tom", BOSS, 120000),
                new Employee("Fred", CLERK, 7000),
                new Employee("John", CLERK, 32000),
                new Employee("Jack", CLERK, 22000)
        );

        int sumSalary = 0;
        for (Employee employee : arrayList) {
            if (employee.getPosition() == CLERK) {
                sumSalary += employee.getSalary();
            }
        }

        System.out.println(sumSalary);

        EmployeeClerkPredicate employeeClerkPredicate = new EmployeeClerkPredicate();

/*        int sum = arrayList
                .stream()
                .filter(employee -> {
                    System.out.println();
                    return employee.getPosition() == CLERK;
                })
                .mapToInt(employee -> employee.getSalary()) // Employee::getSalary
                .sum();*/

        int sum = arrayList
                .stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee employee) {
                        return employee.getPosition() == CLERK;
                    }
                })
                .mapToInt(new ToIntFunction<Employee>() {
                    @Override
                    public int applyAsInt(Employee employee) {
                        return employee.getSalary();
                    }
                })
                .sum();

        System.out.println(sum);
    }
}
