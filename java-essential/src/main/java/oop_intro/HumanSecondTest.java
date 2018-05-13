package oop_intro;

public class HumanSecondTest {
    String firstname;
    String lastname;
    int age;
    double height;
    double weight;

    public HumanSecondTest(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public HumanSecondTest(String firstname, String lastname, int age, double height) {
        this(firstname, lastname, age);
        this.height = height;
    }

    public HumanSecondTest(String firstname, String lastname, int age, double height, double weight) {
        this(firstname, lastname, age, height);
        this.weight = weight;
    }
}
