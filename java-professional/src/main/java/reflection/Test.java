package reflection;

import java.io.IOException;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();

        Class aClass = employee.getClass();
        Class employeeClass = Employee.class;

        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getTypeName());
        System.out.println(aClass.getCanonicalName());

        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());

        Class[] interfaces = aClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

    }
}
