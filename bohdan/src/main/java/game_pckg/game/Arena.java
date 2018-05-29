package game_pckg.game;

import game_pckg.heroes.HunterHero;
import game_pckg.heroes.MageHero;
import game_pckg.heroes.WarriorHero;
import game_pckg.races.Dwarf;
import game_pckg.races.Elf;
import game_pckg.races.Human;

import java.util.ArrayList;
import java.util.Random;

public class Arena {
    static Player user = new Player("Br1k", new Character("Biba",
            new Elf(80.0, 15, 20, 2), new HunterHero()));
    static Player enemy1 = new Player("Bot1", new Character("Boba1",
            new Dwarf(100.0, 10, 15, 3), new WarriorHero()));
    static Player enemy2 = new Player("Bot2", new Character("Boba2",
            new Human(90.0, 12, 17, 2), new MageHero()));
    static Player enemy3 = new Player("Bot3", new Character("Boba3",
            new Elf(80.0, 15, 20, 2), new HunterHero()));

    static ArrayList<Player> enemies = new ArrayList<>();



    static void fight(Character player, Character enemy) throws InterruptedException {
        boolean victoryFlag = false;
        Character first = new Character(player);
        Character second = new Character(enemy);

        System.out.println("FIGHT!");

        while (first.getHealth() > 0 && second.getHealth() > 0) {

            Thread.sleep(1250);
            System.out.println("-----------------");
            printStats(first, second);
            if (!doDefense(first, second)) {
                second.setHealth(doOffense(first, second, first.getAttack()));
            }
            victoryFlag = printVictory(first, second);
            if (victoryFlag) {
                break;
            }

            Thread.sleep(1250);
            System.out.println("-----------------");
            printStats(first, second);
            if (!doDefense(second, first)) {
                first.setHealth(doOffense(second, first, second.getAttack()));
            }
            victoryFlag = printVictory(first, second);
            if (victoryFlag) {
                break;
            }

        }
    }

    public static double doOffense(Character offender, Character defender, int attack) {
        if (offender.tryAbility()) {
            System.out.print(offender + " hitted " + defender + " with");
            return offender.useOffensiveAbility(defender.getHealth(), defender.getArmor(), attack);
        } else
            System.out.println(offender + " hitted " + defender + " for " + attack);
        return defender.getHealth() - (attack - defender.getArmor());
    }

    public static boolean doDefense(Character offender, Character defender) {
        if (defender.tryAbility()) {
            System.out.println(offender + " hitted, but " + defender + defender.useDefensiveAbility());
            return true;
        } else
            return false;
    }


    static void printStats(Character first, Character second) {
        System.out.println(first.getName() + " HP(Armor) = " + first.getRace().getHealth() + "(" + first.getRace().getArmor() + ")"
                + " | " + second.getName() + " HP(Armor) = " + second.getRace().getHealth() + "(" + second.getRace().getArmor() + ")");
    }

    static boolean printVictory(Character first, Character second) {
        if (first.getRace().getHealth() <= 0) {
            System.out.println();
            printStats(first, second);
            System.out.println("\n~Enemy won the battle~");
            return true;
        } else if (second.getRace().getHealth() <= 0) {
            System.out.println();
            printStats(first, second);
            System.out.println("\n~You won the battle~");
            return true;
        }
        return false;
    }

    static Player getEnemy() {
        Random rand = new Random();
        return enemies.get(rand.nextInt(enemies.size()));
    }

    public static void main(String[] args) throws InterruptedException {
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);

        fight(user.getCharacter(), getEnemy().getCharacter());
    }
}
