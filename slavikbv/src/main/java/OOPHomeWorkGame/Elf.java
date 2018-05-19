package OOPHomeWorkGame;

public class Elf extends Hero {
    private String name = "Elf";

    public Elf(String name, int health, int attack, int armor) {
        super(name, health, attack + 10, armor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}