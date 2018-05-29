package game_pckg.races;

public class Dwarf extends Race {
    final String race = "Dwarf";

    public Dwarf(double health, int minDamage, int maxDamage, int armor) {
        super(health, minDamage, maxDamage, armor + 6);
    }

    @Override
    public String toString() {
        return this.race;
    }
}
