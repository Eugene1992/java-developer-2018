package java_essentials.lesson1.classes.cw;

/*
 * 1. Создать класс Car с полями имя и скорость
 * 2. Создать 3 экземпляра класса Car
 * 3. Создать метод, который принимате массив Car, количество часов и выводит на экран дистанцию, которую машины могут проехать за переданное количество часов
 */

public class CarRunner {
    public static void main(String[] args) {
        Car carOne = new Car("Tavria Nova", 120);
        Car carTwo = new Car("Lada Kalina", 140);
        Car carThree = new Car("Moskvich 412", 90);

        Car cars[] = {carOne, carTwo, carThree};

        getCarDistance(cars, 10);
    }

    public static void getCarDistance(Car[] carsArray, int hours) {
        // getting distance for each car in input array
        for (Car carItem : carsArray) {
            System.out.println(carItem.name + ": \t" + carItem.speed * hours);
        }
    }
}
