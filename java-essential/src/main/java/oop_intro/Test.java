package oop_intro;

public class Test {
    public static void main(String[] args) {
        Department itDepartment = new Department();
        itDepartment.name = "IT";
        itDepartment.employeeCount = 100;

        Department hrDepartment = new Department();
        hrDepartment.name = "HR";
        hrDepartment.employeeCount = 6;

        Employee firstEmployee = new Employee();

        firstEmployee.name = "Tom";
        firstEmployee.age = 18;
        firstEmployee.salary = 10000;
        firstEmployee.department = itDepartment;

        Employee secondEmployee = new Employee();
        secondEmployee.name = "Ivan";
        secondEmployee.age = 34;
        secondEmployee.salary = 20000;
        secondEmployee.department = itDepartment;

        Employee thirdEmployee = new Employee();
        thirdEmployee.name = "Anna";
        thirdEmployee.age = 26;
        thirdEmployee.salary = 15000;
        thirdEmployee.department = hrDepartment;

//        Employee[] employees = {firstEmployee, secondEmployee, thirdEmployee};
//
//        Employee maxSalaryEmployee = getMaxSalaryEmployee(employees);

        itDepartment.boss = firstEmployee;

        System.out.println(firstEmployee.department.name);

        System.out.println(itDepartment.boss.name);
    }

    static Employee getMaxSalaryEmployee(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (max.salary < employees[i].salary) {
                max = employees[i];
            }
        }
        return max;
    }

    /*
    * 1. Создать класс Car с полями имя и скорость
    * 2. Создать 3 экземпляра класса Car
    * 3. Создать метод, который принимате массив Car, количество часов и выводит на экран дистанцию, которую машины могут проехать за переданное количество часов
    */
}
