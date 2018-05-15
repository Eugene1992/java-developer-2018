package OOPHomeWorkGame;

public class Dwarf extends Hero {
    private String name = "Dwarf";

    public Dwarf(String name, int health, int attack, int armor) {
        super(name, health, attack, armor + 10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
