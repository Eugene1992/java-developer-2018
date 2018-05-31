package homeWork04;

import java.util.Random;

public abstract class Hero implements HeroMoveable {
    protected String name;
    protected int health;
    protected int armor;
    protected int minAttack;
    protected int maxAttack;


    public Hero() {
    }

    public Hero(String name, int health, int armor, int maxAttack, int minAttack) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.maxAttack = maxAttack;
        this.minAttack = minAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(int minAttack) {
        this.minAttack = minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public int attackMove() {
        Random rand = new Random();
        return rand.nextInt((this.maxAttack - this.minAttack) + 1) + this.minAttack;
    }

    public int blockMove() {
        return 0;
    }

    public int healMove() {
        return 0;
    }

}
