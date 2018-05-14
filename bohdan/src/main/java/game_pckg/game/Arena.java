package game_pckg.game;

import game_pckg.classes.Hunter;
import game_pckg.classes.Mage;
import game_pckg.classes.Warrior;
import game_pckg.heroes.HunterHero;
import game_pckg.heroes.WarriorHero;
import game_pckg.races.Dwarf;
import game_pckg.races.Elf;

public class Arena {
    static Player user = new Player("br1k", new Character("Goga",
            new Elf(70.0, 10, 15, 2), new HunterHero()));
    static Player enemy = new Player("bot", new Character("bot",
            new Dwarf(100.0, 5, 10, 6), new WarriorHero()));

    static void fight(Character player, Character enemy) throws InterruptedException {
        double playerHealth = player.getRace().getHealth();
        double enemyHealth = enemy.getRace().getHealth();

        System.out.println("FIGHT!");
        while (playerHealth > 0 || enemyHealth > 0) {
            Thread.sleep(1000);
            enemyHealth = userTurn(player, enemy);
            Thread.sleep(1000);
            playerHealth = userTurn(player, enemy);
        }
        Thread.sleep(1000);
        if (playerHealth <= 0) {
            System.out.println("Enemy won the battle");
        } else if (enemyHealth <= 0) {
            System.out.println("You won the battle");
        } else {
            System.out.println("?Tied?");
        }
    }

    public static double userTurn(Character player, Character enemy) {
        Character user = new Character(player);
        Character bot = new Character(enemy);

        if (user.getHeroClass() instanceof Warrior || user.getHeroClass() instanceof Mage) {
            if (bot.getHeroClass() instanceof Warrior) {
                if (bot.checkAbility()) {
                    System.out.println(user + " hitted, but " + bot + bot.getHeroClass().useClassAbility());
                } else {
                    System.out.println(user + " hitted " + user.getAttack());
                    bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
                }
            } else if (bot.getHeroClass() instanceof Mage) {
                if (bot.checkAbility()) {
                    System.out.println(user + " hitted " + user.getAttack() + " and " + bot + bot.getHeroClass().useClassAbility());
                } else {
                    System.out.println(user + " hitted " + user.getAttack());
                    bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
                }
            } else {
                System.out.println(user + " hitted " + user.getAttack());
                bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
            }
        } else if (user.getHeroClass() instanceof Hunter) {
            if (bot.getHeroClass() instanceof Warrior) {
                if (bot.checkAbility()) {
                    System.out.println(user + " hitted, but " + bot + bot.getHeroClass().useClassAbility());
                } else {
                    if (user.checkAbility()) {
                        System.out.println(user + " hitted " + user.getAttack());
                        bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() * 2 - enemy.getRace().getArmor());
                    } else {
                        System.out.println(user + " hitted " + user.getAttack());
                        bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
                    }
                }
            } else if (bot.getHeroClass() instanceof Mage) {
                if (bot.checkAbility()) {
                    System.out.println(user + " hitted " + user.getAttack() + " and " + bot + bot.getHeroClass().useClassAbility());
                } else {
                    if (user.checkAbility()) {
                        System.out.println(user + " hitted " + user.getAttack());
                        bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() * 2 - enemy.getRace().getArmor());
                    } else {
                        System.out.println(user + " hitted " + user.getAttack());
                        bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
                    }
                }
            } else {
                if (user.checkAbility()) {
                    System.out.println(user + " hitted " + user.getAttack());
                    bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() * 2 - enemy.getRace().getArmor());
                } else {
                    System.out.println(user + " hitted " + user.getAttack());
                    bot.getRace().setHealth(bot.getRace().getHealth() - player.getAttack() - enemy.getRace().getArmor());
                }
            }
        }
        return bot.getRace().getHealth();
    }

    public static void main(String[] args) throws InterruptedException {
        fight(user.getCharacter(), enemy.getCharacter());
    }
}
