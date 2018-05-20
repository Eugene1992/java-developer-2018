package game_pckg.game;

import game_pckg.heroes.Hero;
import game_pckg.races.Race;

import java.util.Random;

public class Character {
    private Random rand = new Random();
    private String name;
    private Race race;
    private Hero heroClass;

    public Character(String name, Race race, Hero heroClass) {
        this.name = name;
        this.race = race;
        this.heroClass = heroClass;
    }

    public Character(Character other) {
        this.name = other.name;
        this.race = other.race;
        this.heroClass = other.heroClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public Hero getHeroClass() {
        return heroClass;
    }

    double getHealth() {
        return this.getRace().getHealth();
    }

    void setHealth(double health) {
        this.getRace().setHealth(health);
    }

    int getAttack() {
        return (rand.nextInt(this.race.getMaxDamage() - this.race.getMinDamage()) + this.race.getMinDamage());
    }

    int getArmor() {
        return this.getRace().getArmor();
    }

    void setArmor(int armor) {
        this.getRace().setArmor(armor);
    }

    boolean tryAbility() {
        return this.getHeroClass().checkAbility();
    }

    double useOffensiveAbility(double health, int armor, int attack) {
        return this.getHeroClass().useOffensiveAbility(health, armor, attack);
    }

    String useDefensiveAbility() {
        return this.getHeroClass().useDefensiveAbility();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.getRace() + ", " + this.getHeroClass() + ")";
    }
}
