package game_pckg.classes;

public interface Classable {
    double useOffensiveAbility(double health, int armor, int attack);

    String useDefensiveAbility();

    boolean checkAbility();
}
