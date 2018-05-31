package inner_nested_classes.nested;

import java.io.Serializable;

public class Car {

    private static String firstCarName = "XXX";
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    public static class Engine extends Object implements Serializable {

        public static final String NAME_CONST = "dsd";

        public String getCarName(Car car) {
            return car.name;
        }

        public String getFirstCarName() {
            return firstCarName;
        }
    }

    public static class ElectricEngine extends Engine {

    }
}
