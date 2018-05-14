package homeWork04;

public abstract class Hero {
    private int health;
    private int armor;

    public Hero() {
    }

    public Hero(int health, int armor) {
        this.health = health;
        this.armor = armor;
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
}
