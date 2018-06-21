package annotations;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException {
        Employee ivan = new Employee("Ivan");
        Class<? extends Employee> aClass = ivan.getClass();
        if (aClass.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation declaredAnnotation = aClass.getDeclaredAnnotation(MyAnnotation.class);

            System.out.println(declaredAnnotation.name());
            System.out.println(declaredAnnotation.value());
        }

        Field name = aClass.getDeclaredField("name");

        if (name.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation declaredAnnotation = name.getDeclaredAnnotation(MyAnnotation.class);

            System.out.println(declaredAnnotation.name());
            System.out.println(declaredAnnotation.value());
        }
    }
}
