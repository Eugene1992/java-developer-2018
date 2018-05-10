package inheritance.cars;

public class Universal extends Car {
    private String additionalPlace;

    public Universal(int speed) {
        super(speed);
    }

    public void uniRun() {
        super.run();
    }
}
