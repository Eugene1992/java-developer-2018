package polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("Meow");
        Animal dog = new Dog("Woof");
        Animal duck = new Duck("Quack");

        new Test().sayAllAnimals(cat, dog, duck);
    }

    public void sayAllAnimals(Animal... animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].say();
        }
    }

    public void sayAllAnimalsWP(Animal... animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                Cat cat = (Cat) animals[i];
                cat.say();
            }
            if (animals[i] instanceof Dog) {
                Dog dog = (Dog) animals[i];
                dog.say();
            }
            if (animals[i] instanceof Duck) {
                Duck duck = (Duck) animals[i];
                duck.say();
            }
        }
    }
}
