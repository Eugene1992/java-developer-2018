package reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class MethodTest {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Employee employee = new Employee("Ivan", 24);
        System.out.println(employee);

        Class<? extends Employee> aClass = employee.getClass();

/*        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }*/

        Method sayHello = aClass.getDeclaredMethod("sayHello");

        Object invoke = sayHello.invoke(employee);

        System.out.println(invoke);

        System.out.println(sayHello.getParameterCount());

        Class<?> returnType = sayHello.getReturnType();
        System.out.println(returnType.getName());

        Parameter[] parameters = aClass.getDeclaredMethod("test", int.class, String.class).getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getType().getName());
        }
    }
}
