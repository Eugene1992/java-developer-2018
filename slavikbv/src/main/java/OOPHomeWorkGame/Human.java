package OOPHomeWorkGame;

public class Human extends Hero {
    private String name = "Human";

    public Human(String name, int health, int attack, int armor) {
        super(name, health + 10, attack, armor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
