package polymorphism;

public class Duck extends Animal {
    public Duck(String voiceName) {
        super(voiceName);
    }

    protected void say() {
        System.out.println("Duck said " + voiceName);
    }
}
