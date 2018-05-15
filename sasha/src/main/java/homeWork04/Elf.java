package homeWork04;

import java.util.Random;

public class Elf extends Hero {

    public Elf() {

    }

    public Elf(String name, int health, int armor, int maxAttack, int minAttack) {
        super(name, health, armor, maxAttack, minAttack);
    }

    protected boolean criticalAttack() {
        if (Math.random() <= 0.2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int attackMove() {
        Random rand = new Random();
        if (criticalAttack()) {
            return (rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack) * 2;
        } else {
            return rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack;
        }
//        if (hero.getArmor() <= 0) {
//            hero.setHealth(hero.getHealth() - attack);
//        } else if (hero.getArmor() < attack) {
//            hero.setHealth(hero.getHealth() - (attack - hero.getArmor()));
//            hero.setArmor(0);
//        } else if (hero.getArmor() >= attack) {
//            hero.setArmor(hero.getArmor() - attack);
//        }
    }

    @Override
    protected int blockMove() {
        return 0;
    }

    @Override
    protected int healMove() {
        return 0;
    }
}
