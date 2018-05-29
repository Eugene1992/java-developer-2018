package game_pckg.heroes;

import game_pckg.classes.Mage;

import java.util.Random;


public class MageHero extends Hero implements Mage {
    Random rand = new Random();
    final String name = "Mage";

    public MageHero() {

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
    public double penetrate(double health, int armor, int attack) {
        System.out.println(" *PENETRATION* (" + attack + ")");
        return health - attack;
    }

    @Override
    public String heal() {
        return " *HEALED* ";
    }

    @Override
    public double useOffensiveAbility(double health, int armor, int attack) {
        return penetrate(health, armor, attack);
    }

    @Override
    public String useDefensiveAbility() {
        return heal();
    }

    @Override
    public String toString() {
        return this.name;
    }
}