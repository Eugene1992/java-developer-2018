package game;

import java.util.ArrayList;

public class Player {
    protected String name;
    protected ArrayList<Hero> heroes;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(ArrayList<Hero> heroes) {
        this.heroes = heroes;
    }

    public int playerAttackMove() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int attack;
        for (int i = 0; i < this.heroes.size(); i++) {
            attack = this.heroes.get(i).attackMove();
            System.out.println(this.heroes.get(i).getName());
            System.out.println("Make Damage: " + attack);
            sum = sum + attack;
        }
        return sum;
    }

    public int playerBlockMove() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int block;
        for (int i = 0; i < this.heroes.size(); i++) {
            block = this.heroes.get(i).blockMove();
            System.out.println(this.heroes.get(i).getName());
            System.out.println("Block damage: " + block);
            sum = sum + block;
        }
        return sum;
    }

    public int playerHealMove() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int heal;
        for (int i = 0; i < this.heroes.size(); i++) {
            heal = this.heroes.get(i).healMove();
            System.out.println(this.heroes.get(i).getName());
            System.out.println("Heal damage: " + heal);
            sum = sum + heal;
        }
        return sum;
    }
}
