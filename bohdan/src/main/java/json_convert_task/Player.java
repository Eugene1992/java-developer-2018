package json_convert_task;

@JsonAcceptableType
public class Player {

    private String name;
    private int age;
    @JsonAcceptableField(name = "characters names")
    private String[] chars;
    private String league;

    public Player(String name, int age, String league, String... chars) {
        this.name = name;
        this.age = age;
        this.chars = chars;
        this.league = league;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }
}
