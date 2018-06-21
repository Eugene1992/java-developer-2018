package json_converter;

//@JsonEntity
public class Employee {

    //    @JsonField(name="supername")
    private String name;
    private int age;
    private boolean isMarrried;

    public Employee(String name, int age, boolean isMarrried) {
        this.name = name;
        this.age = age;
        this.isMarrried = isMarrried;
    }
}
