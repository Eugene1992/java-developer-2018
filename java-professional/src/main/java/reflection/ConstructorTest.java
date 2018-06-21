package reflection;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Employee employee = new Employee("Ivan", 24);
        System.out.println(employee);

        Class<? extends Employee> aClass = employee.getClass();

        Constructor constructor = aClass.getDeclaredConstructor(String.class, int.class);

        Employee tom = (Employee) constructor.newInstance("Tom", 34);
        System.out.println(tom);
    }
}
