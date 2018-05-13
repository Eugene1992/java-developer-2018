package oop_intro.static_test;

public class StaticTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(Employee.planet);

        Employee.planet = "Mars";
        System.out.println(Employee.planet);
    }
}
