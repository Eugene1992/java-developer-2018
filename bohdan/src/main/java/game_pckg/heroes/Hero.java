package game_pckg.heroes;

import game_pckg.classes.Hunter;
import game_pckg.classes.Mage;
import game_pckg.classes.Warrior;

public abstract class Hero implements Warrior, Hunter, Mage {

    public Hero() {

    }

    abstract public String useClassAbility();
}
