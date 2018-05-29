package game_pckg.heroes;

import game_pckg.classes.Hunter;

import java.util.Random;


public class HunterHero extends Hero implements Hunter {
    Random rand = new Random();
    final String name = "Hunter";

    public HunterHero() {

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
    public double criticalHeat(double health, int armor, int attack) {
        System.out.println(" *CRITICAL* (" + (attack * 2) + ")");
        return health - ((attack * 2) - armor);
    }

    @Override
    public String dodge() {
        return " *DODGED* ";
    }

    @Override
    public double useOffensiveAbility(double health, int armor, int attack) {
        return criticalHeat(health, armor, attack);
    }

    @Override
    public String useDefensiveAbility() {
        return dodge();
    }

    @Override
    public String toString() {
        return this.name;
    }
}