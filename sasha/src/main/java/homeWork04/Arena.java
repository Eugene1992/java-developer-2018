package homeWork04;

import java.util.ArrayList;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.setName("Player 1");
        player2.setName("Player 2");

        makeTeam(player1);
        for (int i = 0; i < player1.getHeroes().size(); i++) {
            System.out.println(player1.getHeroes().get(i).getName());
        }
    }

    public static Player makeTeam(Player player) {
        ArrayList<Hero> playersHeroes = new ArrayList<Hero>();
        System.out.println(player.getName() + " choose your team of 3 heroes");
        System.out.println("Press 1 to add Elf Hero");
        System.out.println("Press 2 to add Dwarf Hero");
        System.out.println("Press 3 to add Human Hero");

        System.out.println("Select yours first Hero");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1:
                playersHeroes.add(new Elf("Elf from " + player.getName() + " team", 100, 100, 15, 10));
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
        }

        System.out.println("Select yours second Hero");
        switch (in.nextInt()) {
            case 1:
                playersHeroes.add(new Elf("Elf from " + player.getName() + " team", 100, 100, 15, 10));
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
        }

        System.out.println("Select yours third Hero");
        switch (in.nextInt()) {
            case 1:
                playersHeroes.add(new Elf("Elf from " + player.getName() + " team", 100, 100, 15, 10));
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
        }

        player.setHeroes(playersHeroes);
        return player;
    }
}
