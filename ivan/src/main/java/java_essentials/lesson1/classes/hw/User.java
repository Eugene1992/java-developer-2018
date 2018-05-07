package java_essentials.lesson1.classes.hw;

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
    String firstname;
    String lastname;
    byte age;
    int salary;
    Order[] orders;
    User[] friends;

    User(String firstname, String lastname, byte age, int salary, Order[] orders, User[] friends) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }
}
