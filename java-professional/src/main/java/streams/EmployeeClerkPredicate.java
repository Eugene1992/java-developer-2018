package streams;

import java.util.function.Predicate;

public class EmployeeClerkPredicate implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getPosition() == Employee.Position.CLERK;
    }
}
