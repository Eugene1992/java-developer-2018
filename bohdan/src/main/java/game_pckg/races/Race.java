package game_pckg.races;

public abstract class Race {
    private double health;
    private int minDamage;
    private int maxDamage;
    private int armor;

    public Race(double health, int minDamage, int maxDamage, int armor) {
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.armor = armor;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

}
