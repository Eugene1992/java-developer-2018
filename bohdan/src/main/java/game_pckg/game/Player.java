package game_pckg.game;

public class Player {
    private String username;
    private Character character;

    public Player(String username, Character character) {
        this.username = username;
        this.character = character;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return username;
    }
}
