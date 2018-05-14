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

    int getAttack() {
        return rand.nextInt(this.race.getMaxDamage() - this.race.getMinDamage()) + this.race.getMinDamage();
    }

    boolean checkAbility() {
        if (rand.nextInt(100) + 1 <= 10) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name + " (" + this.getRace() + ", " + this.getHeroClass() + ")";
    }
}
