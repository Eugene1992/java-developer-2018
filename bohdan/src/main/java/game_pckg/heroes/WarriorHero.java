package game_pckg.heroes;

import game_pckg.classes.Warrior;


public class WarriorHero extends Hero implements Warrior {
    final String name = "Warrior";

    public WarriorHero() {

    }

    @Override
    public String useClassAbility() {
        return Warrior.block();
    }

    @Override
    public String toString() {
        return "name";
    }
}
