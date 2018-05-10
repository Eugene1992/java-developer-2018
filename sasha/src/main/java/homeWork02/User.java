package homeWork02;

/*
    User
	- firstname
	- lastname
	- age
	- salary
	- orders
	- friends
 */

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private int salary;
    private Order[] orders;

    User() {

    }

    User(String firstname, String lastname, int age, int salary, Order[] orders/*,User[] friends*/) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}
