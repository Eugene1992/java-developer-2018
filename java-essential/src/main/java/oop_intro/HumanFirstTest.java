package oop_intro;

public class HumanFirstTest {
    String firstname;
    String lastname;
    int age;
    double height;
    double weight;

    public HumanFirstTest(String firstname, String lastname, int age) {
        this(firstname, lastname, age, 0.0, 0.0);
    }

    public HumanFirstTest(String firstname, String lastname, int age, double height) {
        this(firstname, lastname, age, height, 0.0);
    }

    public HumanFirstTest(String firstname, String lastname, int age, double height, double weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
