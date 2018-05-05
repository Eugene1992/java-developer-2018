package ArraysHomeWorkNew;

/**
 * Created by Student on 5/5/2018.
 */
public class Carsss {
    public static void main(String[] args) {
        Car carOne = new Car("BMW", 140);
        Car carTwo = new Car("Cadilac", 100);
        Car carThree = new Car("Mers", 90
        );
        System.out.println(distance(carOne,3));
        System.out.println(distance(carTwo,3));
        System.out.println(distance(carThree,3));
    }
static int distance(Car car, int time){
        return car.speed*time;
}
}
