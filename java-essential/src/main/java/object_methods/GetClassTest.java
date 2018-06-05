package object_methods;

import java.lang.reflect.Method;

public class GetClassTest {
    public static void main(String[] args) {
        House house = new House("prosp. Glushkova", 9);
        Class houseClass = house.getClass();

        System.out.println(houseClass.getName());
        System.out.println(houseClass.getSimpleName());

        Method[] declaredMethods = houseClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
    }
}
