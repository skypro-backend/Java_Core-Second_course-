package lesson3.step3.animals;

public class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Ем корм из кормушки");
    }
}
