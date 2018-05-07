package oop_intro;

public class User {
    String firstname;
    String lastname;
    int age;
    int salary;
    int orders;
    int friends;

    User(){}

    User(String firstname, String lastname, int age, int salary, int orders, int friends){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.orders = orders;
        this.friends = friends;
    }
}
