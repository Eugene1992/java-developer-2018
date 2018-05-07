package java_essentials.lesson1.classes.cw;

/*
 * 1. Создать класс Car с полями имя и скорость
 * 2. Создать 3 экземпляра класса Car
 * 3. Создать метод, который принимате массив Car, количество часов и выводит на экран дистанцию, которую машины могут проехать за переданное количество часов
 */

public class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}
