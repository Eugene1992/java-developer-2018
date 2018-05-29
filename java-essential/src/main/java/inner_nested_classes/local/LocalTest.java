package inner_nested_classes.local;

public class LocalTest {
    private String localTestName = "as";

    public static void someStaticMethod() {
//        Car tesla = new Car("Tesla");
    }

    public void test() {
        final int count = 10;
//        count = 100;

        class Car {
            private String name;

            public Car(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void print() {
                System.out.println(LocalTest.this.localTestName);
                System.out.println(count);
            }
        }

        Car tesla = new Car("Tesla");
    }
}
