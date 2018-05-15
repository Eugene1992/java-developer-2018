package OOPHomeWorkGame;

public class War {


    public static void main(String[] args) {
        int firstattack;

        Elf elfOne = new Elf("ElfOne", 50, 150, 30);
        Dwarf dwarfOne = new Dwarf("DwarfOne", 40, 30, 150);
        Human humanOne = new Human("HumanOne", 100, 30, 30);

        Elf elfTwo = new Elf("ElfTwo", 40, 130, 30);
        Dwarf dwarfTwo = new Dwarf("DwarfTwo", 50, 45, 170);
        Human humanTwo = new Human("HumanTwo", 90, 45, 60);

        Player plOne = new Player("plOne", elfOne, dwarfOne, humanOne);
        Player plTwo = new Player("plTwo", elfTwo, dwarfTwo, humanTwo);

        System.out.println("Fight");
        if (Math.random() <= 0.5) {
            firstattack = 1;
        } else {
            firstattack = 2;
        }

        if (firstattack == 1) {
            if (plTwo.sPlayerArmorPower() < plOne.sPlayerHitPower()) {
                System.out.println("Winner is " + plOne.getPlayerName());
            } else {
                System.out.println(plTwo.getPlayerName() + " is alive");
            }

            if (firstattack == 2) {
                if (plOne.sPlayerArmorPower() < plTwo.sPlayerHitPower()) {
                    System.out.println("Winner is " + plTwo.getPlayerName());
                } else {
                    System.out.println(plOne.getPlayerName() + " is alive");
                }
            }
        }

    }
}
