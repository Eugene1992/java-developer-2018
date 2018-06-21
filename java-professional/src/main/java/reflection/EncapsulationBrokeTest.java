package reflection;

import java.io.IOException;
import java.lang.reflect.Field;

public class EncapsulationBrokeTest {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee("Ivan", 24);
        System.out.println(employee);

        Class<? extends Employee> aClass = employee.getClass();

        Field age = aClass.getDeclaredField("age");

        age.setAccessible(true);

        age.set(employee, -1);

        System.out.println(employee);


    }
}
