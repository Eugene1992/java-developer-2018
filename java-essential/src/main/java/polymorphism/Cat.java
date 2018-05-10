package polymorphism;

public class Cat extends Animal {
    public Cat(String voiceName) {
        super(voiceName);
    }

    protected void say() {
        System.out.println("Cat said " + voiceName);
    }
}
