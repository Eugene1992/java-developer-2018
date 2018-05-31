package inner_nested_classes.inner;

import java.io.Serializable;

public class Car {

    private static String firstCarName = "XXX";
    private String name;
    private Engine engine;

    public Car(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void f() {
        System.out.println(engine.name);
    }

    public class Engine extends Object implements Serializable {

//        private static final String f = ""; // legal
//        private static String f = ""; // illegal

        private String name;

        public String getCarName() {
            Engine engine = getEngine();
            return Car.this.name;
        }

        public String getFirstCarName() {
            return firstCarName;
        }

        public Car getOuter() {
            return Car.this;
        }
    }

    public class ElectricEngine extends Engine {

    }
}
