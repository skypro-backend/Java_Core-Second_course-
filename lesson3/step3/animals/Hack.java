package lesson3.step3.animals;

public class Hack extends Pet{
    public Hack(String name) {
        super(name);
    }

    public Hack(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public String getName() {
        return null;
    }
}
