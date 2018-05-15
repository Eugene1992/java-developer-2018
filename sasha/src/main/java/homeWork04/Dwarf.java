package homeWork04;

import java.util.Random;

public class Dwarf extends Hero {

    public Dwarf() {

    }

    public Dwarf(String name, int health, int armor, int maxAttack, int minAttack) {
        super(name, health, armor, maxAttack, minAttack);
    }

    protected boolean blockAttack() {
        if (Math.random() <= 0.2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int blockMove() {
        Random rand = new Random();
        if (blockAttack()) {
            return rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack;
        } else {
            return 0;
        }
    }

    @Override
    protected int healMove() {
        return 0;
    }
}
