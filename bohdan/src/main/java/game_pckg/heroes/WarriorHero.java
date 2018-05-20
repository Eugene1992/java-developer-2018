package game_pckg.heroes;

import game_pckg.classes.Warrior;

import java.util.Random;


public class WarriorHero extends Hero implements Warrior {
    Random rand = new Random();
    final String name = "Warrior";

    public WarriorHero() {

    }

    @Override
    public boolean checkAbility() {
        if (rand.nextInt(100) + 1 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double crash(double health, int armor, int attack) {
        System.out.println(" *CRASH* (" + (attack + armor) + ")");
        return health - (attack + armor);
    }

    @Override
    public String block() {
        return " *BLOCKED* ";
    }


    @Override
    public double useOffensiveAbility(double health, int armor, int attack) {
        return crash(health, armor, attack);
    }

    @Override
    public String useDefensiveAbility() {
        return block();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
