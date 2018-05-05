package classWork01;

public class ClassWork01 {
    public static void main(String[] args) {
        Car bmw = new Car("BMW",90);
        Car volswagen = new Car("Volswagen",100);
        Car honda = new Car("Honda", 60);
        Car[] cars = {bmw,volswagen,honda};

        calculateDistance(cars,5);
    }

    public static void calculateDistance(Car[] cars, int hours){
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + cars[i].mark + " will pass " + cars[i].speed * hours);
        }
    }
}