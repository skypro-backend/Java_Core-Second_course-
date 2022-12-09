package lesson3.step1.animals;

public class Dog extends Pet {
    public Dog(String name) {
        this(name, 0);
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
