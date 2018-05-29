package homeWork04;

public class Human extends Hero {

    public Human() {

    }

    public Human(String name, int health, int armor, int maxAttack, int minAttack) {
        super(name, health, armor, maxAttack, minAttack);
    }

    protected boolean healing() {
        if (Math.random() <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int blockMove() {
        return 0;
    }

    @Override
    protected int healMove() {
//        Random rand = new Random();
        if (healing()) {
            return 20;
        } else {
            return 0;
        }
    }
}
