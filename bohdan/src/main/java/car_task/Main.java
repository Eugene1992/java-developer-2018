package car_task;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Lada", 80),
                new Car("BMW", 180),
                new Car("Lamborghini", 320)};

        getDistance(cars, 3);
    }

    static void getDistance(Car[] cars, int time) {
        for (Car i : cars) {
            System.out.println(i.name + " will ride " + i.speed * time + " km for " + time + " hour(s)");
        }
    }

}
