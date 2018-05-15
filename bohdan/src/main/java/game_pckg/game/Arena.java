package game_pckg.game;

import game_pckg.heroes.HunterHero;
import game_pckg.heroes.MageHero;
import game_pckg.heroes.WarriorHero;
import game_pckg.races.Dwarf;
import game_pckg.races.Elf;

public class Arena {
    static Player user = new Player("br1k", new Character("br1k",
            new Elf(80.0, 15, 20, 1), new HunterHero()));
    static Player enemy = new Player("Bot", new Character("bot",
            new Dwarf(100.0, 10, 15, 3), new WarriorHero()));

    static void fight(Character player, Character enemy) throws InterruptedException {
        boolean victoryFlag = false;
        Character first = new Character(player);
        Character second = new Character(enemy);

        System.out.println("FIGHT!");
        while (first.getRace().getHealth() > 0 && second.getRace().getHealth() > 0) {
            Thread.sleep(1250);
            System.out.println("-----------------");
            printStats(first, second);
            second.getRace().setHealth(turn(first, second));
            victoryFlag = printVictory(first, second);
            if (victoryFlag) {
                break;
            }
            Thread.sleep(1250);
            System.out.println("-----------------");
            printStats(first, second);
            first.getRace().setHealth(turn(second, first));
            victoryFlag = printVictory(first, second);
            if (victoryFlag) {
                break;
            }
        }
    }

    public static double turn(Character offender, Character defender) {
        int attack = offender.getAttack();
        if (offender.getHeroClass() instanceof WarriorHero || offender.getHeroClass() instanceof MageHero) {
            if (defender.getHeroClass() instanceof WarriorHero || offender.getHeroClass() instanceof MageHero) {
                if (defender.checkAbility()) {
                    System.out.println(offender + " hitted, but " + defender + defender.getHeroClass().useClassAbility());
                } else {
                    System.out.println(offender + " hitted " + attack);
                    defender.getRace().setHealth(defender.getRace().getHealth() - (attack - defender.getRace().getArmor()));
                }
            } else {
                System.out.println(offender + " hitted " + attack);
                defender.getRace().setHealth(defender.getRace().getHealth() - (attack - defender.getRace().getArmor()));
            }
        } else {
            if (defender.getHeroClass() instanceof WarriorHero || offender.getHeroClass() instanceof MageHero) {
                if (defender.checkAbility()) {
                    System.out.println(offender + " hitted, but " + defender + defender.getHeroClass().useClassAbility());
                } else {
                    if (offender.checkAbility()) {
                        System.out.println(offender + " hitted critical " + (attack * 2));
                        defender.getRace().setHealth(defender.getRace().getHealth() - (attack * 2 - defender.getRace().getArmor()));
                    } else {
                        System.out.println(offender + " hitted " + attack);
                        defender.getRace().setHealth((defender.getRace().getHealth() - (attack - defender.getRace().getArmor())));
                    }
                }
            } else {
                if (offender.checkAbility()) {
                    System.out.println(offender + " hitted critical " + (attack * 2));
                    defender.getRace().setHealth(defender.getRace().getHealth() - (attack * 2 - defender.getRace().getArmor()));
                } else {
                    System.out.println(offender + " hitted " + attack);
                    defender.getRace().setHealth(defender.getRace().getHealth() - (attack - defender.getRace().getArmor()));
                }
            }
        }
        return defender.getRace().getHealth();
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

    public static void main(String[] args) throws InterruptedException {
        fight(user.getCharacter(), enemy.getCharacter());
    }
}
