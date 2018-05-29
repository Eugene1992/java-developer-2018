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
        makeTeam(player2);

//        for (int i = 0; i < player1.getHeroes().size(); i++) {
//            System.out.println(player1.getHeroes().get(i).getName());
//        }

        playersHeroesFight(player1, player2);
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
                break;
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
                break;
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
                break;
        }

        System.out.println("Select yours second Hero");
        switch (in.nextInt()) {
            case 1:
                playersHeroes.add(new Elf("Elf from " + player.getName() + " team", 100, 100, 15, 10));
                break;
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
                break;
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
                break;
        }

        System.out.println("Select yours third Hero");
        switch (in.nextInt()) {
            case 1:
                playersHeroes.add(new Elf("Elf from " + player.getName() + " team", 100, 100, 15, 10));
                break;
            case 2:
                playersHeroes.add(new Dwarf("Dwarf from " + player.getName() + " team", 100, 100, 20, 10));
                break;
            case 3:
                playersHeroes.add(new Human("Human from " + player.getName() + " team", 100, 100, 20, 15));
                break;
        }

        player.setHeroes(playersHeroes);
        return player;
    }

    public static int playerAttackMove(Player player) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int attack;
        for (int i = 0; i < player.getHeroes().size(); i++) {
            attack = player.getHeroes().get(i).attackMove();
            System.out.println(player.getHeroes().get(i).getName());
            System.out.println("Make Damage: " + attack);
            sum = sum + attack;
        }
        return sum;
    }

    public static int playerBlockMove(Player player) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int block;
        for (int i = 0; i < player.getHeroes().size(); i++) {
            block = player.getHeroes().get(i).blockMove();
            System.out.println(player.getHeroes().get(i).getName());
            System.out.println("Block damage: " + block);
            sum = sum + block;
        }
        return sum;
    }

    public static int playerHealMove(Player player) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        int sum = 0;
        int heal;
        for (int i = 0; i < player.getHeroes().size(); i++) {
            heal = player.getHeroes().get(i).healMove();
            System.out.println(player.getHeroes().get(i).getName());
            System.out.println("Heal damage: " + heal);
            sum = sum + heal;
        }
        return sum;
    }

    public static void playersHeroesFight(Player player1, Player player2) {
        int k = 1;
        int attack;
        int block;
        int heal;
        while ((player1.getHeroes().size() > 0) && (player2.getHeroes().size() > 0)) {
            if (k == 1 && player1.getHeroes().size() > 0) {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                for (int i = 0; i < player2.getHeroes().size(); i++) {
                    System.out.println(player2.getHeroes().get(i).getName() + " have health " + player2.getHeroes().get(i).getHealth());
                    System.out.println(player2.getHeroes().get(i).getName() + " have armor " + player2.getHeroes().get(i).getArmor());
                }

                System.out.println(player1.getName() + " Move =======================");
                attack = playerAttackMove(player1);
                block = playerBlockMove(player2);
                heal = playerHealMove(player2);

                if ((block + heal) >= attack) {
                    System.out.println(player2.getName() + " Totaly blocked and healed enemies damage!!!!!!!!!!!!!!!!!!");
                    k = 2;
                } else {
                    if (player2.getHeroes().get(0).getArmor() <= 0) {
                        player2.getHeroes().get(0).setHealth(player2.getHeroes().get(0).getHealth() - attack + block + heal);
                    } else if (player2.getHeroes().get(0).getArmor() < (attack - block - heal) && player2.getHeroes().get(0).getArmor() > 0) {
                        player2.getHeroes().get(0).setHealth(player2.getHeroes().get(0).getHealth() - attack + block + heal + player2.getHeroes().get(0).getArmor());
                        player2.getHeroes().get(0).setArmor(0);
                    } else if (player2.getHeroes().get(0).getArmor() >= (attack - block - heal)) {
                        player2.getHeroes().get(0).setArmor(player2.getHeroes().get(0).getArmor() - attack + block + heal);
                    }
                    if (player2.getHeroes().get(0).getHealth() <= 0) {
                        player2.getHeroes().remove(0);
                    }
                    k = 2;
                }
            }

            if (k == 2 && player2.getHeroes().size() > 0) {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                for (int i = 0; i < player1.getHeroes().size(); i++) {
                    System.out.println(player1.getHeroes().get(i).getName() + " have health " + player1.getHeroes().get(i).getHealth());
                    System.out.println(player1.getHeroes().get(i).getName() + " have armor " + player1.getHeroes().get(i).getArmor());
                }

                System.out.println(player2.getName() + " Move =======================");
                attack = playerAttackMove(player2);
                block = playerBlockMove(player1);
                heal = playerHealMove(player1);

                if ((block + heal) >= attack) {
                    System.out.println(player1.getName() + " Totaly blocked and healed enemies damage!!!!!!!!!!!!!!!!!!");
                    k = 1;
                } else {
                    if (player1.getHeroes().get(0).getArmor() <= 0) {
                        player1.getHeroes().get(0).setHealth(player1.getHeroes().get(0).getHealth() - attack + block + heal);
                    } else if (player1.getHeroes().get(0).getArmor() < (attack - block - heal) && player1.getHeroes().get(0).getArmor() > 0) {
                        player1.getHeroes().get(0).setHealth(player1.getHeroes().get(0).getHealth() - attack + block + heal + player2.getHeroes().get(0).getArmor());
                        player1.getHeroes().get(0).setArmor(0);
                    } else if (player1.getHeroes().get(0).getArmor() >= (attack - block - heal)) {
                        player2.getHeroes().get(0).setArmor(player1.getHeroes().get(0).getArmor() - attack + block + heal);
                    }
                    if (player1.getHeroes().get(0).getHealth() <= 0) {
                        player1.getHeroes().remove(0);
                    }
                    k = 1;
                }
            }

        }

        if (player1.getHeroes().isEmpty()) {
            System.out.println(player2.getName() + " team won the battle");
        }
        if (player2.getHeroes().isEmpty()) {
            System.out.println(player1.getName() + " team won the battle");
        }
    }


}
