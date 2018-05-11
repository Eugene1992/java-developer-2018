package polymorphism;

public class Animal {
    protected String voiceName;

    public Animal(String voiceName) {
        this.voiceName = voiceName;
    }

    protected void say() {
        System.out.println("Animal said " + voiceName);
    }
}
