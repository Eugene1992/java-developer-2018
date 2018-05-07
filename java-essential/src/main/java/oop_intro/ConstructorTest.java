package oop_intro;

public class ConstructorTest {
    public static void main(String[] args) {
        Department itDepartment = new Department();
        itDepartment.name = "IT";
        itDepartment.employeeCount = 100;

        Department hrDepartment = new Department();
        hrDepartment.name = "HR";
        hrDepartment.employeeCount = 6;

        Employee firstEmployee = new Employee("Tom", 18, 10000, itDepartment);

        Employee secondEmployee = new Employee("Ivan", 34, 20000, itDepartment);

        Employee thirdEmployee = new Employee("Anna", 26, 15000, hrDepartment);

        firstEmployee.hello();
        secondEmployee.hello();
    }
}
