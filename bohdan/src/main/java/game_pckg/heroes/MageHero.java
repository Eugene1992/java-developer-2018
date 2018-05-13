package game_pckg.heroes;

import game_pckg.classes.Mage;


public class MageHero extends Hero implements Mage {
    final String name = "Mage";

    public MageHero() {

    }

    @Override
    public String useClassAbility() {
        return Mage.heal();
    }

    @Override
    public String toString() {
        return name;
    }
}