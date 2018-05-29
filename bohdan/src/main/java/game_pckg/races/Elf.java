package game_pckg.races;

public class Elf extends Race {
    final String race = "Elf";

    public Elf(double health, int minDamage, int maxDamage, int armor) {
        super(health, minDamage + 4, maxDamage + 4, armor);
    }

    @Override
    public String toString() {
        return this.race;
    }
}
