package abstraction.interfaces;

public class Test {
    public static void main(String[] args) {
        Movable wind = new Wind(200);
        Movable human = new Human(35);
        Movable car = new Car(300);
        Movable cat = new Cat(70);

//        printDistances(3, new Movable[]{wind, human, car, cat});

        Workable.s();
        Workable workableCar = new Car(2);
        workableCar.d();

    }

    static void printDistances(int hours, Movable[] movables) {
        for (Movable movable : movables) {
            System.out.println(movable.getDistance(hours));
        }
    }
}
