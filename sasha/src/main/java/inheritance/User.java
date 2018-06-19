package inheritance;

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
    int age;
    int salary;
    Order[] orders;
//    User[] friends;

    User() {

    }

    User(String firstname, String lastname, int age, int salary, Order[] orders/*,User[] friends*/) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
//        this.friends = friends;
    }
}
