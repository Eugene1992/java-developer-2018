package polymorphism;

public class Dog extends Animal {
    public Dog(String voiceName) {
        super(voiceName);
    }

    protected void say() {
        System.out.println("Dog said " + super.voiceName);
    }
}
