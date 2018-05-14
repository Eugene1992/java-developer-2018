package game_pckg.heroes;

import game_pckg.classes.Hunter;


public class HunterHero extends Hero {
    final String name = "Hunter";

    public HunterHero() {

    }

    @Override
    public String useClassAbility() {
        return Hunter.criticalHeat();
    }

    @Override
    public String toString() {
        return name;
    }
}