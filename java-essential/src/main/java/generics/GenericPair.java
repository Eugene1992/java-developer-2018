package generics;

public class GenericPair<Nikita, Bohdan> {
    private Nikita key;
    private Bohdan value;

    public GenericPair(Nikita key, Bohdan value) {
        this.key = key;
        this.value = value;
    }

    public Nikita getKey() {
        return key;
    }

    public void setKey(Nikita key) {
        this.key = key;
    }

    public Bohdan getValue() {
        return value;
    }

    public void setValue(Bohdan value) {
        this.value = value;
    }
}
