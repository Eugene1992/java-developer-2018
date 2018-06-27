package annotations;

@MyAnnotation(name = "some class info")
public class Employee {

    @MyAnnotation(name = "some field info", value = "some value")
    private String name;

    public Employee(String name) {
        this.name = name;
    }
}
