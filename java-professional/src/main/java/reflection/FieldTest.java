package reflection;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee("Ivan", 24);
        System.out.println(employee);

        Class<? extends Employee> aClass = employee.getClass();

        Field age = aClass.getDeclaredField("age");

        age.setAccessible(true);

        System.out.println(age.get(employee));

        int modifiers = age.getModifiers();
        System.out.println(Modifier.isPrivate(modifiers));
        System.out.println(Modifier.isPublic(modifiers));

    }
}
