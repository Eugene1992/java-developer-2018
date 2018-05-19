package OOPHomeWorkGame;

public class Player implements PlayerPower {
    private String playerName;
    private Elf elf;
    private Dwarf dwarf;
    private Human human;

    Player(String playerName, Elf elf, Dwarf dwarf, Human human) {
        this.playerName = playerName;
        this.elf = elf;
        this.dwarf = dwarf;
        this.human = human;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Elf getElf() {
        return elf;
    }

    public void setElf(Elf elf) {
        this.elf = elf;
    }

    public Dwarf getDwarf() {
        return dwarf;
    }

    public void setDwarf(Dwarf dwarf) {
        this.dwarf = dwarf;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public int sPlayerHitPower() {
        return elf.getAttack() + dwarf.getAttack() + human.getAttack();
    }

    @Override
    public int sPlayerArmorPower() {
        return elf.getArmor() + dwarf.getArmor() + human.getArmor();
    }

    @Override
    public int sPlayerHelthPower() {
        return elf.getHealth() + dwarf.getHealth() + human.getHealth();
    }
}
