package inheritance.cars;

public class Test {
    public static void main(String[] args) {
        Car jeep = new Jeep(100);
        Sedan sedan = new Sedan(70);
        Universal universal = new Universal(80);

        universal.uniRun();

        if (jeep instanceof Sedan) {
            Sedan anotherJeep = (Sedan) jeep;
        }

        printCarDistances(3, jeep, sedan, universal);
    }

    public static void printCarDistances(int hours, Car... cars) {
        for (Car car : cars) {
            System.out.println(car.speed * hours);
        }
    }
}
