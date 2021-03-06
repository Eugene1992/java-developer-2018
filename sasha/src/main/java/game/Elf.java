package game;

import java.util.Random;

public class Elf extends Hero {

    public Elf() {

    }

    public Elf(String name, int health, int armor, int maxAttack, int minAttack) {
        super(name, health, armor, maxAttack, minAttack);
    }

    protected boolean criticalAttack() {
        if (Math.random() <= 0.5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int attackMove() {
        Random rand = new Random();
        if (criticalAttack()) {
            return (rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack) * 2;
        } else {
            return rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack;
        }
    }

}
