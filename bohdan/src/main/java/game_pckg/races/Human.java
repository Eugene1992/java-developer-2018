package game_pckg.races;

public class Human extends Race {
    final String race = "Human";

    public Human(double health, int minDamage, int maxDamage, int armor) {
        super(health + 2, minDamage + 2, maxDamage + 2, armor + 2);
    }

    @Override
    public String toString() {
        return this.race;
    }
}
