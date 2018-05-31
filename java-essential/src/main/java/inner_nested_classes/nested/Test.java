package inner_nested_classes.nested;

import static inner_nested_classes.nested.Car.Engine.NAME_CONST;

public class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine();
        System.out.println(NAME_CONST);
    }
}
